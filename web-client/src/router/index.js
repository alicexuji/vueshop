import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export const constantRouterMap = [
    {
        path: '/login',
        name: 'login',
        component: () => import('@/views/login/index')
    },
    {
        path: '',
        name: 'home',
        component: () => import('@/views/home/index'),
        meta: {title: '首页', icon: 'home', showHeaderTop: true, showHeaderSearch: true}
    },
    {
        path: '/search/:id',
        name: 'search',
        component: () => import('@/views/search/index'),
        meta: {showHeaderTop: true, showHeaderSearch: true}
    },
    {
        path: '/shopcar',
        name: 'shopcar',
        component: () => import('@/views/shopCar/index'),
        meta: {showHeaderTop: true}
    },
    {
        path: '/goods/:id',
        name: 'goodsDetail',
        component: () => import('@/views/goods/index'),
        meta: {showHeaderTop: true}
    },
    {
        path: '/createOrder',
        name: 'createOrder',
        component: () => import('@/views/order/createOrder'),
        meta: {showHeaderTop: true}
    },

]

export const asyncRouterMap = []

export default new Router({
    // mode: 'history', //后端支持可开
    // scrollBehavior: () => ({y: 0}),
    routes: constantRouterMap
})
