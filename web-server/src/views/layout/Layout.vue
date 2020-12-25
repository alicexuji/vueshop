<template>
  <div class="app-wrapper">
    <sidebar class="sidebar-container"></sidebar>
    <div class="main-container">
      <navbar></navbar>
      <app-main></app-main>
    </div>
  </div>
</template>

<script>
import { Navbar, Sidebar, AppMain } from './components'
import ResizeMixin from './mixin/ResizeHandler'

export default {
  name: 'layout',
  components: {
    Navbar,
    Sidebar,
    AppMain
  },
  mixins: [ResizeMixin],
  computed: {
    // sidebar() {
    //   return this.$store.state.app.sidebar
    // },
    // device() {
    //   return this.$store.state.app.device
    // },
    // classObj() {
    //   return {
    //     hideSidebar: !this.sidebar.opened,
    //     withoutAnimation: this.sidebar.withoutAnimation,
    //     mobile: this.device === 'mobile'
    //   }
    // }
  }
}
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
@import "src/styles/mixin.scss";
.app-wrapper {
  @include clearfix;
  position: relative;
  height: 100%;
  width: 100%;
}
</style>

<!--<template>-->
<!--<div class="app-wrapper">-->
<!--  <el-container style="height: 500px; border: 1px solid #eee">-->
<!--    <el-aside width="200px" style="background-color: rgb(238, 241, 246)">-->
<!--      <el-menu :default-openeds="['1']" default-active="1">-->
<!--        <el-menu-item index="1">-->
<!--          <template slot="title"><i class="el-icon-s-home"></i>首页</template>-->
<!--        </el-menu-item>-->
<!--        <el-submenu index="2">-->
<!--          <template slot="title"><i class="el-icon-s-goods"></i>商品</template>-->
<!--          <el-menu-item-group>-->
<!--            <router-link :to="{ name: 'productCate', params: {} }">-->
<!--              <el-menu-item index="2-1">商品分类</el-menu-item>-->
<!--            </router-link>-->
<!--            <router-link :to="{ name: 'productList', params: {} }">-->
<!--              <el-menu-item index="2-2">商品列表</el-menu-item>-->
<!--            </router-link>-->
<!--            <router-link :to="{ name: 'addProduct', params: {} }">-->
<!--              <el-menu-item index="2-3">添加商品</el-menu-item>-->
<!--            </router-link>-->
<!--          </el-menu-item-group>-->
<!--        </el-submenu>-->
<!--        <el-submenu index="3">-->
<!--          <template slot="title"><i class="el-icon-s-order"></i>订单</template>-->
<!--          <el-menu-item-group>-->
<!--            <router-link :to="{ name: 'order', params: {} }">-->
<!--              <el-menu-item index="3-1">订单列表</el-menu-item>-->
<!--            </router-link>-->
<!--          </el-menu-item-group>-->
<!--        </el-submenu>-->
<!--      </el-menu>-->
<!--    </el-aside>-->
<!--    <div class="main-container" style="width: 100%;margin-left:0px">-->
<!--      <breadcrumb style="display:block;margin-left: 20px;"></breadcrumb>-->
<!--      <router-view />-->
<!--    </div>-->
<!--  </el-container>-->
<!--</div>-->
<!--</template>-->

<!--<script>-->
<!--import Breadcrumb from '@/components/Breadcrumb'-->
<!--// import { Navbar, Sidebar, AppMain } from './components'-->
<!--// import ResizeMixin from './mixin/ResizeHandler'-->

<!--export default {-->
<!--  name: 'layout',-->
<!--  components: {-->
<!--    Breadcrumb-->
<!--    //   Sidebar,-->
<!--    //   AppMain-->
<!--  },-->
<!--  // mixins: [ResizeMixin],-->
<!--  computed: {-->
<!--    // sidebar() {-->
<!--    //   return this.$store.state.app.sidebar-->
<!--    // },-->
<!--    //   device() {-->
<!--    //     return this.$store.state.app.device-->
<!--    //   },-->
<!--    //   classObj() {-->
<!--    //     return {-->
<!--    //       hideSidebar: !this.sidebar.opened,-->
<!--    //       withoutAnimation: this.sidebar.withoutAnimation,-->
<!--    //       mobile: this.device === 'mobile'-->
<!--    //     }-->
<!--    //   }-->
<!--  }-->
<!--}-->
<!--</script>-->

<!--<style rel="stylesheet/scss" lang="scss" scoped>-->
<!--@import "src/styles/mixin.scss";-->
<!--.app-wrapper {-->
<!--    @include clearfix;-->
<!--    position: relative;-->
<!--    height: 100%;-->
<!--    width: 100%;-->
<!--}-->
<!--</style>-->
