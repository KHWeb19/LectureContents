<template>
  <div class="app">
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
    <router-link style="text-decoration: none;" :to="{ name: 'VuetifyImageTestPage' }">
        &nbsp;Vuetify Image Test&nbsp;
    </router-link>
    <router-link style="text-decoration: none;" :to="{ name: 'CoverFlowTestPage' }">
        &nbsp;Cover Flow Test&nbsp;
    </router-link>
    <router-link style="text-decoration: none;" :to="{ name: 'AwesomeSwiperTestPage' }">
        &nbsp;Awesome Swiper Test&nbsp;
    </router-link>
    <router-link style="text-decoration: none;" :to="{ name: 'ImageGalleryTestPage' }">
        &nbsp;Image Gallery Test&nbsp;
    </router-link>
    <router-link style="text-decoration: none;" :to="{ name: 'CalendarTestPage' }">
        &nbsp;Calendar Test&nbsp;
    </router-link>
    <router-link style="text-decoration: none;" :to="{ name: 'VueFileUploadPage' }">
        &nbsp;File Upload Test&nbsp;
    </router-link>
    <router-link style="text-decoration: none;" :to="{ name: 'VuetifyMemberRegisterPage' }">
      &nbsp;Vuetify Member Register Test&nbsp;
    </router-link>
    <router-link style="text-decoration: none;" :to="{ name: 'VuetifyMemberJoinColumnTestPage' }">
      &nbsp;Vuetify Member Join Column Test&nbsp;
    </router-link>
    <router-link style="text-decoration: none;" :to="{ name: 'LoginTestPage' }">
      &nbsp;Login Test&nbsp;
    </router-link>
    <router-link style="text-decoration: none;" :to="{ name: 'JpaBoardListPage' }">
      &nbsp;Jpa Board List&nbsp;
    </router-link>
    <router-link style="text-decoration: none;" :to="{ name: 'JpaMemberAuthTestPage' }">
      &nbsp;Business Member Check&nbsp;
    </router-link>
    <router-link style="text-decoration: none;" :to="{ name: 'DaumNewsCrawlerPage' }">
      &nbsp;다음 뉴스 크롤링
    </router-link>

    <router-link style="text-decoration: none;" :to="{ name: 'JpaBoardListPage' }">
      &nbsp;오늘 복습한 사항입니다. 뭐뭐 했고 어떤거 이런거 저런거 작업 진했습니다.
    </router-link>
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