import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

import Layout from '../views/layout/Layout'

export const constantRouterMap = [
  {
    path: '/login',
    name: 'login',
    component: () => import('@/views/login/index')
  },
  // {path: '/404', component: () => import('@/views/404'), hidden: true},

  {
    path: '',
    component: Layout,
    redirect: '/home',
    children: [{
      path: 'home',
      name: 'home',
      component: () => import('@/views/home/index'),
      meta: {title: '首页', icon: 'home'}
    }]
  },
  {
    path: '',
    component: Layout,
    redirect: '/product',
    meta: {title: '商品', icon: 'product'},
    children: [{
      path: '/productList',
      name: 'productList',
      component: () => import('@/views/product/index'),
      meta: {title: '商品列表', icon: 'product-list'}
    },
      {
        path: '/productCate',
        name: 'productCate',
        component: () => import('@/views/productCate/index'),
        meta: {title: '商品分类', icon: 'product-cate'}
      },
      {
        path: 'addProductCate',
        name: 'addProductCate',
        component: () => import('@/views/productCate/add'),
        meta: {title: '添加商品分类'},
        hidden: true
      },
      {
        path: 'updateProductCate',
        name: 'updateProductCate',
        component: () => import('@/views/productCate/update'),
        meta: {title: '修改商品分类'},
        hidden: true
      },
      {
        path: 'addProduct',
        name: 'addProduct',
        component: () => import('@/views/product/add'),
        meta: {title: '添加商品', icon: 'product-add'}
      },
      {
        path: 'updateProduct',
        name: 'updateProduct',
        component: () => import('@/views/product/update'),
        meta: {title: '修改商品', icon: 'product-add'},
        hidden: true
      }]
  },
  {
    path: '',
    component: Layout,
    redirect: '/order',
    name: 'order',
    meta: {title: '订单', icon: 'order'},
    children: [
      {
        path: 'order',
        name: 'order',
        component: () => import('@/views/order/index'),
        meta: {title: '订单列表', icon: 'product-list'}
      },
      {
        path: 'orderDetail',
        name: 'orderDetail',
        component: () => import('@/views/order/orderDetail'),
        meta: {title: '订单详情'},
        hidden:true
      },
      {
        path: 'deliverOrderList',
        name: 'deliverOrderList',
        component: () => import('@/views/order/deliverOrderList'),
        meta: {title: '发货列表'},
        hidden:true
      }
    ]
  }

]

export const asyncRouterMap = [

  // {
  //   path: '',
  //   component: Layout,
  //   redirect: '/product',
  //   meta: {title: '商品', icon: 'product'},
  //   children: [{
  //     path: 'product',
  //     name: 'product',
  //     component: () => import('@/views/product/index'),
  //     meta: {title: '商品列表', icon: 'product-list'}
  //   },
  //     {
  //       path: 'addProduct',
  //       name: 'addProduct',
  //       component: () => import('@/views/pms/product/add'),
  //       meta: {title: '添加商品', icon: 'product-add'}
  //     },
  //     {
  //       path: 'updateProduct',
  //       name: 'updateProduct',
  //       component: () => import('@/views/pms/product/update'),
  //       meta: {title: '修改商品', icon: 'product-add'},
  //       hidden: true
  //     },
  //     {
  //       path: 'productCate',
  //       name: 'productCate',
  //       component: () => import('@/views/pms/productCate/index'),
  //       meta: {title: '商品分类', icon: 'product-cate'}
  //     },
  //     {
  //       path: 'addProductCate',
  //       name: 'addProductCate',
  //       component: () => import('@/views/pms/productCate/add'),
  //       meta: {title: '添加商品分类'},
  //       hidden: true
  //     },
  //     {
  //       path: 'updateProductCate',
  //       name: 'updateProductCate',
  //       component: () => import('@/views/pms/productCate/update'),
  //       meta: {title: '修改商品分类'},
  //       hidden: true
  //     },
  //     {
  //       path: 'productAttr',
  //       name: 'productAttr',
  //       component: () => import('@/views/pms/productAttr/index'),
  //       meta: {title: '商品类型', icon: 'product-attr'}
  //     },
  //     {
  //       path: 'productAttrList',
  //       name: 'productAttrList',
  //       component: () => import('@/views/pms/productAttr/productAttrList'),
  //       meta: {title: '商品属性列表'},
  //       hidden: true
  //     },
  //     {
  //       path: 'addProductAttr',
  //       name: 'addProductAttr',
  //       component: () => import('@/views/pms/productAttr/addProductAttr'),
  //       meta: {title: '添加商品属性'},
  //       hidden: true
  //     },
  //     {
  //       path: 'updateProductAttr',
  //       name: 'updateProductAttr',
  //       component: () => import('@/views/pms/productAttr/updateProductAttr'),
  //       meta: {title: '修改商品属性'},
  //       hidden: true
  //     }
  //   ]
  // },
  // {
  //   path: '/oms',
  //   component: Layout,
  //   redirect: '/oms/order',
  //   name: 'oms',
  //   meta: {title: '订单', icon: 'order'},
  //   children: [
  //     {
  //       path: 'order',
  //       name: 'order',
  //       component: () => import('@/views/oms/order/index'),
  //       meta: {title: '订单列表', icon: 'product-list'}
  //     },
  //     {
  //       path: 'orderDetail',
  //       name: 'orderDetail',
  //       component: () => import('@/views/oms/order/orderDetail'),
  //       meta: {title: '订单详情'},
  //       hidden:true
  //     },
  //     {
  //       path: 'deliverOrderList',
  //       name: 'deliverOrderList',
  //       component: () => import('@/views/oms/order/deliverOrderList'),
  //       meta: {title: '发货列表'},
  //       hidden:true
  //     },
  //     {
  //       path: 'orderSetting',
  //       name: 'orderSetting',
  //       component: () => import('@/views/oms/order/setting'),
  //       meta: {title: '订单设置', icon: 'order-setting'}
  //     }
  //   ]
  // },
  // {
  //   path:'/ums',
  //   component: Layout,
  //   redirect: '/ums/admin',
  //   name: 'ums',
  //   meta: {title: '权限', icon: 'ums'},
  //   children: [
  //     {
  //       path: 'admin',
  //       name: 'admin',
  //       component: () => import('@/views/ums/admin/index'),
  //       meta: {title: '用户列表', icon: 'ums-admin'}
  //     },
  //     {
  //       path: 'role',
  //       name: 'role',
  //       component: () => import('@/views/ums/role/index'),
  //       meta: {title: '角色列表', icon: 'ums-role'}
  //     },
  //     {
  //       path: 'allocMenu',
  //       name: 'allocMenu',
  //       component: () => import('@/views/ums/role/allocMenu'),
  //       meta: {title: '分配菜单'},
  //       hidden: true
  //     },
  //     {
  //       path: 'allocResource',
  //       name: 'allocResource',
  //       component: () => import('@/views/ums/role/allocResource'),
  //       meta: {title: '分配资源'},
  //       hidden: true
  //     },
  //     {
  //       path: 'menu',
  //       name: 'menu',
  //       component: () => import('@/views/ums/menu/index'),
  //       meta: {title: '菜单列表', icon: 'ums-menu'}
  //     },
  //     {
  //       path: 'addMenu',
  //       name: 'addMenu',
  //       component: () => import('@/views/ums/menu/add'),
  //       meta: {title: '添加菜单'},
  //       hidden: true
  //     },
  //     {
  //       path: 'updateMenu',
  //       name: 'updateMenu',
  //       component: () => import('@/views/ums/menu/update'),
  //       meta: {title: '修改菜单'},
  //       hidden: true
  //     }
  //   ]
  // },
  // {path: '*', redirect: '/404', hidden: true}
]

export default new Router({
  // mode: 'history', //后端支持可开
  // scrollBehavior: () => ({y: 0}),
  routes: constantRouterMap
})
