<template>
  <div class="home">
        <div id="header">
            <router-link :to="{ name: 'Home' }">
                &nbsp;Home&nbsp;
            </router-link>
            <router-link :to="{ name: 'Test' }">
                &nbsp;Test&nbsp;
            </router-link>
            <router-link :to="{ name: 'BoardListPage' }">
                &nbsp;BoardListPage&nbsp;
            </router-link>
            <router-link :to="{ name: 'Concave' }"
                    class="nav-link"
                    active-class="active">
                &nbsp;이것이 삼목이닷!&nbsp;
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
