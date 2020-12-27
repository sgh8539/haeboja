<template>
  <div class="listpage recommend_wrap bg_area_01">
    <item-list-header :itemData="itemListHeaderData"></item-list-header>
    <item-list :itemList="itemList"></item-list>
    <h1>{{index}}</h1>
  </div>
</template>

<script>
  import ItemListHeader from '../components/itemList/ItemListHeader.vue'
  import ItemList from '../components/itemList/ItemList'
  import {getDetailList} from '../../services/HaebojaService'

  export default {
    name: 'ItemHomePage',
    components: {
      ItemListHeader,
      ItemList,
    },
    data () {
      return {
        index: this.$route.params.id,
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


    },
    mounted () {
      getDetailList(this.index)
        .then(res=>{
          // for i
          // id;
          // name;
          // private String address;
          // private double score;
          // private int dayStayLowestPrice;
          // private int nightStayLowestPrice;
        })
        .catch(err=>console.log(err));
    }
  }
</script>

<style scoped>
</style>
