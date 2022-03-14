<template>
    <div>
        <table>
            <tr>
                <td>게시물 번호</td>
                <td>
                    <input type="text" :value="productBoard.productNo" readonly/>
                </td>
            </tr>
            <tr>
                <td>상품명</td>
                <td>
                    <input type="text" :value="productBoard.title" readonly/>
                </td>
            </tr>
            <tr>
                <td>작성자</td>
                <td>
                    <input type="text" :value="productBoard.writer" readonly/>
                </td>
            </tr>
            <tr>
                <td>가격</td>
                <td>
                    <input type="text" :value="productBoard.price" readonly/>
                </td>
            </tr>
            <tr>
                <td>제품 상세 설명</td>
                <td>
                    <textarea cols="50" rows="20" :value="productBoard.description" readonly>
                    </textarea>
                </td>
            </tr>
        </table>
    </div>
</template>

<script>

export default {
    name: 'ProductBoardRead',
    props: {
        productBoard: {
            type: Object,
            required: true
        }
    }
}
</script>