<template>
  <div class="home">
        <div id="header">
            <router-link style="text-decoration: none;" :to="{ name: 'Home' }">
                &nbsp;Home&nbsp;
            </router-link>
            <router-link style="text-decoration: none;" :to="{ name: 'Test' }">
                &nbsp;Test&nbsp;
            </router-link>
            <router-link style="text-decoration: none;" :to="{ name: 'BoardListPage' }">
                &nbsp;BoardListPage&nbsp;
            </router-link>
            <router-link style="text-decoration: none;" :to="{ name: 'Concave' }">
                &nbsp;이것이 삼목이닷!&nbsp;
            </router-link>
            <router-link style="text-decoration: none;" :to="{ name: 'EventBusTestPage' }">
                &nbsp;이것이 eventbus닷!&nbsp;
            </router-link>
            <router-link style="text-decoration: none;" :to="{ name: 'ProductBoardListPage' }">
                &nbsp;상품게시판(문제은행13번)&nbsp;
            </router-link>
            <router-link style="text-decoration: none;" :to="{ name: 'VuetifyAllInOneTestPage' }">
                &nbsp;Vuetify(뷰티파이) UI Test&nbsp;
            </router-link>
        </div>
  </div>
</template>

<script>
// @ is an alias to /src
//import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'Home',
  components: {
  }
}
</script>