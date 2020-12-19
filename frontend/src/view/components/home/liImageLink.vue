<template>
  <li>
    <a @click="goToItemList">
      <span :class="linkItem.imageClass"></span><p>{{linkItem.title}}</p>
    </a>
  </li>
</template>

<script>
export default {
  name: 'liImageLink',
  components: {
  },
  props: {
    linkItem: {
      type: Object
    }
  },
  methods: {
    goToItemList(){
      this.$router.push({name:"ItemHomePage",params:{id:'2'} })
    }
  }
}
</script>

<style scoped>
</style>
