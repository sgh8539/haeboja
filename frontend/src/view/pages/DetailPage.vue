<template>
  <div id="content" class="detail">
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
  export default {
    name: 'DetailPage',
    components: {
      DetailTabs,DefaultInfo,RoomInfo,RoomReview
    },
    computed:{
      selectedComponent(){
        switch (this.selectedTab) {
          case(1): return RoomInfo
          case(2): return DefaultInfo
          case(3): return RoomReview
        }
        }
    },
    data () {
      return {
        selectedTab:1
      }
    },
    methods: {
      tabChange(index){
        this.selectedTab = index;
      }
    }
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
</style>
