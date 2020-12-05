<template>
  <div class="header">
    <section>
      <h1><a href="https://www.goodchoice.kr/" title="여기어때">여기어때</a></h1> <!--이후 메인페이지 링크로 수정하기-->
      <button type="button" class="btn_menu nav_open">메뉴</button>
      <button type="button" class="btn_srch srch_open" style="right: 396px;">검색</button>
      <ul class="gnb_pc" style="display: block;">
        <li><a href="https://www.goodchoice.kr/product/srp">내주변</a></li>
        <li>
          <a href="https://www.goodchoice.kr/user/login?returnUrl=my%2FreserveList">예약내역</a>
        </li>
        <li class="over">
          <button type="button"><span>더보기</span></button>
          <ul class="list_03" style="display: none; opacity: 1;">
            <li><a href="https://www.goodchoice.kr/more/notice">공지사항</a></li>
            <li><a href="https://www.goodchoice.kr/more/event">이벤트</a></li>
            <li><a href="https://www.goodchoice.kr/more/project">혁신 프로젝트</a></li>
            <li><a href="https://www.goodchoice.kr/more/faq">자주 묻는 질문</a></li>
            <li><a href="https://www.goodchoice.kr/more/inquiry">1:1 문의</a></li>
            <li><a href="https://www.goodchoice.kr/more/terms">약관 및 정책</a></li>
          </ul>
        </li>
        <li><a href="https://www.goodchoice.kr/user/login"><span>로그인</span></a></li>
      </ul>

      <!-- Search -->
      <div class="srch_bar" style="display: none;">
        <div class="wrap_inp">
          <input type="text" id="keyword" placeholder="지역, 숙소명" autocomplete="off">
          <button type="button" class="btn_srch" style="right: 396px;">검색</button>
        </div>
        <button class="btn_cancel" onclick="srch_close()">취소</button>
      </div>
      <!-- //Search -->
    </section>
  </div>

</template>

<script>
export default {
  name: 'AppHeader',
  components: {
  },
  methods: {
  }
}
</script>

<style scoped>
.header section .btn_menu {
  display: none;
  position: absolute;
  top: 2px;
  left: 8px;
  width: 40px;
  height: 40px;
  border: none;
  background: url(//image.goodchoice.kr/images/web_v3/ico_menu.png) 50% 50% no-repeat;
  background-size: 24px auto;
  text-indent: -9999px;
}
.gnb_pc {
  width: auto;
  text-align: right;
  display: inline-block;
  position: absolute;
  top: 27px;
  right: 31px;
}
.gnb_pc li {
  display: inline-block;
  position: relative;
  min-width: 53px;
  min-height: 35px;
  margin-left: 30px;
  vertical-align: top;
  -webkit-tap-highlight-color: rgba(0,0,0,0);
}
.gnb_pc li a {
  display: inline-block;
  font-size: 18px;
  color: rgba(255,255,255,0.8);
  letter-spacing: 0;
}
.gnb_pc li button {
  border: none;
  padding: 0;
  background: none;
  font-size: 18px;
  color: rgba(255,255,255,0.8);
  letter-spacing: 0;
}
.gnb_pc .list_03 {
  top: 30px;
  left: -65px;
  width: 184px;
}
.gnb_pc li ul {
  display: none;
  position: absolute;
  top: 0;
  left: 0;
  border-radius: 5px;
  padding: 32px;
  background: #fff;
  text-align: left;
  -webkit-box-shadow: 0px 3px 5px 0px rgba(0,0,0,0.2);
  -moz-box-shadow: 0px 3px 5px 0px rgba(0,0,0,0.2);
  box-shadow: 0px 3px 5px 0px rgba(0,0,0,0.2);
}
.gnb_pc li ul li {
  display: block;
  min-width: auto;
  min-height: auto;
  margin: 0 0 14px 0;
}
.gnb_pc li ul li a, .gnb_pc li ul li button {
  overflow: visible !important;
  display: block;
  position: relative !important;
  top: auto !important;
  left: auto !important;
  width: auto !important;
  height: auto !important;
  margin: 0;
  font-size: 16px;
  color: rgba(0,0,0,0.87);
}
.gnb_pc li a {
  display: inline-block;
  font-size: 18px;
  color: rgba(255,255,255,0.8);
  letter-spacing: 0;
}
.gnb_pc li ul li:last-child {
  margin-bottom: 0;
}
/*
.pc .srch_bar .wrap_inp input {
  margin: 0;
  background: none;
  font-size: 18px;
  color: #fff;
}
*/
.srch_bar .wrap_inp input {
  height: 21px;
  margin: 0;
  background: none;
  font-size: 18px;
  color: #fff;
}
.srch_bar .wrap_inp input {
  border: none;
  background: none;
  width: 100%;
  height: 20px;
  margin-top: 4.5px;
  line-height: 20px;
  font-size: 15px;
  color: rgba(0,0,0,0.87);
}
input {
  appearance: none; /*검색 돋보기 눌렀을 때 - appearance: textfield;*/
  -webkit-appearance: none;
  -moz-appearance: none;
  -webkit-tap-highlight-color: rgba(0,0,0,0);
  border-radius: 0;
  font-family: "Apple SD Gothic Neo","맑은 고딕","맑은고딕","Malgun Gothic",sans-serif;
  -webkit-writing-mode: horizontal-tb !important;
  text-rendering: auto;
  color: -internal-light-dark(black, white);
  letter-spacing: normal;
  word-spacing: normal;
  text-transform: none;
  text-indent: 0px;
  text-shadow: none;
  display: inline-block;
  text-align: start;
  background-color: -internal-light-dark(rgb(255, 255, 255), rgb(59, 59, 59));
  -webkit-rtl-ordering: logical;
  cursor: text;
  margin: 0em;
  font: 400 13.3333px Arial;
  padding: 1px 2px;
  border-width: 2px;
  border-style: inset;
  border-color: -internal-light-dark(rgb(118, 118, 118), rgb(133, 133, 133));
  border-image: initial;
}
</style>
