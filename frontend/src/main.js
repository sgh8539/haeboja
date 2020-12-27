import Vue from 'vue'

import AppLayout from './App.vue'
import router from './router'
import store from './store'

import axios from 'axios'

import './assets/css/haeboja.css'
import './assets/fonts/bebasneue.css'
import awesomeSwiper from 'vue-awesome-swiper'
import "swiper/swiper-bundle.css"

axios.defaults.baseURL = 'http://localhost:8081'
axios.defaults.headers.common['Authorization'] = 'something'
axios.defaults.headers.get['Accepts'] = 'application/json'

Vue.config.productionTip = false
new Vue({
  name: 'Root',
  router,
  store,
  // mounted () {
  //   store.commit('dom/SET_WINDOW_WIDTH', window.innerWidth)
  //   window.addEventListener('resize', () => store.commit('dom/SET_WINDOW_WIDTH', window.innerWidth))
  // },
  // beforeDestroy () {
  //   window.removeEventListener('resize', () => store.commit('dom/SET_WINDOW_WIDTH', window.innerWidth))
  // },
  render: h => h(AppLayout)
}).$mount('#app')

Vue.use(awesomeSwiper)
