<template>
    <table>
        <tr-component
                v-for="(rowData, index) in tableData"
                :key="index"
                :row-data="rowData"
                :row-index="index"
                :table-data="tableData"
                :turn="turn"
                :winner="winner">
        </tr-component>
    </table>
</template>

<script>

import TrComponent from '@/components/game/concave/TrComponent.vue'

export default {
    data () {
        return {

        }
    },
    components: {
        TrComponent
    },
    props: {
        tableData: Array,
        turn: String,
        winner: String
    }
}
</script>

<style>

div {
    display: inline;
}

</style>