<template>
    <div id="board">
        <h2>Vue + Spring 게시판</h2>
        <p>게시물 작성</p>
        <!-- v-bind:board="boards"와 같으며 아래와 같이 생략 가능 -->
        <board-list :board="boards"/>
    </div>
</template>

<script>

import BoardList from '@/components/board/BoardList.vue'

export default {
    name: 'BoardListPage',
    components: {
        BoardList
    }
}

</script>