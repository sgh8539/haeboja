<template>
  <div :class="classObject">
    <div class="score_star star_45"></div>
    <div class="num">
      {{score}}
    </div>
  </div>
</template>

<script>
  // import liImageLink from '../components/home/liImageLink.vue'

  export default {
    name: 'HomePage',
    components: {
    },
    computed:{


    },
    props:["score","styleStar"],
    data () {
      return {
        classObject: {
          'score_wrap': this.styleStar==="bg",
          'score_wrap_sm': this.styleStar==="sm"
        }
      }
    },
    methods: {
    }
  }
</script>

<style scoped>
    .score_wrap_sm {
      margin-left: 96px;
      display: block;
    }
   .score_wrap {
    display: inline-block;
    overflow: hidden;
    text-align: center;
  }
   .score_wrap .score_star {
     display: inline-block;
     width: 180px;
     height: 36px;
     background: url(//image.goodchoice.kr/images/web_v3/bg_score.png) 0 0 no-repeat;
     background-size: 180px auto;
   }
   .score_star.star_45 {
     background-position: 0 -37px;
   }
   .review .score_wrap .num {
     display: inline-block;
     position: relative;
     top: -1px;
     padding-left: 12px;
     font-size: 32px;
     line-height: 1;
     vertical-align: top;
   }
    .score_wrap_sm {
      margin-left: 96px;
      display: block;
    }
    .score_wrap_sm .score_star {
      display: inline-block;
      width: 100px;
      height: 20px;
      background: url(//image.goodchoice.kr/images/web_v3/bg_score.png) 0 0 no-repeat;
      background-size: 100px auto;
    }
    .score_wrap_sm .num {
      display: inline-block;
      position: relative;
      top: -1px;
      margin-left: 4px;
      font-size: 18px;
      vertical-align: top;
    }

</style>
