<template>
  <div class="loginPage">
    <section>
      <form action="">
        <input type="hidden">
        <div class="title">
          <strong class="logo">
            <a href="https://www.goodchoice.kr/">여기어때</a>
          </strong>
        </div>
        <button class="btn_start btn_kakao">
          <span><i class="kakao"></i>
          카카오톡으로 로그인
          </span>
        </button>
        <button class="btn_start btn_facebook">
          <span>
            <i class="facebook"></i>
            Facebook으로 로그인
          </span>
        </button>
        <button class="btn_start btn_naver">
          <span><i class="naver"></i>
          네이버로 로그인
          </span>
        </button>
        <p class="space_or">
          <span>또는</span>
        </p>
        <div class="inputType1 ico_email form_error">
          <input type="email" name="uid" placeholder="이메일 주소" required="" class="required" value="" data-msg-required="이메일 주소를 입력해 주세요.">
          <button type="button" class="reset_val">초기화</button>
        </div>
        <div class="inputType1 ico_pw form_error">
          <input type="password" name="upw" placeholder="비밀번호" required="" class="required" data-msg-required="비밀번호를 입력해 주세요.">
          <button type="button" class="reset_val">초기화</button>
        </div>
        <button class="btn_start redb" type="submit"><span>로그인</span></button>
        <div class="link_half">
          <div><a href="https://www.goodchoice.kr/user/passwdResetStart"><span>비밀번호 재설정</span></a></div>
          <div><a href="https://www.goodchoice.kr/user/join"><span>회원가입</span></a></div>
        </div>
      </form>
    </section>
  </div>
</template>

<script>
export default {
  name: 'loginPage',
  components: {
  },
  data () {
    return {
    }
  },
  methods: {
  }
}
</script>

<style scoped>
  .btn_start span{
    display: inline-block;
  }
  .btn_kakao{
    background: rgb(252,229,30);
    color: rgb(59,29,20);
  }
  .btn_facebook{
    background: rgb(24,119,242);
    color: #fff;
  }
  .btn_naver{
    background: rgb(40,209,17);
    color: #fff;
  }
  i.kakao:before {
    content: "\e904";
  }
  i.facebook:before {
    content: "\e90b";
  }
  i.naver:before {
    content: "\e903";
  }
  .space_or{
    height: 56px;
    margin-bottom: 8px;
    position: relative;

  }
  .space_or span{
    width: 60px;
    height: 56px;
    margin: 0 0 0 -25px;
    font-size: 16px;
    line-height: 56px;
    display: inline-block;
    position: absolute;
    top: 0;
    left: 50%;
    z-index: 10;
    background: #fff;
    color: rgba(0,0,0,0.38);
    text-align: center;
  }
  .space_or:after{
    content: '';
    position: absolute;
    top: 50%;
    left: 0;
    width: 100%;
    height: 1px;
    background: rgba(0,0,0,0.08);
  }
  .inputType1{
    height: 48px;
    padding: 0 16px 0 46px;
    position: relative;
    margin-bottom: 8px;
    border: 1px solid rgba(0,0,0,0.26);
    border-radius: 4px;
    box-sizing: border-box;
  }
  .ico_pw:after {
    display: inline-block;
    content: '';
    position: absolute;
    top: 15px;
    left: 15px;
    width: 18px;
    height: 15px;
    background: url(//image.goodchoice.kr/images/web_v3/ico_inp_pw.png) 50% 0 no-repeat;
    background-size: 14px auto;
  }
  .ico_email:after {
    display: inline-block;
    content: '';
    position: absolute;
    top: 15px;
    left: 15px;
    width: 18px;
    height: 14px;
    background: url(//image.goodchoice.kr/images/web_v3/ico_inp_mail.png) 0 0 no-repeat;
    background-size: 18px auto;
  }
  input{
    position: relative;
    top: 11px;
    width: 100%;
    height: 24px;
    font-size: 18px;
    padding: 0;
    border: none;
    vertical-align: top;
    appearance: none;
    -webkit-appearance: none;
    -moz-appearance: none;
    border-radius: 0;
    font-family: "Apple SD Gothic Neo","맑은 고딕","맑은고딕","Malgun Gothic",sans-serif;
    -webkit-tap-highlight-color:rgba(0,0,0,0);
    outline: 0;
  }
  .reset_val{
    visibility: hidden;
    position: absolute;
    top: 50%;
    right: 14px;
    width: 20px;
    height: 20px;
    margin-top: -10px;
    border: none;
    background: url(//image.goodchoice.kr/images/web_v3/ico_reset.png) 50% 50% no-repeat;
    background-size: 20px auto;
    text-indent: -9999px;
    display: none;
    border: none;
  }
  .redb {
    color: #fff;
    background: linear-gradient(to right, rgba(255,0,85,1) 1%,rgba(230,34,67,1) 100%);
  }
  .link_half{
    overflow: hidden;
    position: relative;
    height: 56px;
    margin-top: 9px;
  }
  .link_half:after{
    display: inline-block;
    content: '';
    position: absolute;
    top: 21px;
    left: 50%;
    width: 1px;
    height: 16px;
    background: rgba(0,0,0,0.08);
  }
  .link_half div{
    display: inline-block;
    float: left;
    width: 50%;
    height: 56px;
    text-align: center;

  }
  .link_half div a{
    color: rgba(0,0,0,0.87);
    vertical-align: top;
    -webkit-tap-highlight-color: rgba(0,0,0,0);
    cursor: pointer;
    height: 56px;
    font-size: 16px;
    line-height: 56px;
    text-decoration: none;
  }
  .link_half div a span{

  }
</style>
