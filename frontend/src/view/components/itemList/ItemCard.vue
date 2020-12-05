<template>
  <li class="list_2 adcno1">
    <a href="#">
      <p class="pic">
        <img style="margin-top: -159px;display: block;"
             class="lazy align" src="../../../assets/image/list_page/r1.jpg" alt="종로 호텔H">
      </p>
      <div class="stage gra_black_vertical">
        <div class="evt_info"><span>{{item.notice}}</span></div><div class="name">
        <strong>{{item.name}}</strong>
        <p class="score">
          <em>{{item.recommend.score}}</em>&nbsp<span>추천해요</span>&nbsp ({{item.recommend.reviews}})</p>
        <p>
          {{item.address}}
        </p>
      </div>
        <div class="price">
          <p>대실&nbsp
            <span style="color: rgba(255,255,255,1);background-color: rgba(248,113,111,1);">예약특가</span>&nbsp<b>{{item.price.stay}}원</b>
          </p>
          <p>숙박&nbsp
            <span style="color: rgba(255,255,255,1);background-color: rgba(248,113,111,1);">예약특가</span>&nbsp<b>{{item.price.sleep}}원</b>
          </p>
        </div>
      </div>
    </a>
  </li>
</template>

<script>
  export default {
    name: 'ItemCard',
    components: {
    },
    props:['item'],
    data () {
      return {}
    },
    methods: {
    }
  }
</script>

<style scoped>
  .list_2, .list_3 {
    overflow: hidden;
    position: relative;
    height: 280px;
  }
  .list_2 a, .list_3 a {
    display: block;
    height: 280px;
    color: #fff;
  }
  .list_2 img.align, .list_3 img.align {
    position: absolute;
    top: 50%;
    left: 0;
    z-index: 1;
    width: 100%;
    min-height: 280px;
  }
  .list_2 .stage, .list_3 .stage {
    position: absolute;
    top: 0;
    right: 0;
    bottom: 0;
    left: 0;
    z-index: 10;
    padding: 0 24px;
  }
  .gra_black_vertical, .gra_black_oblique {
    background: none;
    background: -moz-linear-gradient(top, rgba(0,0,0,0) 0%, rgba(0,0,0,0.66) 100%);
    background: -webkit-linear-gradient(top, rgba(0,0,0,0) 0%,rgba(0,0,0,0.66) 100%);
    background: linear-gradient(to bottom, rgba(0,0,0,0) 0%,rgba(0,0,0,0.66) 100%);
  }
  .list_1 .stage .evt_info, .list_2 .stage .evt_info, .list_3 .stage .evt_info {
    position: absolute;
    top: 24px;
    left: 0;
    right: auto;
    height: 24px;
  }
  .list_1 .stage .evt_info, .list_2 .stage .evt_info, .list_3 .stage .evt_info {
    max-width: 70%;
    background: rgba(0,0,0,0.4);
    color: rgba(255,255,255,0.9);
  }
  .list_2 .stage .evt_info span, .list_3 .stage .evt_info span {
    height: 24px;
    margin: 0 10px 0 24px;
    padding-top: 3px;
    font-size: 18px;
    line-height: 1;
    display: block;
    overflow: hidden;
    white-space: nowrap;
    text-overflow: ellipsis;
    word-break: keep-all;
  }

  .list_2 .stage .name, .list_3 .stage .name {
    position: absolute;
    bottom: 20px;
    left: 24px;
    width: 65%;
  }
  .list_2 .stage .name strong, .list_3 .stage .name strong {
    display: block;
    height: auto;
    font-size: 26px;
    line-height: normal;
    overflow: hidden;
    margin-top: 8px;
    text-overflow: ellipsis;
    word-break: keep-all;
    white-space: nowrap;
  }
  .list_1 .stage .name .score, .list_2 .stage .name .score, .list_3 .stage .name .score {
    height: auto;
    margin-top: 7px;
    line-height: normal;
    color: rgb(255,167,38);
  }
  .list_1 .stage .name p, .list_2 .stage .name p, .list_3 .stage .name p {
    height: auto;
    margin-top: 9px;
    padding-bottom: 2px;
    font-size: 20px;
    overflow: hidden;
    text-overflow: ellipsis;
    word-break: keep-all;
    white-space: nowrap;
  }
  .list_2 .stage .price, .list_3 .stage .price {
    position: absolute;
    bottom: 20px;
    right: 24px;
    text-align: right;
  }
  .list_1 .stage .price p, .list_2 .stage .price p, .list_3 .stage .price p {
    height: auto;
    margin-top: 11px;
    font-size: 20px;
    color: rgba(255,255,255,0.9);
  }
  .list_1 .stage .price p span, .list_2 .stage .price p span, .list_3 .stage .price p span, .list_4 .stage .price p span {
    position: relative;
    top: 1px;
    height: 20px;
    padding: 0 3px;
    font-size: 14px;
    line-height: 20px;
    display: inline-block;
    vertical-align: top;
  }
  .list_1 .stage .price p b, .list_2 .stage .price p b, .list_3 .stage .price p b {
    top: 0;
    font-size: 22px;
    color: #fff;
    display: inline-block;
    position: relative;
    vertical-align: top;
  }
</style>
