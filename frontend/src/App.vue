<template>
  <div id="app">
    <div class="wrapper">
      <transition name="fade">
        <router-view></router-view>
      </transition>
    </div>
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
