<template>
    <form @submit.prevent="onSubmit">
        <table>
            <tr>
                <!-- title, writer, price, description -->
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
                <td>가격</td>
                <td>
                    <input type="text" v-model="price"/>
                </td>
            </tr>
            <tr>
                <td>제품 상세 설명</td>
                <td>
                    <textarea cols="50" rows="20" v-model="description">
                    </textarea>
                </td>
            </tr>
        </table>

        <div>
            <button type="submit">등록</button>
            <router-link :to="{ name: 'ProductBoardListPage' }">
                취소
            </router-link>
        </div>
    </form>
</template>

<script>

export default {
    name: 'ProductBoardRegisterForm',
    data () {
        return {
            title: '제목을 작성하세요.',
            writer: '너님',
            price: '가격은 드럽게 비싸게!',
            description: '상품을 소개하세요.'
        }
    },
    methods: {
        onSubmit () {
            const { title, writer, price, description } = this
            this.$emit('submit', { title, writer, price, description })
        }
    }
}
</script>