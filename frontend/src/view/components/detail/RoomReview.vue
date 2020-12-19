<template>
  <article class="review on">
    <div class="score_top">
      <strong>추천해요</strong>
      <star-review :styleStar="'bg'" :score="reviewList.totalReview.avgReview"></star-review>
      <p>
        전체리뷰 <b>{{reviewList.totalReview.reviewTotalCount}}</b><span>|</span>제휴점 답변 <b>{{reviewList.totalReview.companyTotalCount}}</b>
      </p>
    </div>
    <ul>
      <review-card v-for="(item,index) in reviewList.reviewItem" :key="index" :reviewItem="item"></review-card>
    </ul>

  </article>
</template>

<script>
  import ReviewCard from './ReviewCard.vue'
  import StarReview from './StarReview'
  export default {
    name: 'RoomReview',
    components: {
      ReviewCard,StarReview
    },
    data () {
      return {
        reviewList:{
          pageNation:1,
          totalReview:{
            avgReview:9.1,
            reviewTotalCount:268,
            companyTotalCount:84,
          },
          reviewItem:[
            {
              id:{
                profileIcon:"good"
              },
              title:"여기만한 곳은 어디에도 없을 거예요.",
              score:"10",
              category:"시네마(영화룸,Netflix) 객실 이용 · 핵심적인그랜트",
              content:"깨끗하고 좋았어요. 시네마룸 사용했습니다. 넷플릭스 볼때 빔이 중간중간 지지직 했어요! 한번 점검해보시면 좋을듯!! 👍👍\n",
              time:"2020.10.09"
            },
          ]
        }

      }
    },
    methods: {
    }
  }
</script>

<style scoped>
  article.on {
    display: block;
  }
  .review {
    width: 962px;
    margin: 0 auto;
  }
  .review .score_top {
    padding: 44px 0;
    text-align: center;
  }
  .review .score_top strong {
    display: block;
    padding: 0 0 10px 0;
    font-size: 24px;
    font-weight: normal;
    text-align: center;
  }
  .review .score_wrap {
    display: inline-block;
    overflow: hidden;
    text-align: center;
  }
  .review .score_top p {
    margin-top: 22px;
    font-size: 18px;
  }
  .review .score_top p b {
    font-size: 20px;
    font-weight: normal;
  }
  .review .score_top p span {
    display: inline-block;
    width: 32px;
    color: rgba(0,0,0,0.08);
  }

</style>
