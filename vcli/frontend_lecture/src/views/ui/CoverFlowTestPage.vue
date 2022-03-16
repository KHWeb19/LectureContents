<template>
    <div>
        <coverflow :coverList="coverList" :coverWidth="260" :index="2"/>
    </div>
</template>

<script>

import coverflow from 'vue-coverflow'

export default {
    components: {
        coverflow
    },
    data () {
        return {
            coverList: [
                {
                    cover: require('@/assets/logo.png'),
                    title: 'logo'
                },
                {
                    cover: require('@/assets/logo.png'),
                    title: 'logo'
                },
                {
                    cover: require('@/assets/logo.png'),
                    title: 'logo'
                },
                {
                    cover: require('@/assets/logo.png'),
                    title: 'logo'
                }
            ]
        }
    }
}

</script>