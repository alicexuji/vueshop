<template>
  <div class="pro">
    <img :src="pro.picUrl" class="pro_img">
    <div class="pro_text">
      <p>{{ pro.name }}</p>
      <p><em>{{ "￥" + pro.sellPrice }}</em></p>
      <p style="margin-left: 20px;text-align: left">{{ "月销" + pro.sale }}</p>
    </div>
    <div>
      <a @click="addToCart(pro)" class="shopping_bag"><i class="el-icon-shopping-cart-2"></i></a>
      <a @click="goDetail(pro)" class="add_btn">
        <el-button type="danger">查看详情</el-button>
      </a>
    </div>
  </div>
</template>

<script>

import {getCookie} from "@/utils/support";
import {addGoodsToCart} from "@/api";
import {MessageBox} from "element-ui";

export default {
  props: {
    pro: {
      type: Object,
      required: true
    }
  },
  methods: {
    goDetail(id) {
      this.$router.replace('/goods/' + id);
    },
    addToCart(goods) {

      let cartParam = {
        'goodsId': goods.id,
        'count': 1,
        'goodsPicurl': goods.picUrl,
        'goodsName': goods.name,
        'username': getCookie("username"),
        'price': goods.sellPrice,
        'checked': 0
      }
      console.log(cartParam);
      addGoodsToCart(cartParam).then(response => {
        MessageBox({
          type: 'success',
          message: '添加成功,在购物车等亲哦~',
          showClose: true,
        });
      });
    }
  }
}
</script>

<style scoped>
.pro {
  float: left;
  position: relative;
  width: 300px;
  height: 100%;
  background: white;
  display: inline;
  border: 1px solid #e6e6e6;
  margin: 5px 10px 10px 0;
}

.pro > .pro_img {
  margin: 20px;
  width: 120px;
  height: 120px;
}

.pro > .pro_text {
  height: 130px;
  line-height: 25px;
}

.pro_text > p {
  margin-bottom: 10px;
}

.pro_text > p:first-child {
  font-size: 13px;
}

.pro_text > p:nth-child(2) {

  color: red;
  font-weight: 900;
}

.pro_text > p:nth-child(3) {
  font-size: 12px;
  color: #999;
}

.add_btn {
  position: absolute;
  bottom: 15px;
  right: 20px;
}
.shopping_bag{
  position: absolute;
  bottom: 15px;
  left: 100px;
  background: #f8f9fa;
  color: red;
  cursor: pointer;
  width: 60px;
  height: 35px;
  text-align: center;
  line-height: 35px;
}
.add_btn > a button {
  padding: 0;
  width: 90px;
  height: 30px;
  outline: none;

  display: flex;
  justify-content: center;
  align-items: center;
}
</style>
