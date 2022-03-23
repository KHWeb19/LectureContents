<template>
  <div>
    <div>
      <h2>Login</h2>
    </div>
    <login-form @submit="onSubmit"/>
  </div>
</template>

<script>

import LoginForm from '@/components/jpaMember/LoginForm.vue'
import axios from 'axios'

export default {
  name: "LoginTestPage.vue",
  components: {
    LoginForm
  },
  methods: {
    onSubmit (payload) {
      const { id, pw } = payload
      axios.post('http://localhost:7777/vueJpaMemberAuth/login', { id, pw })
          .then(res => {
            if (res.data) {
              alert('로그인 성공!')
            }
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