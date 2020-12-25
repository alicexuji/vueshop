<template>
  <div class="app-container">
    <product-cate-detail :is-edit='false'></product-cate-detail>
  </div>
</template>
<script>
  import ProductCateDetail from './ProductCateDetail'
  export default {
    name: 'addProductCate',
    components: { ProductCateDetail }
  }
</script>
<style>
</style>
