import request from '@/utils/request'

export function login(username, password) {
    return request({
        url: '/admin/login',
        method: 'post',
        data: {
            username,
            password
        }
    })
}

export function register(username, password) {
    return request({
        url: '/admin/register',
        method: 'post',
        data: {
            username,
            password
        }
    })
}

export function getInfo() {
    return request({
        url: '/admin/info',
        method: 'get',
    })
}

export function logout() {
    return request({
        url: '/admin/logout',
        method: 'post'
    })
}

export function fetchList(parentId, params) {
    return request({
        url: '/productCategory/list/' + parentId,
        method: 'get',
        params: params
    })
}

export function getProduct(id) {
    return request({
        url: '/product/updateInfo/' + id,
        method: 'get',
    })
}

// 请求首页的商品数据
export function getHomeShopList(params) {
    return request({
        url: '/product/list',
        method: 'get',
        params: params
    })
}

//根据分类查询商品
export function getProductListByCategory(data) {
    return request({
        url: '/product/list',
        method: 'post',
        data: data
    })
}

// 加入购物车
export function addGoodsToCart(data) {
    return request({
        url: '/cartGoods/add',
        method: 'post',
        data: data
    })

}

//删除购车商品
export function deleteGoods(id) {
    return request({
        url: '/cartGoods/delete/' + id,
        method: 'post'
    })
}

//修改购物车
export function updateGoodsCart(id, data) {
    return request({
        url: '/cartGoods/update/' + id,
        method: 'post',
        data: data
    })
}

// 请求购物车的数据
export function getCartsGoods(params) {
    return request({
        url: '/cartGoods/list',
        method: 'get',
        params: params
    })

}

export function createOrder(data) {
    return request({
        url: '/order/create',
        method: 'post',
        data: data
    })

}

export function getHomeCasual() {
    return request({
        url: '/homecasual',
        method: 'get'
    })
}

export function getAllgoods() {
    return request({
        url: '/product/list',
        method: 'get'
    })
}

// 请求商品详细数据
export function getGoodsDetail(param) {
    return request({
        url: '/product/list',
        method: 'get',
        param: param
    })
}



// 获取登录的用户信息
export function getUserInfo(param) {
    return request({
        url: '/',
        method: 'get',
        param: param
    })
}



// 修改用户手机
export function changeUserPhone(param) {
    return request({
        url: '/',
        method: 'get',
        param: param
    })
}


// 单个商品数量的改变
export function changeGoodsCount(param) {
    return request({
        url: '/',
        method: 'get',
        param: param
    })
}


// 删除所有商品
export function deleteAllGoods(param) {
    return request({
        url: '/',
        method: 'get',
        param: param
    })
}


// 关键词搜索
export function searchKeywords(param) {
    return request({
        url: '/',
        method: 'get',
        param: param
    })
}

