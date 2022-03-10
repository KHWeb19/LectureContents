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
                :winner="winner">
        </td-component>
    </tr>
</template>

<script>

import TdComponent from '@/components/game/concave/TdComponent.vue'

export default {
    data () {
        return {
            
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
    }
}

</script>