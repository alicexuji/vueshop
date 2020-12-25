<template>
  <div id="home">
    <div id="container">
      <el-row>
        <!-- 一级菜单 -->
        <el-col :span="4" :offset="1" class="cateList">
          <div class="cate_img" style="text-align: left">
            <i class="el-icon-office-building"></i>
            商品分类
          </div>
          <el-menu
              class="el-menu-vertical-demo"
              background-color="#545c64"
              text-color="#fff">
            <el-menu-item index="cate.id" v-for="(cate) in categoryList" :key="cate.id" @click="getRList(cate.id)"
                          style="text-align: left">
              <i class="el-icon-collection-tag"></i>
              <span slot="title">{{ cate.categoryName }}</span>
            </el-menu-item>
          </el-menu>
        </el-col>
        <!--轮播图-->
        <el-col :span="14" style="width: 78%;height: 100%;">
          <el-carousel v-if="homecasual.length > 0" style="width: 100%;height: 100%;padding-top: 20px">
            <el-carousel-item v-for="url in homecasual" :key="url" style="width: 100%;height: 100%;">
              <img :src="url" alt="">
            </el-carousel-item>
          </el-carousel>
        </el-col>
      </el-row>
      <!-- 分类产品展示区域 -->
      <div class="pro_show">
        <ProductItem v-for="pro in homeshoplist" :key="pro.id" :pro="pro"/>
      </div>
    </div>
  </div>
</template>

<script>
import {fetchList, getHomeShopList} from '@/api/index'
import ProductItem from '@/components/ProductItem'
import DrawerSection from './DrawerSection/DrawerSection'

export default {
  name: 'home',
  data() {
    return {
      homecasual: [
        'https://img2.epetbar.com/2020-12/22/16/5b73d6bc7c1c06cbc6da897637309da4.jpg?x-oss-process=style/water',
        'https://img2.epetbar.com/2020-12/22/18/4ba1b4cb95a4aa9e2faf634cd6f24c7e.jpg?x-oss-process=style/water',
        'https://img2.epetbar.com/2020-12/22/18/4ba1b4cb95a4aa9e2faf634cd6f24c7e.jpg?x-oss-process=style/water',
        'https://img2.epetbar.com/2020-12/22/17/2db78e6dba0703ddbae9161b4c8a08d8.jpg?x-oss-process=style/water',
        'https://img2.epetbar.com/2020-12/23/09/fbb6b4bf3249a2fd530dd71ed5ec37a6.jpg?x-oss-process=style/water',
        'https://img2.epetbar.com/2020-12/22/16/5b73d6bc7c1c06cbc6da897637309da4.jpg?x-oss-process=style/water'
      ],
      homeshoplist: [],
      categoryList: [],
      total: null,
      listLoading: false,
      listQuery: {
        pageNum: 1,
        pageSize: 50
      },
      parentId: 0
    }
  },
  components: {
    DrawerSection,
    ProductItem
  },
  created() {
    this.getCatergoryList();
    this.queryHomeShopList();
  },
  methods: {
    getCatergoryList() {
      fetchList(this.parentId, this.listQuery).then(response => {
        this.categoryList = response.data.list;
      });
    },
    getRList(cate_id) {
      this.$router.replace('/search/' + cate_id);
    },
    queryHomeShopList() {
      getHomeShopList(this.listQuery).then(response => {

        this.homeshoplist = response.data.list;
      });
    },
    goShopCar() {
      // if(getCookie("username")){
      this.$router.replace('/shopcar');
      // }else{
      //   MessageBox({
      //     type: 'info',
      //     message: "请先登录!",
      //     showClose: true,
      //   });
      // }
    },
  }
};
</script>

<style lang="css" scoped>
#home {
  font-family: "Microsoft YaHei";
}

/*产品展示、购买、分类简介区*/
#container {
  position: relative;
  margin: 60px auto;
  width: 100%;
  background: rgba(245, 245, 245, 0.5);
}

#container .el-row .el-col {
  height: 100%;
}

.el-row .cateList .cate_img {
  width: 100%;
  text-indent: 14px;
  height: 40px;
  color: white;
  line-height: 40px;
  font-size: 16px;
  background: #F10215;
}

/*自动播放图片区域*/
.el-col .el-carousel {
  height: 100%;
  border-top: 2px solid #FF0036;
}

.el-carousel .el-carousel__item img {
  height: 100%;
  width: 100%;
}

/*一级菜单*/

/*展示登录信息区域*/
#container .el-row .con_log.el-col {
  background: white;
  text-align: center;
  font-size: 15px;
  color: #989898;
  border: 1px solid #ccc;
  height: 320px;
}

.con_log > div {
  margin-top: -30px;
  margin-left: 75px;
  margin-bottom: 60px;
  width: 70px;
  height: 70px;
}

.con_log > div > img {
  width: 100%;
  height: 100%;
  border-radius: 50%;
  box-shadow: 3px 3px 5px 5px #E3E3E3;
}

.con_log > p {
  margin-bottom: 20px;
}

.con_log > p > a {
  font-size: 13px;
  margin-right: 10px;
  margin-bottom: 5px;
  color: #666;
  cursor: pointer;
  text-decoration: none;
}

.con_log > .userIn > a {
  display: block;
}

.con_log > p > a:hover {
  color: red;
  font-weight: 700;
}

.con_log > button {
  margin-right: 5px;
  width: 70px;
  height: 25px;
  line-height: 25px;
  font-size: 12px;
  text-align: center;
  border-radius: 13px;
  box-shadow: 6px 8px 20px rgba(45, 45, 45, 0.15);
  transition: background 0.3s ease, color 0.3s ease;
  outline: none;
  border: none;
}

.con_log > button.welfare {
  color: #e43f3b;
  background: white;
}

.con_log > button.vip {
  color: #e5d790;
  background: #2d2d2a;
}

.con_log > button:hover {
  color: white;
  background: #e43f3b;
}

/*每类产品的简单展示*/
#container > .product {
  margin-top: 50px;
  width: 100%;
  height: 300px;
}

.product > .pro_line {
  width: 100%;
  height: 50px;
  text-align: center;
  line-height: 50px;
  font-size: 26px;
  font-family: sans-serif;
  font-weight: normal;
  color: #222;
  margin-bottom: 20px;
}

.pro_line > h3 {
  display: inline-block;
}

.pro_line > div {
  display: inline-block;
  margin-left: 15px;
  cursor: pointer;
}

.pro_line > div > a {
  color: red;
  font-weight: 700;
  font-size: 17px;
  text-decoration: none;
  transition: 0.5s;
}

.pro_line > div > a:after {
  content: '»';
  opacity: 0; /*opacity属性不占用文档流的空间*/
  transition: 0.5s;
}

.pro_line > div:hover a:after {
  opacity: 1;
}

.product > .pro_show {
  /*margin: 0 auto;*/
  padding-left: 20px;
  /*width: 980px;*/
  height: 200px;
}

</style>
