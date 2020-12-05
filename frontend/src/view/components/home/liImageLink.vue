<template>
  <li>
    <a href="#">
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
  }
}
</script>

<style scoped>
</style>
