import fetch from '@/utils/fetch'

export function listAreaRequest(data) {
  
  return fetch({
    url: '/area/list',
    method: 'post',
    data
  })
}


export function getAreaRequest(data) {
  
  return fetch({
    url: '/area/getArea',
    method: 'post',
    data
  })
}

export function areaChildRequest(data) {
  
  return fetch({
    url: '/area/listChild',
    method: 'post',
    data
  })
}

export function addAreaRequest(data) {
  return fetch({
    url: '/area/add',
    method: 'post',
    data
  })
}

export function removeAreaRequest(data) {
  return fetch({
    url: '/area/remove',
    method: 'post',
    data
  })
}

export function updateAreaRequest(data) {
  return fetch({
    url: '/area/update',
    method: 'post',
    data
  })
}

export function userAreaRequest(id) {
  return fetch({
    url: '/user_area/get',
    method: 'get',
    params: { id }
  })
}
