<template>
  <div class="sub_top_wrap">
    <div class="sub_top bg_kong_1">
      <h2>서울지역편</h2>
      <div class="area">
        <div class="btn_area align_vertical"><span>서울</span>서울 인기숙소</div>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'ItemListHeader',
    components: {
    },
    props:['itemData'],
    data () {
      return {}
    },
    methods: {
    }
  }
</script>

<style scoped>
  .recommend_wrap .sub_top_wrap {
    display: block;
    position: relative;
    width: 100%;
    height: 211px;
  }
  .bg_area_01 .sub_top_wrap {
    background: url(../../../assets/image/list_page/recommend_1.jpg) 50% 70% no-repeat;
    background-size: 100% auto;
  }
  .recommend_wrap .sub_top_wrap:after {
    display: block;
    content: '';
    position: absolute;
    top: 0;
    right: 0;
    bottom: 0;
    left: 0;
    z-index: 1;
    width: 100%;
    height: 100%;
    background: rgba(0,0,0,0.56);
  }
  .recommend_wrap .sub_top {
    display: block;
    width: 1024px;
    height: 211px;
    margin: 0 auto;
    padding-top: 72px;
    text-align: left;
    position: relative;
    z-index: 10;
    border-radius: 0;
    background: none !important;
    vertical-align: middle;
  }

  .recommend_wrap .sub_top h2 {
    font-size: 38px;
    display: inline-block;
    font-weight: normal;
    color: #fff;
    margin: 21px 0 0 31px;
    letter-spacing: -1px;
  }
</style>
