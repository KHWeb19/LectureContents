<template>
    <div>
        <h3>게시물 목록</h3>
        <table border="1">
            <tr>
                <th align="center" width="100">번호</th>
                <th align="center" width="640">상품명</th>
                <th align="center" width="100">가격</th>
                <th align="center" width="200">작성자</th>
                <th align="center" width="240">등록일자</th>
            </tr>
            <tr v-if="!productBoards || (Array.isArray(productBoards) && productBoards.length === 0)">
                <td colspan="4">
                    현재 등록된 게시물이 없습니다!
                </td>
            </tr>
            <tr v-else v-for="productBoard in productBoards" :key="productBoard.productNo">
                <td align="center">
                    {{ productBoard.productNo }}
                </td>
                <td align="left">
                    <router-link :to="{ name: 'ProductBoardReadPage', 
                                        params: { productNo: productBoard.productNo.toString() } }">
                        {{ productBoard.title }}
                    </router-link>
                </td>
                <td align="right">
                    {{ productBoard.price }}
                </td>
                <td align="right">
                    {{ productBoard.writer }}
                </td>
                <td align="center">
                    {{ productBoard.regDate }}
                </td>
            </tr>
        </table>
    </div>
</template>

<script>

export default {
    name: 'ProductBoardList',
    props: {
        productBoards: {
            type: Array
        }
    }
}

</script>