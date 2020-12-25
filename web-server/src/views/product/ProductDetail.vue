<template>
  <el-card class="form-container" shadow="never">
    <product-info-detail
      v-model="productParam"
      :is-edit="isEdit"
      @finishCommit="finishCommit">
    </product-info-detail>
  </el-card>
</template>
<script>
  import ProductInfoDetail from './ProductInfoDetail';
  import {createProduct,getProduct,updateProduct} from '@/api/product';

  const defaultProductParam = {
    albumPics: '',
    brandId: null,
    brandName: '',
    deleteStatus: 0,
    description: '',
    name: '',
    pic: '',
    sellPrice: 0,
    categoryId: '',
    publishStatus: 0,
    sale: 0,
  };
  export default {
    name: 'ProductDetail',
    components: {ProductInfoDetail},
    props: {
      isEdit: {
        type: Boolean,
        default: false
      }
    },
    data() {
      return {
        productParam: Object.assign({}, defaultProductParam)
      }
    },
    created(){
      if(this.isEdit){
        getProduct(this.$route.query.id).then(response=>{
          this.productParam=response.data;
        });
      }
    },
    methods: {
      finishCommit(isEdit) {
        this.$confirm('是否要提交该产品', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          console.log("productParam="+this.productParam);
          if(isEdit){
            updateProduct(this.$route.query.id,this.productParam).then(response=>{
              this.$message({
                type: 'success',
                message: '提交成功',
                duration:1000
              });
              this.$router.back();
            });
          }else{
            createProduct(this.productParam).then(response=>{
              this.$message({
                type: 'success',
                message: '提交成功',
                duration:1000
              });
              // location.reload();
              this.$router.back();
            });
          }
        })
      }
    }
  }
</script>
<style>
  .form-container {
    width: 800px;
  }
</style>
