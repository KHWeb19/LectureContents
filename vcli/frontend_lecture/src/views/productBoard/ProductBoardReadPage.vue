<template>
    <div align="center">
        <h2>Vue + Spring 게시판 읽기</h2>
        <product-board-read v-if="productBoard" :productBoard="productBoard"/>
        <p v-else>로딩중 ....... </p>
        <router-link :to="{ name: 'ProductBoardModifyPage', params: { productNo } }">
            게시물 수정
        </router-link>
        <button @click="onDelete">삭제</button>
        <router-link :to="{ name: 'ProductBoardListPage' }">
            게시물 보기
        </router-link>
    </div>
</template>

<script>

import axios from 'axios'
import { mapActions, mapState } from 'vuex'
import ProductBoardRead from '@/components/productBoard/ProductBoardRead.vue'

export default {
    name: 'ProductBoardReadPage',
    props: {
        productNo: {
            type: String,
            required: true
        }
    },
    components: {
        ProductBoardRead
    },
    computed: {
        ...mapState(['productBoard'])
    },
    created () {
        this.fetchProductBoard(this.productNo)
                .catch(() => {
                    alert('게시물 요청 실패!')
                    this.$router.push()
                })
    },
    methods: {
        ...mapActions(['fetchProductBoard']),
        onDelete () {
            const { productNo } = this.productBoard
            axios.delete(`http://localhost:7777/53th/vueproduct/${productNo}`)
                    .then(() => {
                        alert('삭제 성공!')
                        this.$router.push({ name: 'ProductBoardListPage' })
                    })
                    .catch(() => {
                        alert('삭제 실패! 문제 발생!')
                    })
        }
    }
}

</script>