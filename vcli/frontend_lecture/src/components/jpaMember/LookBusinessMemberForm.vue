<template>
  <div>
    <h3>게시물 목록</h3>
    <table border="1">
      <tr>
        <th align="center" width="300">아이디</th>
        <th align="center" width="300">권한</th>
      </tr>
      <tr v-if="!businessMembers || (Array.isArray(businessMembers) && businessMembers.length === 0)">
        <td colspan="1">
          현재 사업자 회원이 없습니다!
        </td>
      </tr>
      <tr v-else v-for="(businessMember, index) in businessMembers" :key="index">
        <td align="center">
          {{ businessMember.id }}
        </td>
        <td align="center">
          {{ board.regDate }}
        </td>
      </tr>
    </table>
  </div>
</template>

<script>
export default {
  name: "LookBusinessMemberForm.vue"
}
</script>

<style scoped>

</style>