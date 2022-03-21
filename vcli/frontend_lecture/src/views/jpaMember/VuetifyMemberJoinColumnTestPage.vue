<template>
  <div>
    <div align="center">
      <h2>회원 가입</h2>
    </div>

    <vuetify-member-join-column-test-form @submit="onSubmit"/>
    <!--
    <v-spacer></v-spacer>
    <v-btn tile color="teal" @click="onJpaTest">
      <v-icon left>
        mdi-ads_click
      </v-icon>
      클릭하세요!
    </v-btn> -->
  </div>
</template>

<script>

import VuetifyMemberJoinColumnTestForm from '@/components/jpaMember/VuetifyMemberJoinColumnTestForm.vue'
import axios from 'axios'

export default {
  name: "VuetifyMemberJoinColumnTestPage",
  components: {
    VuetifyMemberJoinColumnTestForm
  },
  methods: {
    onSubmit (payload) {
      const { id, pw, auth } = payload
      axios.post('http://localhost:7777/vueJpaMemberAuth/register', { id, pw, auth })
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