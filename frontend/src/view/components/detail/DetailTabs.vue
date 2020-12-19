<template>
  <div class="tab">
    <button :class="{on:selectedTab===1}" @click="changeTab(1)">객실안내/예약</button>
    <button :class="{on:selectedTab===2}" @click="changeTab(2)">숙소정보</button>
    <button :class="{on:selectedTab===3}" @click="changeTab(3)">리뷰</button>
  </div>
</template>

<script>
  export default {
    name: 'DetailTabs',
    components: {
    },
    data () {
      return {
        selectedTab:1
      }
    },
    methods: {
      changeTab(index){
        this.selectedTab = index;
        this.$emit("tabChange",index)
      }
    }
  }
</script>

<style scoped>
  .tab {
    width: 962px;
    margin: 0 auto;
    padding: 0 16px;
    margin-top: 38px;
  }
  .tab {
    clear: both;
    overflow: hidden;
    border-bottom: 1px solid rgba(0,0,0,0.08);
  }
  .tab .on {
    border-bottom: 3px solid rgb(242,17,76);
    font-weight: bold;
    color: rgb(230,28,81);
  }
  .tab button {
    float: none;
    width: auto;
    height: 72px;
    margin-right: 24px;
    padding: 0;
    border: none;
    border-bottom: 2px solid #fff;
    background: none;
    font-size: 18px;
    color: rgba(0,0,0,0.38);
  }
  .tab button:nth-child(2) {
    width: auto;
  }
</style>
