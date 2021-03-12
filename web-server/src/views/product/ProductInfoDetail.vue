<template>
  <div>
    <el-form :model="value" :rules="rules" ref="productInfoForm" label-width="120px" style="width: 600px" size="small">
      <el-form-item label="商品分类：" prop="categoryId">
        <el-select
            v-model="value.categoryId"
            @change="getCateNameById"
            placeholder="请选择商品分类" style="float: left">
        <el-option
            v-for="item in productCateOptions"
            :key="item.value"
            :label="item.label"
            :value="item.value">
        </el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="商品名称：" prop="name">
        <el-input v-model="value.name" placeholder="请输入商品名称"></el-input>
      </el-form-item>
      <el-form-item label="销量：" prop="subTitle">
        <el-input v-model="value.sale" placeholder="请输入销量"></el-input>
      </el-form-item>
      <el-form-item label="商品品牌：" prop="brandId">
        <el-select
          v-model="value.brandId"
          @change="handleBrandChange"
          placeholder="请选择品牌" style="float: left">
          <el-option
            v-for="item in brandOptions"
            :key="item.value"
            :label="item.label"
            :value="item.value">
          </el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="商品介绍：">
        <el-input
          :autoSize="true"
          v-model="value.description"
          type="textarea"
          placeholder="请输入内容"></el-input>
      </el-form-item>
      <el-form-item label="商品上架：">
        <el-switch
            v-model="value.publishStatus"
            :active-value="1"
            :inactive-value="0">
        </el-switch>
      </el-form-item>
      <el-form-item label="商品售价：">
        <el-input v-model="value.sellPrice"></el-input>
      </el-form-item>
      <el-form-item label="商品图片：" v-if="true">
        <el-card shadow="never" class="cardBg">
          <single-upload v-model="value.picUrl"
                         style="width: 300px;display: inline-block;margin-left: 10px"></single-upload>
        </el-card>
      </el-form-item>
      <el-form-item style="text-align: center">
      <el-button type="primary" size="medium" @click="handleFinishCommit">完成，提交商品</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
import {fetchList} from '@/api/productCate'
import {fetchList as fetchBrandList} from '@/api/brand'
import SingleUpload from '@/components/Upload/singleUpload'

  export default {
    name: "ProductInfoDetail",
    components: {SingleUpload},
    props: {
      value: Object,
      isEdit: {
        type: Boolean,
        default: false
      }
    },
    data() {
      return {
        parentId: 0,
        hasEditCreated:false,
        //选中商品分类的值
        selectProductCateValue: '',
        productCateOptions: [],
        //选中的商品图片
        selectProductAttrPics: [],
        brandOptions: [],
        listQuery: {
          pageNum: 1,
          pageSize: 50,
          display:1
        },
        rules: {
          name: [
            {required: true, message: '请输入商品名称', trigger: 'blur'},
            {min: 2, max: 140, message: '长度在 2 到 140 个字符', trigger: 'blur'}
          ],
          sale: [{required: false, message: '请输入销量', trigger: 'blur'}],
          categoryId: [{required: true, message: '请选择商品分类', trigger: 'blur'}],
          brandId: [{required: false, message: '请选择商品品牌', trigger: 'blur'}],
          description: [{required: true, message: '请输入商品介绍', trigger: 'blur'}]
        }
      };
    },
    created() {
      this.getProductCateList();
      this.getBrandList();
    },
    computed:{
      //商品的编号
      productId(){
        return this.value.id;
      },
      //商品的主图和画册图片
      selectProductPics:{
        get:function () {
          let pics=[];
          if(this.value.picUrl===undefined||this.value.picUrl==null||this.value.picUrl===''){
            return pics;
          }
          pics.push(this.value.pic);
          if(this.value.albumPics===undefined||this.value.albumPics==null||this.value.albumPics===''){
            return pics;
          }
          let albumPics = this.value.albumPics.split(',');
          for(let i=0;i<albumPics.length;i++){
            pics.push(albumPics[i]);
          }
          return pics;
        },
        set:function (newValue) {
          if (newValue == null || newValue.length === 0) {
            this.value.picUrl = null;
          } else {
            this.value.picUrl = newValue;
          }
        }
      }
    },
    watch: {
      productId:function(newValue){
        if(!this.isEdit)return;
        if(this.hasEditCreated)return;
        if(newValue===undefined||newValue==null||newValue===0)return;
        this.handleEditCreated();
      },
      selectProductCateValue: function (newValue) {
        if (newValue != null && newValue.length === 2) {
          this.value.categoryId = newValue[1];
          this.value.categoryName= this.getCateNameById(this.value.categoryId);
        } else {
          this.value.categoryId = null;
          this.value.categoryName=null;
        }
      }
    },
    methods: {
      //处理编辑逻辑
      handleEditCreated(){
        if(this.value.categoryId!=null){
          // this.selectProductCateValue.push(this.value.categoryId);
        }
        this.hasEditCreated=true;
      },
      getProductCateList() {
        fetchList(this.listQuery).then(response => {
          this.listLoading = false;
          let list = response.data.list;

          for (let i = 0; i < list.length; i++) {
            this.productCateOptions.push({label: list[i].categoryName, value: list[i].id});
          }
        });

      },
      getBrandList() {
        fetchBrandList({pageNum: 1, pageSize: 100}).then(response => {
          this.brandOptions = [];
          let brandList = response.data.list;
          for (let i = 0; i < brandList.length; i++) {
            this.brandOptions.push({label: brandList[i].brandName, value: brandList[i].id});
          }
        });
      },
      getCateNameById(id){
        let name=null;
        for(let i=0;i<this.productCateOptions.length;i++){
          name=this.productCateOptions[i].label;
          return name;
        }
      },
      handleFinishCommit(){
        this.$emit('finishCommit',this.isEdit);
      },
      handleBrandChange(val) {
        let brandName = '';
        for (let i = 0; i < this.brandOptions.length; i++) {
          if (this.brandOptions[i].value === val) {
            brandName = this.brandOptions[i].label;
            break;
          }
        }
        this.value.brandName = brandName;
      }
    }
  }
</script>

<style scoped>
.cardBg {
  background: #F8F9FC;
}
</style>
