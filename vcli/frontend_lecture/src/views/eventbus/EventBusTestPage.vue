<template>
    <div id="eventbus">
        <h2>Vue EventBus 테스트 페이지</h2>
        <product></product>
        <product-detail></product-detail>
    </div>
</template>

<script>

import Product from '@/components/eventbus/Product.vue'
import ProductDetail from '@/components/eventbus/ProductDetail.vue'

export default {
    name: 'EventBusTestPage',
    components: {
        Product,
        ProductDetail
    }
}

</script>

<style>

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