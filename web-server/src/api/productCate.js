import request from '@/utils/request'
export function fetchList(params) {
  return request({
    url:'/productCategory/list',
    method:'get',
    params:params
  })
}
export function deleteProductCate(id) {
  return request({
    url:'/productCategory/delete/'+id,
    method:'post'
  })
}

export function createProductCate(data) {
  return request({
    url:'/productCategory/create',
    method:'post',
    data:data
  })
}

export function updateProductCate(id,data) {
  return request({
    url:'/productCategory/update/'+id,
    method:'post',
    data:data
  })
}

export function getProductCate(id) {
  return request({
    url:'/productCategory/'+id,
    method:'get',
  })
}

export function updateShowStatus(params) {
  return request({
    url:'/productCategory/update/showStatus',
    method:'post',
    data:params
  })
}

