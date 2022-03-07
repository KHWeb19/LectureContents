<template>
    <div id="board">
        <h2>Vue + Spring 게시판</h2>
        <router-link :to="{ name: 'BoardRegisterPage' }">
            게시물 작성
        </router-link>
        <!-- v-bind:board="boards"와 같으며 아래와 같이 생략 가능 -->
        <board-list :boards="boards"/>
    </div>
</template>

<script>

import BoardList from '@/components/board/BoardList.vue'
import { mapState, mapActions } from 'vuex'

export default {
    name: 'BoardListPage',
    components: {
        BoardList
    },
    computed: {
        ...mapState(['boards'])
    },
    mounted () {
        this.fetchBoardList()
    },
    methods: {
        ...mapActions(['fetchBoardList'])
    }
}

</script>