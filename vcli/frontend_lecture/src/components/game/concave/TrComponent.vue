<template>
    <tr>
        <td-component
                v-for="(cellData, index) in rowData"
                :key="index"
                :cell-data="cellData"
                :cell-index="index"
                :row-index="rowIndex"
                :table-data="tableData"
                :turn="turn"
                :winner="winner"
                v-on:updateTurn="updateTurn"
                v-on:updateTableData="updateTableData"
                v-on:updateWinner="updateWinner">
        </td-component>
    </tr>
</template>

<script>

import TdComponent from '@/components/game/concave/TdComponent.vue'

export default {
    data () {
        return {
            propTurn: this.turn,
            propWin: this.winner
        }
    },
    components: {
        TdComponent
    },
    props: {
        rowData: Array,
        rowIndex: Number,
        tableData: Array,
        turn: String,
        winner: String
    },
    methods: {
        updateTurn (val) {
            this.propTurn = val
            this.$emit('updateTurn', this.propTurn)
        },
        updateTableData () {
            this.$emit('updateTableData')
        },
        updateWinner (val) {
            this.propWin = val
            this.$emit('updateWinner', this.propWin)
        }
    }
}

</script>