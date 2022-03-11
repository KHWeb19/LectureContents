<template>
    <div>
        <p>{{ products }}</p>
        <ul v-for="pd in products_details" :key="pd.pcode">
            <li v-if="pd.pcode == products[0]">
                제품 코드: {{ pd.pcode }} 제품 종류: {{ pd.text }}
            </li>
        </ul>
    </div>
</template>

<script>

import EventBus from '@/eventBus.js'

export default {
    data () {
        return {
            products_details: [
                { pcode: 'p01', text: '리눅스 노트북은 Dell, Lenovo' },
                { pcode: 'p02', text: '컴퓨터는 AMD, Apple' },
                { pcode: 'p03', text: '자동차는 Tesla, Volvo' },
                { pcode: 'p04', text: '모니터는 LG, Samsung, Dell' },
                { pcode: 'p05', text: '휴대폰은 Samsung, Apple' },
                { pcode: 'p06', text: '마우스는 Logitech, Razor' },
                { pcode: 'p07', text: '키보드는 Logitech, Cherry, RealForce, Leopold' },
                { pcode: 'p08', text: '태블릿은 Samsung, Apple' }
            ],
            products: []
        }
    },
    created () {
        EventBus.$on('sendCode', (payload) => {
            this.products = payload
        })
    }
}

</script>

<style scoped>

div {
    background: #ff4081;
    color: black;
    padding: 10px;
    font-weight: bold;
}
ul {
    list-style: none;
}

</style>