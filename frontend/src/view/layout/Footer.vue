<template>
  <div class="footer">
    <div class="wrapper">
      Best portal © 2017 - {{ currentYear }}
    </div>
    <div class="align">
      <ul class="link">
        <li><a href="http://www.withinnovation.co.kr/" target="_blank">회사소개</a><span>|</span></li>
        <li><a href="https://www.goodchoice.kr/more/terms" data-default="term">이용약관</a><span>|</span></li>
        <li><a href="https://www.goodchoice.kr/more/terms/privacy" data-default="privacy">개인정보처리방침</a><span>|</span></li>
        <li><button type="button" onclick="pop_licence();return false;">사업자 정보확인</button><span>|</span></li>
        <li><a href="//ad.goodchoice.kr/" target="_blank">여기어때 마케팅센터</a><span>|</span></li>
        <li><a href="//host.goodchoice.kr/" target="_blank">액티비티 호스트센터</a><span>|</span></li>
        <li><a href="//hotel.goodchoice.kr/" target="_blank">HOTEL 여기어때</a><span>|</span></li>
        <li><a href="https://www.goodchoice.kr/more/contentsInfo">콘텐츠산업진흥법에의한 표시</a></li>
      </ul>
      <p>
        <b>고객행복센터 1670-6250</b>
        오전 9시 - 새벽 3시
      </p>
      <address>
        <span>(주) 여기어때컴퍼니</span>
        주소 : 서울특별시 강남구 봉은사로 479, 479타워 11층<br>
        대표이사 : 최문석 | 사업자등록번호: 742-86-00224<br>
        통신판매번호 : 2017-서울강남-01779 | 관광사업자 등록번호: 제1026-24호<br>
        전화번호 : 1670-6250<br>
        전자우편주소 : help@goodchoice.kr<br>
        Copyright GC COMPANY Corp. All rights reserved.
      </address>
      <div class="ico">
        <a href="//www.facebook.com/goodchoiceofficial" target="_black" class="icon-icn_login_facebook"><span>여기어때 페이스북</span></a>
        <a href="//blog.within.co.kr" target="_black" class="icon-ic_blog"><span>여기어때 블로그</span></a>
        <a href="//post.naver.com/my.nhn?memberNo=25599212" target="_black" class="icon-ic_naverpost"><span>네이버포스트</span></a>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'AppFooter',
  data () {
    return {
      currentYear: new Date().getFullYear()
    }
  }
}
</script>

<style scoped>
.footer .align {
  width: 1024px;
  margin: 0 auto;
}
.footer .link {
  overflow: hidden;
}
.footer .link li {
  float: left;
  line-height: normal;
  margin-bottom: 13px;
}
.footer .link li a {
  display: inline-block;
}
.footer a {
  color: rgba(0,0,0,0.38);
}
.footer .link li span {
  display: inline-block;
  position: relative;
  top: -2px;
  width: 24px;
  font-size: 11px;
  text-align: center;
}
.footer .link li:nth-of-type(3) a {
  color: rgba(0,0,0,0.87);
}
.footer .link li button {
  font-size: 13px;
  padding: 0;
  border: none;
  background: none;
  line-height: 1;
  color: rgba(0,0,0,0.38);
}
.footer .link li:nth-child(4) span, footer .link li:nth-child(7) span, footer .link li:nth-child(8) span {
  display: inline-block;    /*1024보다 작아질 때 - display: none;*/
}
.footer .link li:nth-child(5), footer .link li:nth-child(8) {
  clear: none;    /*1024보다 작아질 때 - clear: none;*/
}
.footer .link li:last-child {
  margin-bottom: 0;   /*1024보다 작아질 때 - clear: both;*/
}
.footer p {
  clear: both;
  padding: 37px 0 24px 0;
  display: block;
  margin-block-start: 1em;
  margin-block-end: 1em;
  margin-inline-start: 0px;
  margin-inline-end: 0px;
}
.footer p b {
  display: inline-block;    /*display: block;*/
  margin-right: 10px;
}
.footer address {
  line-height: 22px;
}
.footer address span {
  display: block;
  padding-bottom: 7px;
}
.footer .ico {
  margin: 26px 0 0 0;
  overflow: hidden;
  margin-top: 20px;
  padding: 20px 0 5px 0;
  border-top: 1px solid rgba(0,0,0,0.04);
}
.footer .ico a {
  display: inline-block;
  margin-right: 25px;
  float: left;
  margin-right: 10px;
  font-size: 22px;
  color: rgba(0,0,0,0.48);
}
[class^="icon-"], [class*=" icon-"] {
  font-family: 'icomoon' !important;
  speak: none;
  font-style: normal;
  font-weight: normal;
  font-variant: normal;
  text-transform: none;
  line-height: 1;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}
/*아이콘*/
/*
.icon-icn_login_facebook:before {
  content: "\e90b";
}
.icon-ic_blog:before {
  content: "\e908";
}
*/
.footer .ico span {
  display: inline-block;
  overflow: hidden;
  width: 0;
  text-indent: -9999px;
}
</style>
