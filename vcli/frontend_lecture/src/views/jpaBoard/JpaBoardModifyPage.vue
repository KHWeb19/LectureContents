<template>
    <div align="center">
        <h2>Vue + Spring 게시물 수정</h2>
        <jpa-board-modify-form v-if="jpaBoard" :jpaBoard="jpaBoard" @submit="onSubmit"/>
        <p v-else>로딩중 .......</p>
    </div>
</template>

<script>
import axios from 'axios'
import { mapActions, mapState } from 'vuex'
import JpaBoardModifyForm from '@/components/jpaBoard/JpaBoardModifyForm.vue'

export default {
    name: 'JpaBoardModifyPage',
    components: {
        JpaBoardModifyForm
    },
    props: {
        boardNo: {
            type: String,
            required: true
        }
    },
    computed: {
        ...mapState(['jpaBoard'])
    },
    methods: {
        ...mapActions(['fetchJpaBoard']),
        onSubmit (payload) {
            const { title, content } = payload

            axios.put(`http://localhost:7777/62th/board/${this.boardNo}`,
                { title, writer: this.jpaBoard.writer, content, regDate: this.jpaBoard.regDate })
                    .then(res => {
                        alert('게시물 수정 성공!')
                        this.$router.push({
                            name: 'JpaBoardReadPage',
                            params: { boardNo: res.data.boardNo.toString() }
                        })
                    })
                    .catch(() => {
                        alert('게시물 수정 실패!')
                    })
        }
    },
    created () {
        this.fetchJpaBoard(this.boardNo)
                .catch(() => {
                    alert('게시물 DB 조회 실패!')
                    this.$router.back()
                })
    }
}

</script>