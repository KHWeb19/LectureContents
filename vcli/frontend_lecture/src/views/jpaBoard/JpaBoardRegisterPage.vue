<template>
    <div align="center">
        <h2>게시물 작성</h2>
        <jpa-board-register-form @submit="onSubmit"/>
    </div>
</template>

<script>

import JpaBoardRegisterForm from '@/components/jpaBoard/JpaBoardRegisterForm.vue'
import axios from 'axios'

export default {
    name: 'BoardRegisterPage',
    components: {
        JpaBoardRegisterForm
    },
    methods: {
        onSubmit (payload) {
            const { title, content, writer } = payload
            axios.post('http://localhost:7777/62th/board/register', { title, writer, content })
                    .then(() => {
                        alert('게시물 등록 성공!')

                        this.$router.push({
                            name: 'JpaBoardListPage'
                        })
                    })
                    .catch(() => {
                        alert('문제 발생!')
                    })
        }
    }
}

</script>