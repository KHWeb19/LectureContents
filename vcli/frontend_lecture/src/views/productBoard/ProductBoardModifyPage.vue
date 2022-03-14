<template>
    <div align="center">
        <h2>Vue + Spring 게시물 수정</h2>
        <product-board-modify-form v-if="productBoard" :productBoard="productBoard" @submit="onSubmit"/>
        <p v-else>로딩중 .......</p>
    </div>
</template>

<script>
import axios from 'axios'
import { mapActions, mapState } from 'vuex'
import ProductBoardModifyForm from '@/components/productBoard/ProductBoardModifyForm.vue'

export default {
    name: 'ProductBoardModifyPage',
    components: {
        ProductBoardModifyForm
    },
    props: {
        productNo: {
            type: String,
            required: true
        }
    },
    computed: {
        ...mapState(['productBoard'])
    },
    methods: {
        ...mapActions(['fetchProductBoard']),
        onSubmit (payload) {
            const { title, price, description } = payload

            axios.put(`http://localhost:7777/53th/vueproduct/${this.productNo}`, { title, price, description })
                    .then(res => {
                        alert('게시물 수정 성공!')
                        this.$router.push({
                            name: 'ProductBoardReadPage',
                            params: { productNo: res.data.productNo.toString() }
                        })
                    })
                    .catch(() => {
                        alert('게시물 수정 실패!')
                    })
        }
    },
    created () {
        this.fetchProductBoard(this.productNo)
                .catch(() => {
                    alert('게시물 DB 조회 실패!')
                    this.$router.back()
                })
    }
}

</script>