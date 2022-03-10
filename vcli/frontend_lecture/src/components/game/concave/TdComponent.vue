<template>
    <div>
        <td @click="onClickTd">{{ cellData }}</td>
    </div>
</template>

<script>

export default {
    data () {

    },
    props: {
        cellData: String,
        cellIndex: Number,
        rowIndex: Number,
        tableData: Array,
        turn: String,
        winner: String
    },
    methods: {
        onclickTd () {
            alert('마우스 클릭 감지!')
        }
    }
}

</script>