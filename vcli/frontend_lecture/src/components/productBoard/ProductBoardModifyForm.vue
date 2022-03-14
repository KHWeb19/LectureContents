<template>
    <div>
        <form @submit.prevent="onSubmit">
            <table>
                <tr>
                    <td>게시물 번호</td>
                    <td>
                        <input type="text" :value="productBoard.productNo" disabled/>
                    </td>
                </tr>
                <tr>
                    <td>상품명</td>
                    <td>
                        <input type="text" v-model="title"/>
                    </td>
                </tr>
                <tr>
                    <td>작성자</td>
                    <td>
                        <input type="text" :value="productBoard.writer" disabled/>
                    </td>
                </tr>
                <tr>
                    <td>가격</td>
                    <td>
                        <input type="text" v-model="price"/>
                    </td>
                </tr>
                <tr>
                    <td>등록일자</td>
                    <td>
                        <input type="text" :value="productBoard.regDate" disabled/>
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
                <button type="submit">수정 완료</button>
                <router-link :to="{ name: 'ProductBoardReadPage', 
                                    params: { productNo: productBoard.productNo.toString() } }">
                    취소
                </router-link>
            </div>
        </form>
    </div>
</template>

<script>

export default {
    name: 'ProductBoardModifyForm',
    props: {
        productBoard: {
            type: Object,
            required: true
        }
    },
    data () {
        return {
            title: '',
            price: 0,
            description: ''
        }
    },
    methods: {
        onSubmit () {
            const { title, price, description } = this
            this.$emit('submit', { title, price, description })
        }
    },
    created () {
        this.title = this.productBoard.title
        this.price = this.productBoard.price
        this.description = this.productBoard.description
    }
}
</script>