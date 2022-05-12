<template>
  <div>
    <h3>게시물 목록</h3>
    <table border="1">
      <tr>
        <th align="right" width="400">아이디</th>
      </tr>
      <tr v-if="!businessMembers || (Array.isArray(businessMembers) && businessMembers.length === 0)">
        <td colspan="1">
          현재 사업자 회원이 없습니다!
        </td>
      </tr>
      <tr v-else v-for="(businessMember, index) in businessMembers" :key="index">
        <td align="center">
          {{ businessMember.userId }}
        </td>
      </tr>
    </table>

    <v-spacer></v-spacer>
    <button class="teal lighten-4" @click="fetchBusinessMember">사업자 고객 확인</button>
  </div>
</template>

<script>
//import axios from "axios";
import {mapActions, mapState} from "vuex";

export default {
  name: "LookBusinessMemberForm.vue",
  computed: {
    ...mapState(['businessMembers'])
  },
  methods: {
    ...mapActions(['fetchBusinessMember']),
    /*
    findBusinessMember () {
      axios.get('http://localhost:7777/63th/jpaMember/checkBusiness')
          .then(res => {
            alert('처리 성공! - ' + res)

            this.businessMembers = res.data
          })
          .catch(res => {
            alert(res.response.data.message)
          })
    }
     */
  }
}
</script>

<style scoped>

</style>