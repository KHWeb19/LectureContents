<template>
    <div>
        <td @click="onClickTd">{{ cellData }}</td>
    </div>
</template>

<script>

export default {
    data () {
        return {
            
        }
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
        onClickTd () {
            alert('마우스 클릭 감지!')
        }
    }
}

</script>

<style scoped>

table {
    border-collapse: collapse;
}

td {
    border: 1px solid black;
    width: 80px;
    height: 80px;
    text-align: center;
}

</style>