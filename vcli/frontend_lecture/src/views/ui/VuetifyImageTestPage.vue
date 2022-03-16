<template>
    <div>
        <div>
            <!-- v-img vs img -->
            <v-img class="responsive-img" src="@/assets/img/dune.jpg"/>
        <!-- ESLint: The template root requires exactly one element.
            (vue/no-multiple-template-root)
            <template> <div> 에서 첫 번째 div 는 vue 객체의 div 이므로
            이것을 다른 녀석이 덮어쓰면 위와 같은 문제가 발생합니다. -->
        </div>
        <div class="video-container">
            <iframe width="1200" height="720" src="https://www.youtube.com/embed/3AyCy1UUlpU"
                    frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
                    allowfullscreen>
            </iframe>
        </div>
        <div class="row">
            <div class="col s1 blue">1</div>
            <div class="col s1 blue">1</div>
            <div class="col s1 blue">1</div>
            <div class="col s1 blue">1</div>
            <div class="col s1 blue">1</div>
            <div class="col s1 blue">1</div>
            <div class="col s1 blue">1</div>
            <div class="col s1 blue">1</div>
            <div class="col s1 blue">1</div>
            <div class="col s1 blue">1</div>
            <div class="col s1 blue">1</div>
            <div class="col s1 blue">1</div>
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