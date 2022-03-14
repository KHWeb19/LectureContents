<template>
    <div id="productBoard">
        <h2>Vue + Spring 게시판</h2>
        <router-link :to="{ name: 'ProductBoardRegisterPage' }">
            게시물 작성
        </router-link>
        <!-- v-bind:board="boards"와 같으며 아래와 같이 생략 가능 -->
        <product-board-list :productBoards="productBoards"/>
    </div>
</template>

<script>

import ProductBoardList from '@/components/productBoard/ProductBoardList.vue'
import { mapState, mapActions } from 'vuex'

export default {
    name: 'ProductBoardListPage',
    components: {
        ProductBoardList
    },
    computed: {
        ...mapState(['productBoards'])
    },
    mounted () {
        this.fetchProductBoardList()
    },
    methods: {
        ...mapActions(['fetchProductBoardList'])
    }
}

</script>