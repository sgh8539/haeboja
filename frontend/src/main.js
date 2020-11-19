import Vue from 'vue'

import AppLayout from './App.vue'
import router from './router'
import store from './store'

import './assets/css/haeboja.css'
import './assets/fonts/bebasneue.css'

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
