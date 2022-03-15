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
        <v-btn class="teal" dark>기본 버튼</v-btn>
        <v-btn class="teal" dark>
            <!-- 아이콘 사용시 항시 mdi- 가 붙는 방식으로 업데이트 됨 -->
            <v-icon>mdi-battery-alert-variant-outline</v-icon>
            <span>배터리 교체</span>
        </v-btn>
        <v-btn fab color="orange" dark>
            <v-icon>mdi-bluetooth</v-icon>
        </v-btn><br/>

        <!-- grid 기능을 서포트하며 기본적으로 페이지 중앙에 자동 배치함
             추가적으로 너비를 자동 확장할 경우 fluid 옵션을 준다. -->
        <v-container>
            <!-- Grid 시스템 상에서 한 행을 의미함 -->
            <v-layout wrap>
                <v-flex class="primary white--text">
                    <div>Test</div>
                </v-flex>
                <v-flex class="red white--text">
                    <div>Test</div>
                </v-flex>
                <v-flex class="green white--text">
                    <div>Test</div>
                </v-flex>
                <v-flex class="blue white--text">
                    <div>Test</div>
                </v-flex>
            </v-layout>
            <v-layout wrap>
                <v-flex class="teal white--text">
                    <div>Test</div>
                </v-flex>
                <v-flex class="teal white--text">
                    <div>Test</div>
                </v-flex>
            </v-layout>
        </v-container><br/>

        <!-- 현재 버전에서는 오히려 row 를 사용할 경우 화면에서 넘쳐버림 -->
        <v-layout justify-center>
            <v-dialog v-model="dialog" persisten max-width="400">
                <template v-slot:activator="{ on }">
                    <v-btn color="primary" dark v-on="on">결제</v-btn>
                </template>
                <v-card>
                    <v-card-title class="headline">
                        {{ service.name }}
                    </v-card-title>
                    <v-card-text>
                        오늘만 날이다! 5성급 호텔이 30% 할인!
                    </v-card-text><br/>
                    <v-card-text>
                        {{ service.name }} 지금 당장 결제 하시겠습니까 ?
                    </v-card-text>
                    <v-card-actions>
                        <v-spacer></v-spacer>
                        <v-btn color="teal darken-1" text @click.native="btn_click($event)">
                            취소
                        </v-btn>
                        <v-btn color="teal darken-1" text @click.native="btn_click($event)">
                            결제승인
                        </v-btn>
                    </v-card-actions>
                </v-card>
            </v-dialog>
        </v-layout>

        <v-dialog v-model="loginDialog" persisten max-width="500px">
                <template v-slot:activator="{ on }">
                    <v-btn color="primary" dark v-on="on">로그인</v-btn>
                </template>
                <v-card>
                    <v-card-title class="headline">
                        <span>
                            로그인
                        </span>
                    </v-card-title>
                    <v-card-text>
                        <v-container grid-list-md>
                            <v-layout wrap>
                                <v-flex xs12>
                                    <v-text-field label="Email" v-model="userInfo.email" required solo>
                                    </v-text-field>
                                </v-flex>
                                <v-flex xs12>
                                    <v-text-field label="비밀번호 입력해!" v-model="userInfo.password" required solo>
                                    </v-text-field>
                                </v-flex>
                            </v-layout>
                        </v-container>
                    </v-card-text>
                    <v-card-actions>
                        <v-spacer></v-spacer>
                        <v-btn color="teal darken-1" text @click="btnLoginClick($event)">
                            취소
                        </v-btn>
                        <v-btn color="teal darken-1" text @click="btnLoginClick($event)">
                            로그인
                        </v-btn>
                    </v-card-actions>
                </v-card>
            </v-dialog>
    </div>
</template>

<script>

export default {
    data () {
        return {
            dialog: false,
            service: {
                name: '7박 8일 여행 코스!'
            },
            userInfo: {
                email: '',
                password: ''
            }
        }
    },
    methods: {
        roundBtnClick () {
            alert('Vuetify 라고 들어는 봤니 ?')
        }
    }
}

</script>

<style scoped>

.v-application p {
    margin-bottom: 0px;
}

</style>