<template>
  <li>
    <div class="guest">
      <p class="pic">
        <img src="//image.goodchoice.kr/profile/ico/ico_25.png" alt="asdfjwsjjc">
      </p>
      <strong>{{reviewItem.title}}</strong>
      <star-review :styleStar="'sm'" :score="reviewItem.score"></star-review>
      <div class="name">
        <b>{{reviewItem.category}}</b>
      </div>
      <div class="txt">
        {{reviewItem.content}}
      </div>
      <span class="date">
        {{reviewItem.time}}
      </span>
    </div>
  </li>
</template>

<script>
  import StarReview from './StarReview.vue'
  export default {
    name: 'ReviewCard',
    components: {
      StarReview
    },
    props:["reviewItem"],
    data () {
      return {}
    },
    methods: {
    }
  }
</script>

<style scoped>
  .review ul li {
    position: relative;
    padding: 47px 0 28px 0;
    border-top: 1px solid rgba(0,0,0,0.08);
  }
  .review .guest .pic {
    display: inline-block;
    overflow: hidden;
    position: absolute;
    top: 47px;
    left: 16px;
    width: 56px;
    height: 56px;
    border-radius: 100%;
    background: url(//image.goodchoice.kr/images/web_v3/ico_none.png) 0 0 no-repeat;
    background-size: 56px auto;
  }
  .review .guest .pic img {
    width: 56px;
    height: 56px;
    border-radius: 100%;
  }
  .review .guest strong {
    display: block;
    padding: 0 16px 8px 96px;
    font-size: 18px;
    line-height: normal;
  }
  .review .guest .name {
    margin-left: 96px;
    padding-top: 18px;
    font-size: 16px;
    color: rgba(0,0,0,0.56);
  }
  .review .guest .txt {
    margin: 11px 0 0 96px;
    font-size: 16px;
    line-height: 26px;
  }
  .review .guest .name b {
    font-weight: normal;
  }
  .review .guest .txt {
    margin: 11px 0 0 96px;
    font-size: 16px;
    line-height: 26px;
  }
  .review .guest .date {
    display: inline-block;
    font-size: 16px;
    margin-left: 96px;
    padding: 13px 0 0 0;
    color: rgba(0,0,0,0.56);
  }
</style>
