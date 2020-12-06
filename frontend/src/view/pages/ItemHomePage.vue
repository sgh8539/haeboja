<template>
  <div class="listpage recommend_wrap bg_area_01">
    <item-list-header :itemData="itemListHeaderData"></item-list-header>
    <item-list :itemList="itemList"></item-list>
  </div>
</template>

<script>
  import ItemListHeader from '../components/itemList/ItemListHeader.vue'
  import ItemList from '../components/itemList/ItemList'
  export default {
    name: 'ItemHomePage',
    components: {
      ItemListHeader,
      ItemList,
    },
    data () {
      return {
        itemListHeaderData:{
          location:"서울지역편"
        },
        itemList:[
          {
            name:"종로호텔",
            recommend:{
              score:9.1,
              reviews: 250,
            },
            price:{
              goodPrice:true,
              stay:25000,
              sleep:35000
            },
            address:"종로구 관철동",
            notice:"평일 1시 이전 입실시 최대 8시간 이용가능~",
            paybackRoom:false,
            link:"#",
            imgLink:false,
          },
          {
            name:"종로호텔",
            recommend:{
              score:9.1,
              reviews: 250,
            },
            price:{
              goodPrice:true,
              stay:25000,
              sleep:35000
            },
            address:"종로구 관철동",
            notice:"평일 1시 이전 입실시 최대 8시간 이용가능~",
            paybackRoom:false,
            link:"#",
            imgLink:false,
          }
        ]
      }
    },
    methods: {
    }
  }
</script>

<style scoped>
</style>
