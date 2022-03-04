<template>
    <div class="home">
        <div id="header">
            <router-link :to="{ name: 'Home' }"
                    class="nav-link"
                    active-class="active">
                Home
            </router-link>
            <router-link :to="{ name: 'Test' }"
                    class="nav-link"
                    active-class="active">
                Test
            </router-link>
        </div>

        <h2>Vue 테스트 페이지</h2>

        <div id="app">
            <p>{{ msg }}</p>

            <global-component v-bind:initial-test="counter">
            </global-component>

            <local-component v-bind:num="value">
            </local-component>
            <button v-on:click="plus">클릭해봐!</button>
        </div>
    </div>
</template>

<script>

import Vue from 'vue'
import GlobalComponent from '@/components/test/GlobalComponent.vue'
import LocalComponent from '@/components/test/LocalComponent.vue'

Vue.component(GlobalComponent.name, GlobalComponent)

export default {
    components: {
        'local-component': LocalComponent
    },
    data () {
        return {
            counter: 0,
            value: 0,
            msg: '이래서 Vue 가 생산성이 높음'
        }
    },
    methods: {
        plus () {
            this.value++
        }
    }
}

</script>