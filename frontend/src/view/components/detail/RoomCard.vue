<template>
  <div class="room">
    <p class="pic_view">
      <img src="//image.goodchoice.kr/resize_370x220/affiliate/2016/05/24/5743b4aabc664.jpg" alt="roomitel1">
    </p>
    <div class="cal_bg"></div>
    <strong class="title">{{roomItem.title}}</strong>
    <div class="info">
      <div class="hotel">
        <div class="price">
          <strong>가격</strong>
          <div>
            <p class="through_none" style="text-decoration: line-through; visibility: visible;">
            {{roomItem.originalPrice}}
            </p>
            <p>
              <b>{{roomItem.price}}원</b>
            </p>
          </div>
          <button>객실 이용 안내</button>
        </div>
          <button :class="roomItem.reserveButton.type">예약</button>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'RoomCard',
    components: {
    },
    props:["roomItem"],
    data () {
      return {}
    },
    methods: {
    }
  }
</script>

<style scoped>
  .room_info .room {
    overflow: hidden;
    position: relative;
    margin: 0 0 24px 0;
    background: #fff;
    padding: 24px 24px 24px 424px;
    border: 1px solid rgba(0,0,0,0.08);
    border-radius: 4px;
    box-sizing: border-box;
  }
  .room_info .pic_view {
    display: inline-block;
    position: absolute;
    top: 23px;
    left: 23px;
    width: 376px;
    height: 226px;
    cursor: pointer;
  }
  .room_info .room .cal_bg {
    display: none;
    position: absolute;
    bottom: 23px;
    left: 23px;
    width: 914px;
    height: 528px;
    background: #f9f9f9;
  }
  .room_info .room .title {
    display: block;
    height: 37px;
    padding: 0;
    font-size: 20px;
    font-weight: bold;
    line-height: 1;
  }
  .room_info .room .info {
    overflow: hidden;
    margin: 0;
    min-height: 188px;
  }
  .room_info .info .hotel .price {
    position: relative;
    padding: 0;
    border: none;
    border-radius: 0;
    border-bottom: none;
    box-sizing: border-box;
  }
  .room_info .info .hotel .price strong {
    display: block;
    padding-top: 41px;
    border-bottom: 1px solid rgba(0,0,0,0.08);
    height: 76px;
    font-size: 16px;
    line-height: 1;
  }
  .room_info .info .hotel .price div {
    position: absolute;
    top: 10px;
    right: 0;
    font-size: 18px;
    text-align: right;
  }
  .room_info .info .price div .through_none {
    margin-bottom: 3px;
    height: 29px;
    padding-top: 13px;
    font-size: 16px;
    color: rgba(0,0,0,0.56);
  }
  .room_info .pic_view img {
    width: 376px;
    height: 226px;
  }
  .room_info .info .hotel .price button {
    height: 48px;
    margin: 12px 0;
    font-size: 16px;
    line-height: 48px;
    padding: 0;
    background: #fff url(//image.goodchoice.kr/images/web_v3/ico_arr_gt_2.png) 100% 50% no-repeat;
    background-size: 12px auto;
    color: rgba(0,0,0,0.87);
    text-align: left;
    display: block;
    width: 100%;
    border: none;
    border-radius: 4px;
    font-weight: normal;
  }
  .room_info .info button {
    display: block;
    width: 100%;
    height: 40px;
    border: none;
    border-radius: 4px;
    font-size: 16px;
    font-weight: normal;
    color: #fff;
    text-align: center;
  }
  .gra_left_right_red {
    background: rgb(255,0,85);
    background: -moz-linear-gradient(left, rgba(255,0,85,1) 1%, rgba(230,34,67,1) 100%);
    background: -webkit-linear-gradient(left, rgba(255,0,85,1) 1%,rgba(230,34,67,1) 100%);
    background: linear-gradient(to right, rgba(255,0,85,1) 1%,rgba(230,34,67,1) 100%);
  }
</style>
