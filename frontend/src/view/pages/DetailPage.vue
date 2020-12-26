<template>
  <div id="content" class="detail">
    <!-- Top : 가장 위 숙소 정보를 대략적으로 보여주는 곳 -->
    <div class="top">
        <!-- Left : 사진 swipe 부분 -->
        <div class="left">
            <!-- Gallery (PC) / 원래는 이 윗부분에 mobile 버전 있었음 -->
            <!-- detail를 처음 맞아주는 사진들 ㅋ -->
            <div class="gallery_pc">
              <!-- Swiper -->
              <div class="swiper-container gallery-top swiper-container-fade">
                <ul class="swiper-wrapper swiper-slide" style="width: 490px;">
                  <!--<li class="swiper-slide" style="width: 490px;">-->
                  <img :src="imgList[imgPage].img" alt="">
                  <!--</li>-->
                </ul>
              </div>
              <!-- Swiper -->
              <div class="swiper-container gallery-thumbs">
                <ul class="swiper-wrapper" style="transition-duration: 0ms;">
                  <swiper 
                    ref="mySwiper" 
                    class="swiper-slide" 
                    :options="swiperOption" 
                    @click-slide="onSwiperClickSlide" 
                  >
                    <swiper-slide v-for="(item, index) in imgList" :key="item" :index="index">
                      <img :src="item.img" @alt=item.alt style="width:115px;">
                    </swiper-slide>
                    
                    <!--<div class="swiper-pagination" slot="pagination"></div>-->
                  </swiper>
                </ul>
              </div>
              <!-- Add Arrows -->
              <button class="swiper-button-prev_2" @click="prev" slot="button-prev"></button>
              <button class="swiper-button-next_2" @click="next" slot="button-next"></button>
            </div>
        </div>
        <!-- //left -->

        <!-- Datepicker : 이건 뭔지 모르겠음... -->
        <input type="text" class="product_date" style="display: none;">
        <button type="button" class="comiseo-daterangepicker-triggerbutton ui-button ui-corner-all ui-widget comiseo-daterangepicker-bottom comiseo-daterangepicker-vfit" id="drp_autogen0">
            12.08 - 12.09
            <span class="ui-button-icon-space"> </span>
            <span class="ui-button-icon ui-icon ui-icon-triangle-1-s"></span>
        </button>

        <!-- Right : 사진 오른쪽에 있는 description 부분 -->
        <div class="right">
            <!-- Info -->
            <div class="info">
                <p class="badge">
                </p>
                <h2>왕십리 Full Moon</h2>
                <div class="score_cnt">
                    <span>9.2</span>추천해요<b id="review_cnt">&nbsp;리뷰 <em>140</em>개</b>
                    <p><a href="tel:050430963580" class="call">전화하기</a></p>
                </div>
                <p class="address">서울 성동구 도선동 100</p>
                <div class="benefit_wrap">
                    <span>예약취소가능<em>,</em></span>
                </div>
            </div>

            <!-- 업체 이벤트 -->
            <div class="event_link">
                <section class="gra_mint_2">
                    <ul>
                        <li onclick="pop_mem();">발렛주차,리프트 주차장 외 8대 완비</li>
                        <li onclick="pop_mem();">업체 전 객실 방역 및 소독 완료</li>
                        <li onclick="pop_mem();">현장 결제시 룸 업그레이드</li>
                    </ul>
                </section>
            </div>    
            
            <!-- 사장님 한마디 & 추천이유 -->
            <div class="comment">
                <strong>사장님 한마디</strong>
                <button>더보기</button>
                <div class="clamp">
                    업체 전 객실 방역 및 소독 완료<br>
                    - 공지사항 -주말 숙박이용시에만 스탠다드객실 주차 불가
                </div>
            </div>
        </div>
        <!-- //Right -->
    </div>
    <!-- //top : 이제 이 바로 다음부터 tab들이 나옴 -->

    <detail-tabs @tabChange="tabChange"></detail-tabs>
    <form action="">
      <component :is="selectedComponent"></component>
    </form>
  </div>
</template>

<script>
  import DetailTabs from "../components/detail/DetailTabs"
  import DefaultInfo from "../components/detail/DefaultInfo"
  import RoomInfo from "../components/detail/RoomInfo"
  import RoomReview from "../components/detail/RoomReview"
  import { Swiper, SwiperSlide } from "vue-awesome-swiper";

  export default {
    name: 'DetailPage',
    components: {
      DetailTabs,
      DefaultInfo,
      RoomInfo,
      RoomReview,
      Swiper,
      SwiperSlide
    },
    computed:{
      selectedComponent(){
        switch (this.selectedTab) {
          case(1): return RoomInfo
          case(2): return DefaultInfo
          case(3): return RoomReview
        }
      },
      slidesLen() {
        return this.imgList.length;
      }
    },
    data () {
      return {
        selectedTab: 1,
        imgList: [{img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/11147/c1653091856f9d460266136748159530.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/11147/62a47cf0b4502723490b64c0c9af1837.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/11147/0283e82d3cdd822252090fe447429bba.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/11147/354c625d86cd20a2454eccff95e53706.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/279207/c815fc2b198ff2c4d1a599e6e7888f9a.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/279204/883165c1774eaabbca8a0a67f37de8ad.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/279205/97394620189350716a464481f5073a9a.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/279206/303757e5a183fb0383de4377d9119699.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/279207/0ace5b3d847e4e19f79e7111abe123b4.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/279208/02b7edc77156d9b3ab69bb80d159b976.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/279209/068a81253be00d9883d3990673a39cc0.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/279210/8a30d46781027f6c82b9ebc91f70bb81.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/279211/79b75aa650d444669f09295fa74b6dd0.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/279212/50f7b36288ee4b5185efcb0b34dfcc22.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/279213/00d7a9f3ab95c2d19bf1f3b3d0353bb0.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/279214/9b230c0ee4bd0c88e20e261343575f40.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/332936/4168af96652eda1b562abae021e52993.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/11147/61bbca8d71ed28b5d93feffe26a15249.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/11147/8476caffb5531a14814e9bab21bb2b51.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/11147/748cbf840225ccdd12fc1090e5b33b50.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/11147/09f074dcf765d878c43fc4cc016a8554.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/11147/6578a09ab0cd722a08ba893c2a6f99de.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/11147/62d7f6bbd42ea61dc0968bc319ac9ad0.jpg', alt: ''},
                  {img: '//image.goodchoice.kr/resize_490x348/adimg_new/63580/11147/36937f08baa616716af6b36839f728fc.jpg', alt: ''}],
        imgPage: 0,
        swiperOption: {
          loop: true,
          slidesPerView: 4,
          spaceBetween: 10,
          /*pagination: {
            el: ".swiper-pagination",
            clickable: true
          },*/
          breakpoints: {
            1024: {
              slidesPerView: 4,
              spaceBetween: 10
            },
            768: {
              slidesPerView: 3,
              spaceBetween: 8
            },
            640: {
              slidesPerView: 2,
              spaceBetween: 6
            },
            320: {
              slidesPerView: 1,
              spaceBetween: 4
            }
          }
        }
      }
    },
    methods: {
      tabChange(index){
        this.selectedTab = index;
      },
      prev() {
        this.$refs.mySwiper.$swiper.slideNext();
        if(this.imgPage >= this.slidesLen - 1) {
          this.imgPage = 0;
        }
        else {
          this.imgPage += 1;
        }
      },
      next() {
        this.$refs.mySwiper.$swiper.slidePrev();
        if(this.imgPage <= 0) {
          this.imgPage = this.slidesLen - 1;
        }
        else {
          this.imgPage -= 1;
        }
      },
      handleClickSlide(v) {
        console.log(1111, v)
      }
    },
    mounted() {},
    created() {}
  }
</script>

<style scoped>
  #content {
    overflow: hidden;
  }
  .detail {
    width: 1024px;
    margin: 112px auto 0 auto;
  }
  /*.wrap.show, footer.show {*/
  /*  opacity: 1;*/
  /*  visibility: visible;*/
  /*}*/
  /*.wrap {*/
  /*  width: 100%;*/
  /*  background: #fff;*/
  /*}*/
  div {
    display: block;
  }
  .detail .top {
    overflow: hidden;
    padding: 0 31px;
  }
  .detail .top .left {
    float: left;
    width: 490px;
  }
  .gallery_pc {
    display: block;
    position: relative;
  }
  .gallery_pc .gallery-top {
    width: 490px;
    height: 348px;
    margin-bottom: 13px;
  }
  .swiper-container {
    position: relative;
    /* width: 100%; */
    /* height: auto; */
    margin-left: auto;
    margin-right: auto;
    /* position: relative; */
    overflow: hidden;
    z-index: 1;
  }
  .swiper-slide, .swiper-wrapper {
    /* -webkit-transform: translate3d(0px, 0, 0); */
    /* -moz-transform: translate3d(0px, 0, 0); */
    /* -o-transform: translate(0px, 0px); */
    /* -ms-transform: translate3d(0px, 0, 0); */
    transform: translate3d(0px, 0, 0);
  }
  .swiper-wrapper {
    position: relative;
    width: 100%;
    height: 100%;
    z-index: 20;
    /* display: -webkit-box; */
    /* display: -moz-box; */
    /* display: -ms-flexbox; */
    /* display: -webkit-flex; */
    display: flex;
    /* -webkit-transition-property: -webkit-transform; */
    /* -moz-transition-property: -moz-transform; */
    /* -o-transition-property: -o-transform; */
    /* -ms-transition-property: -ms-transform; */
    /* transition-property: transform; */
    /* -webkit-box-sizing: content-box; */
    /* -moz-box-sizing: content-box; */
    box-sizing: content-box;
  }
  .swiper-container-fade .swiper-slide {
    pointer-events: none;
    /* -webkit-transition-property: opacity; */
    /* -moz-transition-property: opacity; */
    /* -o-transition-property: opacity; */
    transition-property: opacity;
  }
  .swiper-slide {
    position: relative;
    text-align: center;
    font-size: 18px;
    background: #fff;
    /* display: -webkit-box; */
    /* display: -ms-flexbox; */
    display: -webkit-flex;
    -webkit-box-pack: center;
    /* -ms-flex-pack: center; */
    /* -webkit-justify-content: center; */
    justify-content: center;
    -webkit-box-align: center;
    /* -ms-flex-align: center; */
    /* -webkit-align-items: center; */
    align-items: center;
    flex-shrink: 0;
    height: 100%;
  }
  .swiper-container-fade .swiper-slide-active, .swiper-container-fade .swiper-slide-active .swiper-slide-active {
    pointer-events: auto;
  }
  .gallery_pc li .swiper-lazy-loaded {
    opacity: 1;
  }
  .gallery_pc .gallery-top img {
    width: 490px;
    height: 348px;
  }
  .gallery_pc li img {
    transition: 0.4s;
    opacity: 0;
  }
  .swiper-slide img {
    position: relative;
    z-index: 20;
    width: 100%;
    color: #fff;
  }
  .swiper-container img {
    width: 100%;
  }
  img {
    border: 0;
  }
  .gallery_pc .gallery-thumbs {
    width: 460px;
    height: 86px;
    margin: 0 0 0 16px;
    background: #fff;
  }
  .gallery_pc .gallery-thumbs li {
    display: inline-block;
    /* width: 115px; */
    height: 86px;
    padding: 2px;
    border: 1px solid #fff;
    border-radius: 4px;
    cursor: pointer;
  }
  .gallery_pc .gallery-thumbs li img {
    width: 109px;
    height: 80px;
  }

  input[type="text" i] {
    padding: 1px 2px;
  }
  .comiseo-daterangepicker-triggerbutton {
    position: absolute;
    top: -9999px;
    visibility: hidden;
    border: none;
    background: none;
  }
  .ui-button {
    color: #454545;
    text-decoration: none;
    font-weight: normal;
  }
  .ui-widget {
    font-family: Arial,Helvetica,sans-serif;
  }
  .comiseo-daterangepicker-triggerbutton .ui-button-icon {
    position: absolute;
    top: 50%;
    margin-top: -8px;
  }
.ui-icon-triangle-1-s {
      background-position: -65px -16px;
  }
  .ui-icon {
    width: 16px;
    height: 16px;
    display: inline-block;
    vertical-align: middle;
    /* position: relative; */
    text-indent: -99999px;
    overflow: hidden;
    background-repeat: no-repeat;
  }

  .gallery_pc .swiper-button-next_2 {
    position: absolute;
    z-index: 9999;
    cursor: pointer;
    top: 361px;
    left: 4px;
    right: 10px;
    width: 15px;
    height: 86px;
    margin: 0;
    background: url(//image.goodchoice.kr/images/web_v3/ico_arr_gt_3.png) 6px 50% no-repeat;
    background-size: 8px auto;
    transform: rotate(180deg);
    border:none;
  }
  .gallery_pc .swiper-button-prev_2 {
    position: absolute;
    z-index: 9999;
    cursor: pointer;
    top: 361px;
    left: 473px;
    right: auto;
    width: 15px;
    height: 86px;
    margin: 0;
    background: url(//image.goodchoice.kr/images/web_v3/ico_arr_gt_3.png) 6px 50% no-repeat;
    background-size: 8px auto;
    border:none;
  }
  .detail .top .right {
    float: right;
    width: 424px;
  }
  .right .info {
    padding: 0;
  }
  .right .info .badge {
    display: block;
    top: 0;
    overflow: hidden;
    position: relative;
  }
  .right .info h2 {
    display: inline;
    margin: 9px 0 0 0;
    font-size: 28px;
  }
  h2 {
    /* font-size: 14px; */ /* font-size: 24px; */
    /* margin-bottom: 13px; */ /* margin-bottom: 35px; */
    color: rgba(0,0,0,0.87);
    font-weight: bold;
    padding: 0;
    border: 0;
    box-sizing: border-box;
    margin-block-start: 0.83em;
    margin-block-end: 0.83em;
    margin-inline-start: 0px;
    margin-inline-end: 0px;
  }
  .right .info .score_cnt {
    position: relative;
    /* clear: both; */
    margin: 9px 0 6px 0;
    font-size: 18px;
    color: rgb(255,167,38);
  }
  .right .info .score_cnt span {
    display: inline-block;
    position: relative;
    top: -3px;
    height: 18px;
    margin-right: 7px;
    padding: 0 4px;
    border-radius: 4px;
    background: rgb(255,167,38);
    font-size: 14px;
    line-height: 17px;
    color: #fff;
  }
  .right .info .score_cnt b {
    font-weight: normal;
    color: rgba(0,0,0,0.38);
  }
  em {
    font-style: normal;
    font-weight: normal;
    margin: 0;
    padding: 0;
    border: 0;
    box-sizing: border-box;
  }
  .right .info .score_cnt .call {
    display: none;
    position: absolute;
    top: -10px;
    right: 0;
    width: 48px;
    height: 34px;
    border-left: 1px solid rgba(0,0,0,0.08);
    background: url(//image.goodchoice.kr/images/web_v3/ico_call.png) right 50% no-repeat;
    background-size: 24px auto;
    text-indent: -9999px;
  }
  .right .info .address {
    margin: 6px 0 8px 0;
    font-size: 18px;
    padding-top: 6px;
    color: rgba(0,0,0,0.56);
  }
  .right .info .benefit_wrap {
    overflow: hidden;
    margin-right: 50px;
  }
  .right .info .benefit_wrap span {
    font-size: 16px;
    /* float: left; */
    display: inline-block;
    margin-top: 7px;
    padding: 3px 2px 2px 2px;
    background: #f4f4f4;
    line-height: normal;
    color: rgba(0,0,0,0.56);
  }
  .right .info .benefit_wrap span:last-child em {
    display: none;
  }
  .event_link {
    margin-top: 16px;
    padding: 0;
    background: none;
  }
  .event_link section {
    display: block;
    position: relative;
    padding: 12px 44px 12px 12px;
    border-radius: 4px;
    cursor: pointer;
  }
  .gra_mint_2 {
    /* background: #009abd; */
    /* background: -moz-linear-gradient(left, #009abd 0%, #12b1a2 100%); */
    /* background: -webkit-linear-gradient(left, #009abd 0%,#12b1a2 100%); */
    background: linear-gradient(to right, #009abd 0%,#12b1a2 100%);
    /* filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#009abd', endColorstr='#12b1a2',GradientType=1 ); */
  }
  .event_link section ul li {
    overflow: hidden;
    padding-left: 16px;
    background: url(//image.goodchoice.kr/images/web_v3/ico_bul_2.png) 0 50% no-repeat;
    background-size: 12px auto;
    font-size: 15px;
    line-height: 24px;
    color: #fff;
    white-space: nowrap;
    text-overflow: ellipsis;
  }
  .event_link section:after {
    display: inline-block;
    content: "";
    position: absolute;
    top: 50%;
    right: 16px;
    width: 12px;
    height: 24px;
    margin-top: -12px;
    background: url(//image.goodchoice.kr/images/web_v3/ico_arr_gt.png) right 50% no-repeat;
    background-size: 12px auto;
  }
  .right .comment {
    display: block;
    position: relative;
    margin-top: 16px;
    padding: 26px 24px;
    background: rgb(250,250,250);
  }
  .right .comment strong {
    display: block;
    margin-bottom: 15px;
    font-size: 16px;
    color: rgba(0,0,0,0.87);
  }
  .right .comment button {
    position: absolute;
    top: 24px;
    right: 24px;
    background: none;
    border: none;
    font-size: 16px;
    color: rgb(0,121,107);
  }
  .right .comment .clamp {
    display: -webkit-box;
    -webkit-line-clamp: 2;
    -webkit-box-orient: vertical;
    height: 52px;
    text-overflow: ellipsis;
  }
  .right .comment div {
    /* display: block; */
    overflow: hidden;
    /* height: auto; */
    font-size: 16px;
    line-height: 26px;
    color: rgba(0,0,0,0.56);
  }


  .fade-in-box {
    animation: fadein 3s;
    -moz-animation: fadein 3s; /* Firefox */
    -webkit-animation: fadein 3s; /* Safari and Chrome */
    -o-animation: fadein 3s; /* Opera */
  }
  @keyframes fadein {
    from {
        opacity:0;
    }
    to {
        opacity:1;
    }
  }
  @-moz-keyframes fadein { /* Firefox */
    from {
        opacity:0;
    }
    to {
        opacity:1;
      }
  }
  @-webkit-keyframes fadein { /* Safari and Chrome */
    from {
        opacity:0;
    }
    to {
        opacity:1;
    }
  }
  @-o-keyframes fadein { /* Opera */
    from {
        opacity:0;
    }
    to {
        opacity: 1;
    }
  }
</style>
