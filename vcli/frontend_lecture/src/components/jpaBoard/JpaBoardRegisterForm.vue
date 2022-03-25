<template>
    <form @submit.prevent="onSubmit">
        <table>
            <tr>
                <td>제목</td>
                <td>
                    <input type="text" v-model="title"/>
                </td>
            </tr>
            <tr>
                <td>작성자</td>
                <td>
                    <input type="text" v-model="writer"/>
                </td>
            </tr>
            <tr>
                <td>본문</td>
                <td>
                    <textarea cols="50" rows="20" v-model="content">
                    </textarea>
                </td>
            </tr>
        </table>

        <div>
            <button type="submit">등록</button>
            <router-link :to="{ name: 'BoardListPage' }">
                취소
            </router-link>
        </div>
    </form>
</template>

<script>

export default {
    name: 'BoardRegisterForm',
    data () {
        return {
            title: '제목을 작성하세요.',
            writer: '너님',
            content: '본문을 작성하세요.'
        }
    },
    methods: {
        onSubmit () {
            const { title, writer, content } = this
            this.$emit('submit', { title, writer, content })
        }
    }
}
</script>