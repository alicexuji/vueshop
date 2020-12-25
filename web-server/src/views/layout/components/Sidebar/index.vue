<template>
  <scroll-bar>
    <el-menu
        mode="vertical"
        :show-timeout="200"
        :default-active="$route.path"
        :collapse="isCollapse"
        background-color="#304156"
        text-color="#bfcbd9"
        active-text-color="#409EFF"
    >
      <router-link :to="{ name: 'home', params: {} }">
      <el-menu-item index="1">
        <template slot="title"><i class="el-icon-s-home"></i>首页</template>
      </el-menu-item>
      </router-link>
      <el-submenu index="2">
        <template slot="title"><i class="el-icon-s-goods"></i>商品</template>
        <el-menu-item-group>
          <router-link :to="{ name: 'productCate', params: {} }">
            <el-menu-item index="2-1">商品分类</el-menu-item>
          </router-link>
          <router-link :to="{ name: 'productList', params: {} }">
            <el-menu-item index="2-2">商品列表</el-menu-item>
          </router-link>
          <router-link :to="{ name: 'addProduct', params: {} }">
            <el-menu-item index="2-3">添加商品</el-menu-item>
          </router-link>
        </el-menu-item-group>
      </el-submenu>
      <el-submenu index="3">
        <template slot="title"><i class="el-icon-s-order"></i>订单</template>
        <el-menu-item-group>
          <router-link :to="{ name: 'order', params: {} }">
            <el-menu-item index="3-1">订单列表</el-menu-item>
          </router-link>
        </el-menu-item-group>
      </el-submenu>
    </el-menu>
  </scroll-bar>
</template>

<script>
import {mapGetters} from 'vuex'
import ScrollBar from '@/components/ScrollBar'

export default {
  components: {ScrollBar},
  computed: {
    ...mapGetters([
      'sidebar',
      'routers'
    ]),
    routes() {
      return this.$router.options.routes
      // return this.routers
    },
    isCollapse() {
      return false
    }
  }
}
</script>
