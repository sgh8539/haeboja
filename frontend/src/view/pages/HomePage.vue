<template>
  <div class="content">
    <div class="main_spot"></div>
    <div class="main_link">
      <ul>
        <liImageLink v-for="(linkItem,index) in mainLinkItem" :linkItem="linkItem" :key="index"></liImageLink>
      </ul>
    </div>
    <div class="recommend"></div>
    <div class="app_down"></div>
    <div class="event_main"></div>
    <div class="ad_ask"></div>
  </div>
</template>

<script>
import liImageLink from '../components/home/liImageLink.vue'
export default {
  name: 'HomePage',
  components: {
    liImageLink
  },
  data () {
    return {
      mainLinkItem: {
        item1: { title: '모텔', imageClass: 'ico_01' },
        item2: { title: '호텔', imageClass: 'ico_02' },
        item3: { title: '펜션', imageClass: 'ico_03' },
        item4: { title: '리조트', imageClass: 'ico_04' },
        item5: { title: '게스트하우스', imageClass: 'ico_05' },
        item6: { title: '캠핑·글램핑', imageClass: 'ico_06' },
        item7: { title: '한옥', imageClass: 'ico_07' },
        item8: { title: '내주변', imageClass: 'ico_08' },
        item9: { title: '페이백', imageClass: 'ico_09' }
      }
    }
  },
  methods: {
  }
}
</script>

<style scoped>
</style>
