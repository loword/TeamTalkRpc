import fetch from '@/utils/fetch'

export function listMenuRequest() {
  
  return fetch({
    url: '/menu/list',
    method: 'get'
  })
}

export function addMenuRequest(data) {
  return fetch({
    url: '/menu/add',
    method: 'post',
    data
  })
}

export function removeMenuRequest(data) {
  return fetch({
    url: '/menu/remove',
    method: 'post',
    data
  })
}

export function updateMenuRequest(data) {
  return fetch({
    url: '/menu/modify',
    method: 'post',
    data
  })
}

export function getRoute(token){
  return fetch({
     url: '/getRoute',
     method: 'get',
     params: { token }
  })
}

export function getMenu(data){
  return fetch({
     url: '/getMenu',
     method: 'post',
     data
  })
}


