<template>
  <div>
    <div align="center">
      <h2>회원 가입</h2>
    </div>

    <vuetify-member-register-form @submit="onSubmit"/>
  </div>
</template>

<script>

import VuetifyMemberRegisterForm from '@/components/jpaMember/VuetifyMemberRegisterForm.vue'
import axios from 'axios'

export default {
  name: "VuetifyMemberRegisterPage.vue",
  components: {
    // eslint-disable-next-line vue/no-unused-components
    VuetifyMemberRegisterForm
  },
  methods: {
    onSubmit (payload) {
      const { id, pw } = payload
      axios.post('http://localhost:7777/vueJpaMember/register', { id, pw })
        .then(res => {
          alert('등록 성공! - ' + res)
        })
        .catch(res => {
          alert(res.response.data.message)
        })
    }
  }
}

</script>

<style scoped>

</style>