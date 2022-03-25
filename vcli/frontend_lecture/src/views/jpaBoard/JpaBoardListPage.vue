<template>
    <div id="board">
        <h2>Vue + Spring + JPA 게시판</h2>
        <router-link :to="{ name: 'JpaBoardRegisterPage' }">
            게시물 작성
        </router-link>
        <jpa-board-list :jpaBoards="jpaBoards"/>
    </div>
</template>

<script>

import JpaBoardList from '@/components/jpaBoard/JpaBoardList.vue'
import { mapState, mapActions } from 'vuex'

export default {
    name: 'JpaBoardListPage',
    components: {
      JpaBoardList
    },
    computed: {
        ...mapState(['jpaBoards'])
    },
    mounted () {
        this.fetchJpaBoardList()
    },
    methods: {
        ...mapActions(['fetchJpaBoardList'])
    }
}

</script>