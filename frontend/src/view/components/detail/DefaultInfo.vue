<template>
  <article class="detail_info">
    <button id="default_info_tab" @click="changeDropdown(1)" class="category" :class="{on:selectedDropdown===1}">
      <span>기본정보</span>
    </button>
    <section :class="{on:selectedDropdown===1}" class="default_info" >
      <h3>주변정보</h3>
      <ul>
        <li>역삼역 도보 4분</li><li>롯데월드 차량 25분</li></ul>
      <h3>기본 정보</h3>
      <ul>
        <li>체크인 : 14:00 | 체크아웃 : 12:00</li><li>무료 Wi-Fi </li><li>전 객실 금연</li><li>Bath Amenity (치약, 칫솔 유료)</li><li>무료 주차 (객실 당 1대)</li></ul>
      <h3>인원 추가 정보</h3>
      <ul>
        <li><b>전 객실 인원추가 불가</b></li></ul>
      <h3>투숙객 혜택</h3>
      <ul>
        <li>객실 내 생수 1병, 커피 / 차 제공</li></ul>
      <h3>부대시설</h3>
      <ul>
        <li>레스토랑 / 2층 / 중식 : (월~금) 11:30~14:30, 석식 : 18:00~22:00 </li><li>엠 카페 (카페) / 1층 로비 / 10:00~22:00 </li><li>클라우드 바 (Bar) / 21층 / 18:00~02:00(월~토), 18:00~01:00 (일) / 17:30~18:00</li><li>프리빌리지 라운지 (라운지) / 1층 로비 / 10:00~22:00 (해피아워 18:00~20:00)</li><li>세탁실 / 지하 1층 / 24시간 (연중무휴) 비즈니스 센터, 연회장, 세탁실</li><li>피트니스 / 06:00~22:00 / 매달 첫째주 월요일 휴관</li><li>사우나 / 06:00~22:00 / 매달 첫째주 월요일 휴관 / 1인 5,500원</li></ul>
      <h3>조식 정보</h3>
      <ul>
        <li>월-토요일 : American Breakfast 로 제공 (오믈렛, 과일,요거트, 크로아상,소세지, 샐러드, 커피) 또는 한식 한상차림 중 택 1</li><li>일요일 : 조식 뷔페 제공 / 거리두기 2단계 이상 시 American Breakfast로 제공 (성인 1인 22,000원, 소인 1인 11,000원)</li><li>주중 07:00~10:00 / 주말 07:30~11:00</li><li>현장결제</li></ul>
      <h3>취소 및 환불 규정</h3>
      <ul>
        <li>체크인일 기준 1일전 18시까지 : 100% 환불</li><li>체크인일 기준 1일전 18시이후~당일 : 환불불가</li><li>취소, 환불시 수수료가 발생할 수 있습니다</li></ul>
      <h3>확인사항 및 기타</h3>
      <ul>
        <li>거리두기 단계 상향에 따라 일부 시설 이용이 제한될 수 있습니다</li><li>최대인원 초과시 입실 불가합니다</li><li>위의 정보는 호텔의 사정에 따라 변경될 수 있습니다</li><li>해당 이미지는 실제와 상이 할 수 있습니다</li><li>체크인 시 배정 또는 베드타입 미기재 상품은 특정객실과 베드타입을 보장하지 않습니다</li><li>해당 객실가는 세금, 봉사료가 포함된 금액입니다</li><li>미성년자는 보호자 동반없이 이용하실 수 없습니다</li></ul>
<!--      <div class="map" id="google_maps" style="position: relative; overflow: hidden; background: url(&quot;https://t1.daumcdn.net/mapjsapi/images/2x/bg_tile.png&quot;);"><div style="position: absolute; left: 0px; top: 0px; width: 100%; height: 100%; touch-action: none; cursor: url(&quot;https://i1.daumcdn.net/dmaps/apis/cursor/openhand.cur.ico&quot;) 7 5, url(&quot;https://i1.daumcdn.net/dmaps/apis/cursor/openhand.cur.ico&quot;), default;"><div style="position: absolute;"><div style="position: absolute; z-index: 0;"></div><div style="position: absolute; z-index: 1; left: 0px; top: 0px;"><img src="https://map1.daumcdn.net/map_2d_hd/2009alo/L3/1970/909.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: -6px; top: 147px; width: 256px; height: 256px;"><img src="https://map2.daumcdn.net/map_2d_hd/2009alo/L3/1970/910.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 250px; top: 147px; width: 256px; height: 256px;"><img src="https://map1.daumcdn.net/map_2d_hd/2009alo/L3/1971/909.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: -6px; top: -109px; width: 256px; height: 256px;"><img src="https://map2.daumcdn.net/map_2d_hd/2009alo/L3/1971/910.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 250px; top: -109px; width: 256px; height: 256px;"><img src="https://map3.daumcdn.net/map_2d_hd/2009alo/L3/1970/911.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 506px; top: 147px; width: 256px; height: 256px;"><img src="https://map3.daumcdn.net/map_2d_hd/2009alo/L3/1971/911.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 506px; top: -109px; width: 256px; height: 256px;"><img src="https://map0.daumcdn.net/map_2d_hd/2009alo/L3/1970/912.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 762px; top: 147px; width: 256px; height: 256px;"><img src="https://map1.daumcdn.net/map_2d_hd/2009alo/L3/1970/913.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 1018px; top: 147px; width: 256px; height: 256px;"><img src="https://map0.daumcdn.net/map_2d_hd/2009alo/L3/1971/912.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 762px; top: -109px; width: 256px; height: 256px;"><img src="https://map1.daumcdn.net/map_2d_hd/2009alo/L3/1971/913.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 1018px; top: -109px; width: 256px; height: 256px;"></div><div style="position: absolute; z-index: 1;"></div><div style="position: absolute; z-index: 1; width: 849px; height: 160px;"></div><div style="position: absolute; z-index: 1;"><svg version="1.1" style="stroke: none; stroke-dashoffset: 0.5; stroke-linejoin: round; fill: none; transform: translateZ(0px); position: absolute; left: -1698px; top: -320px; width: 4245px; height: 800px;" viewBox="0 0 4245 800"><defs></defs></svg></div><div style="position: absolute; z-index: 1; width: 100%; height: 0px; transform: translateZ(0px);"><div style="position: absolute; margin: -46px 0px 0px -18px; z-index: 0; left: 425px; top: 80px; display: block;"><img draggable="false" src="//image.goodchoice.kr/images/web_v3/ico_map_3.png" alt="" title="" style="min-width: 0px; min-height: 0px; max-width: 99999px; max-height: none; border: 0px; display: block; position: absolute; user-select: none; -webkit-user-drag: none; clip: rect(0px, 38px, 47px, 0px); top: 0px; left: 0px; width: 38px; height: 47px;"></div></div></div></div><div style="position: absolute; cursor: default; z-index: 1; margin: 0px 6px; height: 19px; line-height: 14px; left: 0px; bottom: 0px; color: rgb(0, 0, 0);"><div style="color: rgb(0, 0, 0); text-align: center; font-size: 10px; float: left;"><div style="float: left; margin: 2px 3px 0px 4px; height: 6px; transition: width 0.1s ease 0s; border-top: none rgb(0, 0, 0); border-right: 2px solid rgb(0, 0, 0); border-bottom: 2px solid rgb(0, 0, 0); border-left: 2px solid rgb(0, 0, 0); border-image: initial; width: 46px;"></div><div style="float: left; margin: 0px 4px 0px 0px; font-family: AppleSDGothicNeo-Regular, 돋움, dotum, sans-serif; font-weight: bold; color: rgb(0, 0, 0);">50m</div></div><div style="margin: 0px 4px; float: left;"><a target="_blank" href="http://map.kakao.com/" title="Kakao 지도로 보시려면 클릭하세요." style="float: left; width: 32px; height: 10px;"><img src="https://t1.daumcdn.net/mapjsapi/images/2x/m_bi_b.png" alt="Kakao 지도로 이동" style="float: left; width: 32px; height: 10px; border: none;"></a><div style="font: 11px / 11px Arial, Tahoma, Dotum, sans-serif; float: left;"></div></div></div><div style="cursor: auto; position: absolute; z-index: 2; left: 0px; top: 0px;"></div><div style="position: absolute; left: 0px; top: 0px; width: 100%; height: 100%; touch-action: none; cursor: url(&quot;https://i1.daumcdn.net/dmaps/apis/cursor/openhand.cur.ico&quot;) 7 5, url(&quot;https://i1.daumcdn.net/dmaps/apis/cursor/openhand.cur.ico&quot;), default;"><div style="position: absolute; left: -44px; top: 11px;"><div style="position: absolute; z-index: 1; left: 0px; top: 0px;"><img src="https://map1.daumcdn.net/map_2d_hd/2009alo/L4/985/453.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: -80px; top: -26px; width: 256px; height: 256px;"><img src="https://map2.daumcdn.net/map_2d_hd/2009alo/L4/985/454.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 176px; top: -26px; width: 256px; height: 256px;"><img src="https://map3.daumcdn.net/map_2d_hd/2009alo/L4/985/455.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 432px; top: -26px; width: 256px; height: 256px;"><img src="https://map0.daumcdn.net/map_2d_hd/2009alo/L4/985/456.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 688px; top: -26px; width: 256px; height: 256px;"><img src="https://map1.daumcdn.net/map_2d_hd/2009alo/L4/985/457.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 944px; top: -26px; width: 256px; height: 256px;"><img src="https://map1.daumcdn.net/map_2d_hd/2009alo/L4/986/453.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: -80px; top: -282px; width: 256px; height: 256px;"><img src="https://map2.daumcdn.net/map_2d_hd/2009alo/L4/986/454.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 176px; top: -282px; width: 256px; height: 256px;"><img src="https://map3.daumcdn.net/map_2d_hd/2009alo/L4/986/455.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 432px; top: -282px; width: 256px; height: 256px;"><img src="https://map0.daumcdn.net/map_2d_hd/2009alo/L4/986/456.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 688px; top: -282px; width: 256px; height: 256px;"><img src="https://map1.daumcdn.net/map_2d_hd/2009alo/L4/986/457.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 944px; top: -282px; width: 256px; height: 256px;"></div><div style="position: absolute; z-index: 0; left: 0px; top: 0px;"><img src="https://map2.daumcdn.net/map_2d_hd/2009alo/L2/3942/1818.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 304px; top: 38px; width: 64px; height: 64px;"><img src="https://map3.daumcdn.net/map_2d_hd/2009alo/L2/3942/1819.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 368px; top: 38px; width: 64px; height: 64px;"><img src="https://map0.daumcdn.net/map_2d_hd/2009alo/L2/3942/1820.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 432px; top: 38px; width: 64px; height: 64px;"><img src="https://map1.daumcdn.net/map_2d_hd/2009alo/L2/3942/1821.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 496px; top: 38px; width: 64px; height: 64px;"><img src="https://map2.daumcdn.net/map_2d_hd/2009alo/L2/3942/1822.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 560px; top: 38px; width: 64px; height: 64px;"><img src="https://map2.daumcdn.net/map_2d_hd/2009alo/L2/3943/1818.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 304px; top: -26px; width: 64px; height: 64px;"><img src="https://map3.daumcdn.net/map_2d_hd/2009alo/L2/3943/1819.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 368px; top: -26px; width: 64px; height: 64px;"><img src="https://map0.daumcdn.net/map_2d_hd/2009alo/L2/3943/1820.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 432px; top: -26px; width: 64px; height: 64px;"><img src="https://map1.daumcdn.net/map_2d_hd/2009alo/L2/3943/1821.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 496px; top: -26px; width: 64px; height: 64px;"><img src="https://map2.daumcdn.net/map_2d_hd/2009alo/L2/3943/1822.png" alt="" draggable="false" style="position: absolute; user-select: none; -webkit-user-drag: none; min-width: 0px; min-height: 0px; max-width: none; max-height: none; left: 560px; top: -26px; width: 64px; height: 64px;"></div><div style="position: absolute; z-index: 1;"></div><div style="position: absolute; z-index: 1; width: 849px; height: 160px;"></div><div style="position: absolute; z-index: 1;"><svg version="1.1" style="stroke: none; stroke-dashoffset: 0.5; stroke-linejoin: round; fill: none; transform: translateZ(0px); position: absolute; left: -1654px; top: -331px; width: 4245px; height: 800px;" viewBox="0 0 4245 800"><defs></defs></svg></div><div style="position: absolute; z-index: 1; width: 100%; height: 0px; transform: translateZ(0px);"><div style="position: absolute; margin: -46px 0px 0px -18px; z-index: 0; left: 519px; top: 69px; display: block;"><img draggable="false" src="//image.goodchoice.kr/images/web_v3/ico_map_3.png" alt="" title="" style="min-width: 0px; min-height: 0px; max-width: 99999px; max-height: none; border: 0px; display: block; position: absolute; user-select: none; -webkit-user-drag: none; clip: rect(0px, 38px, 47px, 0px); top: 0px; left: 0px; width: 38px; height: 47px;"></div></div></div></div><div style="position: absolute; cursor: default; z-index: 1; margin: 0px 6px; height: 19px; line-height: 14px; left: 0px; bottom: 0px; color: rgb(0, 0, 0);"><div style="color: rgb(0, 0, 0); text-align: center; font-size: 10px; float: left;"><div style="float: left; margin: 2px 3px 0px 4px; height: 6px; transition: width 0.1s ease 0s; border-top: none rgb(0, 0, 0); border-right: 2px solid rgb(0, 0, 0); border-bottom: 2px solid rgb(0, 0, 0); border-left: 2px solid rgb(0, 0, 0); border-image: initial; width: 46px;"></div><div style="float: left; margin: 0px 4px 0px 0px; font-family: AppleSDGothicNeo-Regular, 돋움, dotum, sans-serif; font-weight: bold; color: rgb(0, 0, 0);">100m</div></div><div style="margin: 0px 4px; float: left;"><a target="_blank" href="http://map.kakao.com/" title="Kakao 지도로 보시려면 클릭하세요." style="float: left; width: 32px; height: 10px;"><img src="https://t1.daumcdn.net/mapjsapi/images/2x/m_bi_b.png" alt="Kakao 지도로 이동" style="float: left; width: 32px; height: 10px; border: none;"></a><div style="font: 11px / 11px Arial, Tahoma, Dotum, sans-serif; float: left;"></div></div></div><div style="cursor: auto; position: absolute; z-index: 2; left: 0px; top: 0px;"></div></div>-->
    </section>
    <button class="category" @click="changeDropdown(2)" :class="{on:selectedDropdown===2}">
      <span>편의시설 및 서비스</span>
    </button>
    <section :class="{on:selectedDropdown===2}" class="default_info"></section>
  </article>
</template>

<script>
  // import liImageLink from '../components/home/liImageLink.vue'

  export default {
    name: 'DefaultInfo',
    components: {
    },
    data () {
      return {
        selectedDropdown:1,
      }
    },
    methods: {
      changeDropdown(index){
        if (this.selectedDropdown === index){
          this.selectedDropdown = 0;
        } else{
          this.selectedDropdown = index;
        }
      }
    }
  }
</script>

<style scoped>
  .detail_info {
    display:block;
    width: 962px;
    margin: 0 auto;
    border-bottom: 1px solid rgba(0,0,0,0.08);
  }
  .detail_info button:first-child {
    border-top: none;
  }
  .detail_info .on {
    border-bottom: none;
  }
  .detail_info button {
    display: block;
    position: relative;
    height: 80px;
    margin: 0;
    padding: 0 16px;
    border-top: 1px solid rgba(0,0,0,0.08);
    font-size: 18px;
    line-height: 80px;
    width: 100%;
    background: #fff;
    color: rgba(0,0,0,0.87);
    text-align: left;
    cursor: pointer;
    border: none;
    border-top: 1px solid rgba(0,0,0,0.08);
  }
  .detail_info button:after {
    display: inline-block;
    content: "";
    position: absolute;
    top: 50%;
    right: 16px;
    width: 12px;
    height: 8px;
    margin-top: -4px;
    background: #fff url(//image.goodchoice.kr/images/web_v3/ico_arr_3.png) 0 0 no-repeat;
    background-size: 12px auto;
  }
  .detail_info .on:after {
    background: #fff url(//image.goodchoice.kr/images/web_v3/ico_arr_3.png) 0 -8px no-repeat;
    background-size: 12px auto;
  }
  * {
    outline: 0;
  }

  .detail_info .default_info {
    display: none;
    padding: 12px 57px 48px 57px;
  }
  .detail_info .default_info.on {
    display: block;
  }
  .detail_info section {
    overflow: hidden;
    padding: 0 57px;
    margin: 0 0 23px 0;
    border-radius: 5px;
    background: rgb(250,250,250);
  }
  .detail_info .default_info h3 {
    display: block;
    margin: 30px 0 10px 0;
    font-size: 15px;
    color: rgba(0,0,0,0.56);
  }
  .detail_info .default_info ul li {
    padding-left: 14px;
    background: url(//image.goodchoice.kr/images/web_v3/ico_bul_3.png) -1px 0 no-repeat;
    background-size: 12px auto;
  }
  li{
    list-style: none;
  }
  .detail_info .default_info ul {
    font-size: 15px;
    line-height: 24px;
    color: rgba(0,0,0,0.56);
  }
</style>
