<template>
    <div>
        <div>
            <!-- v-img vs img -->
            <v-img class="responsive-img" src="@/assets/img/dune.jpg"/>
        </div>
        <div class="video-container">
            <iframe width="1200" height="720" src="https://www.youtube.com/embed/3AyCy1UUlpU"
                    frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
                    allowfullscreen>
            </iframe>
        </div>
    </div>
</template>

<script>

export default {
    data () {
        return {
            
        }
    },
    methods: {
        
    }
}

</script>

<style scoped>

.v-application p {
    margin-bottom: 0px;
}

</style>