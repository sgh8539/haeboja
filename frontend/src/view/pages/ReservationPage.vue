<template>
  <div class="content">
    <div class="reserve">
      <div class="right"></div>
      <div class="left"></div>
    </div>

  </div>
</template>

<script>
  // import liImageLink from '../components/home/liImageLink.vue'

  export default {
    name: 'ReservationPage',
    components: {
    },
    data () {
      return {}
    },
    methods: {
    }
  }
</script>

<style scoped>
  .reserve {
    width: 1024px;
    margin: 0 auto;
    padding-top: 72px;
  }
  .reserve .right {
    float: right;
    width: 310px;
    margin: 40px 31px 0 0;
    background: rgb(250,250,250);
  }
</style>
