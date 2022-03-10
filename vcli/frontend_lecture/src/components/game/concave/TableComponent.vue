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