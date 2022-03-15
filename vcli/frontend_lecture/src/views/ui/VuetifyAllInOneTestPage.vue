<template>
    <div>
        <p class="blue lighten-4 red--text">Test</p>
        <p class="blue white--text">Test</p>
        <p class="blue darken-3">Test</p>
        <p class="teal lighten-1 center-align">
            병맛 넘치게! 이거시 뷰티파이닷!!!
        </p>
        <p class="purple darken-5 white--text">Test</p>

        <v-btn class="teal" rounded @click="roundBtnClick">Round Button</v-btn>
        <v-btn class="indigo white--text">Basic Button</v-btn>
        <v-btn class="teal" text>기본 버튼</v-btn>
        <v-btn class="teal" dark>
            <!-- 아이콘 사용시 항시 mdi- 가 붙는 방식으로 업데이트 됨 -->
            <v-icon>mdi-battery-alert-variant-outline</v-icon>
            <span>블루투스</span>
        </v-btn>
    </div>
</template>

<style scoped>

.v-application p {
    margin-bottom: 0px;
}

</style>