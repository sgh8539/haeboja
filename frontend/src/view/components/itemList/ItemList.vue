<template>
  <div class="content sub_wrap">
    <div class="list_wrap">
      <div class="product_list_area">
        <div class="title">
          <h3>지역추천</h3>
          <span>광고</span>
        </div>
        <ul>
          <ItemCard v-for="(item,index) in itemList" :item="item" :key="index"></ItemCard>
        </ul>
      </div>
    </div>
  </div>
</template>

<script>
  // import liImageLink from '../components/home/liImageLink.vue'
  import ItemCard from './ItemCard.vue'
  export default {
    name: 'ItemList',
    components: {
      ItemCard
    },
    props:["itemList"],
    data () {
      return {}
    },
    methods: {
    }
  }
</script>

<style scoped>
  .sub_wrap {
    width: 1024px !important;
    margin: 0 auto 0 auto;
    padding-bottom: 50px;
    min-height: 390px;
  }
  .content{
    overflow: hidden;
  }
  .recommend_wrap .list_wrap {
    margin-top: 40px;
    float: none;
    background: #fff;
    width: 635px;
  }
   .list_wrap {
    float: none;
    margin: 0 auto;
    background: #fff;
  }
  .list_wrap .title {
    position: relative;
    padding: 0px 0 12px 0;
    background: none;
    font-size: 14px;
  }
  .list_wrap .title h3 {
    font-size: 18px;
    font-weight: bold;
    color: rgba(0,0,0,0.56);
  }
  .recommend_wrap .list_wrap .title span {
    top: 0 !important;
  }
  .list_wrap .title span {
    display: inline-block;
    position: absolute;
    top: 21px;
    right: 0;
    height: 19px;
    padding: 2px 22px 0 0;
    background: url(//image.goodchoice.kr/images/web_v3/ico_question.png) 100% 0 no-repeat;
    background-size: 20px auto;
    font-size: 14px;
    color: rgba(0,0,0,0.56);
    cursor: pointer;
    text-align: right;
  }
</style>
