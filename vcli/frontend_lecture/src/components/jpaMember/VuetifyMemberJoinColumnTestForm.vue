<template>
  <v-container>
    <form @submit.prevent="onSubmit">
      <h3>회원 가입 양식</h3>

      <div class="row">
        <v-radio-group v-model="radioGroup" row>
          <!-- 기존에 사용하던 형식의 문법이 마겨서 아래와 같이 작업해야함
               다소 번거로움이 추가됨 -->
          <v-radio :label="`${kindsOfMember[0]}`" :value="`${kindsOfMember[0]}`"></v-radio>
          <v-radio :label="`${kindsOfMember[1]}`" :value="`${kindsOfMember[1]}`"></v-radio>
        </v-radio-group>
      </div>

      <table>
        <tr>
          <td>아이디</td>
          <td><input style="border: 1px solid black;" type="text" v-model="id"></td>
        </tr>
        <tr>
          <td>비밀번호</td>
          <td><input style="border: 1px solid black;" type="password" v-model="pw"></td>
        </tr>
      </table>

      <div>
        <button type="submit">등록</button>
        <router-link :to="{ name: 'Home' }">
          취소
        </router-link>
      </div>
    </form>
  </v-container>
</template>

<script>

export default {
  name: "VuetifyMemberRegisterForm.vue",
  data () {
    return {
      radioGroup: 1,
      kindsOfMember: [
        '개인',
        '사업자'
      ],
      id: '',
      pw: ''
    }
  },
  methods: {
    onSubmit () {
      const { id, pw, radioGroup } = this
      const auth = (radioGroup == '개인' ? '개인' : '사업자')
      this.$emit('submit', { id, pw, auth })
    }
  }
}

</script>

<style scoped>



</style>