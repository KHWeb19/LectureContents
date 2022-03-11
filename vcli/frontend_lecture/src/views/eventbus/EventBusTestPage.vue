<template>
    <div id="eventbus">
        <h2>Vue EventBus 테스트 페이지</h2>
        <product></product>
        <product-detail></product-detail>
    </div>
</template>

<script>

export default {
    name: 'EventBusTestPage',
    components: {

    }
}

</script>

<style scoped>

ul {
    list-style-type: none;
    background: #3399ff;
    padding: 10px;
}
ul li {
    background: #cceeff;
    margin: 5px;
}

</style>