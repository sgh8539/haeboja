<template>
  <article class="room_info on">
    <div class="btn_date"></div>
    <room-card v-for="(item,index) in roomList" :key="index" :roomItem="item"></room-card>
  </article>
</template>

<script>
  // import liImageLink from '../components/home/liImageLink.vue'
  import RoomCard from './RoomCard'
  export default {
    name: 'RoomInfo',
    components: {
      RoomCard
    },
    data () {
      return {
        roomList:[
          {
            title:"[레이트버드 특가] 스탠다드 더블 (17시 체크인)",
            originalPrice:"308,000",
            price:"84,700",
            reserveButton:{
              type:"gra_left_right_red",
              content:"예약"
            },
            popupContent:{
              basic:[ "2인 기준 최대 2인","더블배드 1개","객실+욕실 / 7.00평"],
              goodies: "침대, TV, 냉장고, 미니바, 개인금고, 헤어드라이기, 욕실용품, 생수 1병 및 커피, 샤워가운",
              additionalInfo:"선착순! 룸업  / 커피 or 맥주 쿠폰 (2인)"
            }
          }
        ]
      }
    },
    methods: {
    }
  }
</script>

<style scoped>
  .room_info {
    width: 962px;
    margin: 0 auto;
  }
</style>
