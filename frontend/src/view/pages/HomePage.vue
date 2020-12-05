<template>
  <div class="content">
    <div class="main_spot"></div>
    <div class="main_link">
      <ul>
        <liImageLink v-for="(linkItem,index) in mainLinkItem" :linkItem="linkItem" :key="index"></liImageLink>
      </ul>
    </div>
    <div class="recommend">
      <h2>여기어때 소식</h2>
      <ul>
        <RecommendList v-for="item in recommendItem" :item="item" :key="item.title"></RecommendList>
      </ul>
    </div>
    <div class="app_down">
      <p>
        앱 다운 받고<b>더 많은 혜택</b> 받으세요
      </p>
      <div>
        <a href="//play.google.com/store/apps/details?id=kr.goodchoice.abouthere" class="down_and" target="_blank" title="구글플레이 새창">
          <img src="../../assets/image/web_v3/banner_and.png" alt="GET IT ON Google Play">
        </a>
        <a href="//itunes.apple.com/kr/app/yeogieottae-1deung-sugbag/id884043462?mt=8&amp;ign-mpt=uo%3D2" class="down_ios" target="_blank" title="앱스토어 새창">
          <img src="../../assets/image/web_v3/banner_ios.png" alt="Download on the App Store">
        </a>
      </div>
    </div>
    <div class="event_main">
      <h2>이벤트</h2>
        <swiper>
          <div class='swi' v-for="n in 6" >
            <img :src="getImage(n)">
          </div>
        </swiper>
    </div>
    <div class="ad_ask">
      <ul class="pc">
        <li>
          <a href="#">
            <img src="../../assets/image/web_v3/ad_01_171013.png" alt="firsi">
          </a>
        </li>
        <li>
          <a href="#">
            <img src="../../assets/image/web_v3/ad_02_171013.png" alt="seci">
          </a>
        </li>
      </ul>

    </div>
  </div>
</template>

<script>
import liImageLink from '../components/home/liImageLink.vue'
import RecommendList from '../components/home/RecommendList.vue'
import {Swiper} from 'vue2-swiper'

// import Swiper from '../components/home/Swiper.vue'
export default {
  name: 'HomePage',
  components: {
    liImageLink,
    RecommendList,
    Swiper
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
      },
      recommendItem: [
        {
          title: "여기어때 비즈니스",
          content: "출장부터 복지까지<br>여기어때 비즈니스로 스마트하게",
          imgLink: "b2b_banner.png",
          link: "",
          index:0,
        },
        {
          title: "여기어때 서체 출시",
          content: "젊고 당당한 여기어때 잘난체<br>지금 다운로드 받으세요!",
          imgLink: "re_jalnan.png",
          link: "",
          index:1
        }
      ],
    }
  },
  methods: {
    getImage(numb){
      console.log(numb)
      let a = (numb<3)? ".jpg":".png"
      return require("@/assets/image/web_v3/swipe" + numb + a)
    }
  }
}
</script>

<style scoped>
</style>
