<template>
    <div>
        <coverflow :coverList="coverList" :coverWidth="260" :index="2"/>
    </div>
</template>

<script>

import coverflow from 'vue-coverflow'

export default {
    name: 'CoverflowTestPage',
    data () {
        return {
            coverList: [
                {
                    cover: require('@/assets/img/dune.jpg'),
                    title: '듄'
                },
                {
                    cover: require('@/assets/img/mario.png'),
                    title: '마리오'
                },
                {
                    cover: 'http://1.bp.blogspot.com/-mVAqnKw_lW8/VL9V6fhewNI/AAAAAAAAAco/-eTiP5HF40I/s1600/3034007-slide-s-3-whats-the-difference-between-a-logo-and-a-symbol.jpg',
                    title: '스타벅스'
                },
                {
                    cover: require('@/assets/img/dune.jpg'),
                    title: '듄'
                },
                {
                    cover: require('@/assets/img/mario.png'),
                    title: '마리오'
                },
                {
                    cover: 'http://1.bp.blogspot.com/-mVAqnKw_lW8/VL9V6fhewNI/AAAAAAAAAco/-eTiP5HF40I/s1600/3034007-slide-s-3-whats-the-difference-between-a-logo-and-a-symbol.jpg',
                    title: '스타벅스'
                },
                {
                    cover: require('@/assets/img/dune.jpg'),
                    title: '듄'
                },
                {
                    cover: require('@/assets/img/mario.png'),
                    title: '마리오'
                }
            ]
        }
    },
    components: {
        coverflow
    }
}

</script>