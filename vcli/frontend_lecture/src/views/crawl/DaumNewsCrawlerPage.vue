<template>
  <Layout>
    <template #menubar>
      <v-btn @click="start('society')" text color="black" style="padding: 10px; width: 90px;">사회</v-btn>
      <v-btn @click="start('digital')" text color="black" style="padding: 10px; width: 90px;">아이티</v-btn>
      <v-btn @click="start('foreign')" text color="black" style="padding: 10px; width: 90px;">국제</v-btn>
      <v-btn @click="start('culture')" text color="black" style="padding: 10px; width: 90px;">문화</v-btn>
    </template>
    <template #content>
      <v-simple-table>
        <template v-slot:default>
          <thead>
            <tr>
              <th class="text-left">No.</th>
              <th class="text-left">제목</th>
            </tr>
          </thead>
          <tbody>
            <tr v-for="(list, index) of crawlLists" :key="index">
              <td style="color: gray">{{ list.newsNo }}</td>
              <td>{{ list.title }}</td>
            </tr>
          </tbody>
        </template>
      </v-simple-table>
    </template>
  </Layout>
</template>

<script>

import Layout from '@/components/crawl/Layout'
import { mapState } from 'vuex'

export default {
  name: "DaumNewsCrawlerPage.vue",
  components: {
    Layout
  },
  computed: {
    ...mapState({ crawlLists: state => state.crawlLists })
  },
  methods: {
    start (category) {
      this.$store.dispatch('crawlFind', category)
    }
  }
}
</script>

<style scoped>

</style>