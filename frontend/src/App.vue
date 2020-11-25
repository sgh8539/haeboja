<template>
  <div id="app">
    <AppHeader></AppHeader>
    <router-view></router-view>
    <AppFooter></AppFooter>
  </div>
</template>

<script>
import AppHeader from './view/layout/Header.vue'
import AppFooter from './view/layout/Footer.vue'

export default {
  name: 'AppLayout',
  components: {
    AppHeader,
    AppFooter
  }
}
</script>
