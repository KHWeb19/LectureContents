<template>
  <div>
    <div>
      <h2>Login</h2>
    </div>
    <login-form @submit="onSubmit"/>
    <v-spacer></v-spacer>
    <v-btn tile color="teal lighten-4" @click="logout">
      <v-icon left>
        mdi-logout
      </v-icon>
      로그 아웃
    </v-btn>
  </div>
</template>

<script>

import LoginForm from '@/components/jpaMember/LoginForm.vue'
import Vue from 'vue'
import axios from 'axios'
import cookies from 'vue-cookies'

Vue.use(cookies)

export default {
  name: "LoginTestPage.vue",
  components: {
    LoginForm
  },
  data () {
    return {
      isLogin: false
    }
  },
  mounted() {
    this.$store.state.userInfo = this.$cookies.get("user")

    if (this.$store.state.userInfo != null) {
      this.isLogin = true
    } else {
      this.isLogin = false
    }
  },
  methods: {
    onSubmit (payload) {
      if (!this.isLogin) {
        const {id, pw} = payload
        axios.post('http://localhost:7777/vueJpaMemberAuth/login', {id, pw})
            .then(res => {
              if (res.data) {
                alert('로그인 성공!')
                this.$store.state.userInfo = res.data
                this.$cookies.set("user", res.data, 30)
                this.isLogin = true
              }
            })
            .catch(res => {
              alert(res.response.data.message)
            })
      } else {
        alert('이미 로그인이 되어 있습니다!')
      }
    },
    logout () {
      this.$cookies.remove("user")
      this.isLogin = false
      this.$store.state.userInfo = null

      alert('로그아웃 성공!')
    }
  }
}

</script>

<style scoped>

</style>