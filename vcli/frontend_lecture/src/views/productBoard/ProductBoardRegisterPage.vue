<template>
    <div align="center">
        <h2>게시물 작성</h2>
        <product-board-register-form @submit="onSubmit"/>
    </div>
</template>

<script>

import ProductBoardRegisterForm from '@/components/productBoard/ProductBoardRegisterForm.vue'
import axios from 'axios'

export default {
    name: 'ProductBoardRegisterPage',
    components: {
        ProductBoardRegisterForm
    },
    methods: {
        onSubmit (payload) {
            const { title, writer, price, description } = payload
            axios.post('http://localhost:7777/53th/vueproduct/register', { title, writer, price, description })
                    .then(() => {
                        alert('게시물 등록 성공!')

                        this.$router.push({
                            name: 'ProductBoardListPage'
                        })
                    })
                    .catch(() => {
                        alert('문제 발생!')
                    })
        }
    }
}

</script>