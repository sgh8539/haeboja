<template>
  <li>
    <a :href="item.link">
      <img :src="images[item.index]" alt="">
      <strong>{{item.title}}</strong>
      <p v-html="item.content"></p>
    </a>
  </li>
</template>

<script>
  import image1 from "@/assets/image/web_v3/b2b_banner.png"
  import image2 from "@/assets/image/web_v3/re_jalnan.png"
  export default {
    name: 'RecommendList',
    components: {
    },
    props: {
      item: {
        type: Object
      }
    },
    data(){
      return{
        images:[image1, image2],
      }
    },
    methods: {
    }
  }
</script>

<style scoped>
</style>
