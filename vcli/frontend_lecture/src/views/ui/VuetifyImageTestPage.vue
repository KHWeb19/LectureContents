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
            <!-- sm으로 동작하는 것은 가로폭 960 미만부터!
                 md로 동작하는 것은 960을 넘어가면
                 안 붙어 있는 녀석은 600을 기준으로 왔다갔다함 -->
            <div class="col-4 col-md-8 col-sm-12 yellow text-center">12</div>
            <div class="col-sm-2 green text-center">2</div>
            <div class="col-sm-1 blue text-center">1</div>
            <div class="col-sm-1 blue text-center">1</div>
            <div class="col-sm-1 blue text-center">1</div>
            <div class="col-sm-1 blue text-center">1</div>
            <div class="col-sm-1 blue text-center">1</div>
            <div class="col-sm-1 blue text-center">1</div>
            <div class="col-sm-1 blue text-center">1</div>
            <div class="col-sm-1 blue text-center">1</div>
            <div class="col-sm-1 blue text-center">1</div>
            <div class="col-sm-1 blue text-center">1</div>

            <div class="col-sm-1 red text-center">1</div>
            <div class="col-sm-1 red text-center">1</div>
            <div class="col-sm-1 red text-center">1</div>
            <div class="col-sm-1 red text-center">1</div>
            <div class="col-sm-1 red text-center">1</div>
            <div class="col-sm-1 red text-center">1</div>
            <div class="col-sm-1 red text-center">1</div>
            <div class="col-sm-1 red text-center">1</div>
            <div class="col-sm-1 red text-center">1</div>
            <div class="col-sm-1 red text-center">1</div>
            <div class="col-sm-1 red text-center">1</div>
            <div class="col-sm-1 red text-center">1</div>
        </div>

        <!-- 이놈은 안되는 부분이니까 이렇게 쓰지 말자! -->
        <div class="container">
            <div class="row">
                <div class="col-4 col-md-8 col-sm-12 yellow text-center">12</div>
                <div class="col-sm-2 green text-center">2</div>
                <div class="col-sm-1 blue text-center">1</div>
                <div class="col-sm-1 blue text-center">1</div>
                <div class="col-sm-1 blue text-center">1</div>
                <div class="col-sm-1 blue text-center">1</div>
                <div class="col-sm-1 blue text-center">1</div>
                <div class="col-sm-1 blue text-center">1</div>
                <div class="col-sm-1 blue text-center">1</div>
                <div class="col-sm-1 blue text-center">1</div>
                <div class="col-sm-1 blue text-center">1</div>
                <div class="col-sm-1 blue text-center">1</div>

                <div class="col-sm-1 red text-center">1</div>
                <div class="col-sm-1 red text-center">1</div>
                <div class="col-sm-1 red text-center">1</div>
                <div class="col-sm-1 red text-center">1</div>
                <div class="col-sm-1 red text-center">1</div>
                <div class="col-sm-1 red text-center">1</div>
                <div class="col-sm-1 red text-center">1</div>
                <div class="col-sm-1 red text-center">1</div>
                <div class="col-sm-1 red text-center">1</div>
                <div class="col-sm-1 red text-center">1</div>
                <div class="col-sm-1 red text-center">1</div>
                <div class="col-sm-1 red text-center">1</div>
            </div>
        </div>

        <!-- 올해초 vue 진영에서 vue를 사용할 때
             반드시 자기네들이 정해준 형식 내에서 태그를 사용해야 한다고 지정한 이슈가 있었음
             현재 그 이슈가 적용되어 있는 상태로 v-container 의 디폴트 마진을 적용하려면
             v-app > v-container > v-row > v-col 순으로 적용되어야 정상적인 동작 가능함 -->
        <v-app id="inspire">
            <v-container class="grey lighten-5">
                <v-row no-gutters>
                    <v-col cols="12" sm="6" md="8">
                        <v-card class="pa-2" outlined tile>
                            .col-12 .col-sm-6 .col-md-8
                        </v-card>
                    </v-col>
                    <v-col cols="6" md="4">
                        <v-card class="pa-2" outlined tile>
                            .col-6 .col-md-4
                        </v-card>
                    </v-col>
                </v-row>
            </v-container>
            <v-container class="grey lighten-5">
                <v-row no-gutters>
                    <v-col class="col-12 col-sm-12 yellow text-center">
                        <div>12</div>
                    </v-col>
                    <v-col class="col-12 col-sm-2 green text-center">
                        <div>2</div>
                    </v-col>
                    <v-col class="col-12 col-sm-4 blue text-center">
                        <div>4</div>
                    </v-col>
                    <v-col class="col-12 col-sm-6 purple text-center">
                        <div>6</div>
                    </v-col>
                </v-row>
            </v-container>
        </v-app>
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