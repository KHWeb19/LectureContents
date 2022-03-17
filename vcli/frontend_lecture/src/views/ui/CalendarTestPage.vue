<template>
    <div>
        <v-container>
            <v-row class="fill-height">
                <v-col>
                    <v-sheet height="64">
                        <v-toolbar flat="flat">
                            <v-btn outlined="outlined" class="mr-4" color="grey darken=-2" @click="setToday">
                                오늘
                            </v-btn>
                            <v-btn fab="fab" text="text" small="small" color="grey darken=-2" @click="prev">
                                <v-icon small="small">
                                    mdi-chevron-left
                                </v-icon>
                            </v-btn>
                            <v-btn fab="fab" text="text" small="small" color="grey darken=-2" @click="next">
                                <v-icon small="small">
                                    mdi-chevron-right
                                </v-icon>
                            </v-btn>

                            <v-toolbar-title v-if="$refs.calendar">
                                {{ $refs.calendar.title }}
                            </v-toolbar-title>
                            <v-spacer></v-spacer>
                            <v-menu bottom="bottom" right="right">
                                <template v-slot:activator="{ on, attrs }">
                                    <v-btn outlined="outlined" color="grey darken-2" v-bind="attrs" v-on="on">
                                        <span>{{ typeToLabel[type] }}</span>
                                        <v-icon right="right">
                                            mdi-menu-down
                                        </v-icon>
                                    </v-btn>
                                </template>
                                <v-list>
                                    <v-list-item @click="type = 'day'">
                                        <v-list-item-title>일</v-list-item-title>
                                    </v-list-item>
                                    <v-list-item @click="type = 'week'">
                                        <v-list-item-title>주</v-list-item-title>
                                    </v-list-item>
                                    <v-list-item @click="type = 'month'">
                                        <v-list-item-title>월</v-list-item-title>
                                    </v-list-item>
                                </v-list>
                            </v-menu>
                        </v-toolbar>
                    </v-sheet>
                    <v-sheet height="400">
                        <v-calendar ref="calendar" v-model="focus" color="primary" 
                                    :events="events" :event-color="getEventColor" :type="type"
                                    @click:more="viewDay" @click:date="viewDay"
                                    @change="updateRange" @click:event="showEvent">
                        </v-calendar>
                        <v-menu v-model="selectedOpen" :close-on-content-click="false"
                                :activator="selectedElement" offset-x="offset-x">
                            <v-card color="grey lighten-4" min-width="350px" flat="flat">
                                <v-toolbar :color="selectedEvent.color" dark="dark">
                                    <v-btn icon="icon">
                                        <v-icon>mdi-pencil</v-icon>
                                    </v-btn>
                                    <v-toolbar-title v-html="selectedEvent.name">
                                    </v-toolbar-title>
                                    <v-spacer></v-spacer>
                                    <v-btn icon="icon">
                                        <v-icon>mdi-heart</v-icon>
                                    </v-btn>
                                    <v-btn icon="icon">
                                        <v-icon>mdi-dots-vertical</v-icon>
                                    </v-btn>
                                </v-toolbar>
                                <v-card-text>
                                    <span v-html="selectedEvent.details"></span>
                                </v-card-text>
                                <v-card-actions>
                                    <v-btn text="text" colors="secondary" @click="selectedOpen = false">
                                        취소
                                    </v-btn>
                                </v-card-actions>
                            </v-card>
                        </v-menu>
                    </v-sheet>
                </v-col>
            </v-row>
        </v-container>
    </div>
</template>

<script>

export default {
    name: 'CalendarTestPage',
    data: () => ({
        focus: '',
        type: 'month',
        typeToLabel: {
            month: '월',
            week: '주',
            day: '일'
        },
        selectedEvent: {},
        selectedElement: null,
        selectedOpen: false,
        events: [],
        colors: [
            'blue', 'indigo', 'deep-purple',
            'cyan', 'green', 'orange', 'grey darken-1'
        ],
        names: [
            'Meeting', 'Birthday', 'Holiday', 'Travel',
            'Conference', 'Contest', 'Game', 'Consulting'
        ]
    }),
    mounted () {
        this.$refs.calendar.checkChange()
    },
    methods: {
        viewDay ({ date }) {
            this.focus = date
            this.type = 'day'
        },
        getEventColor (event) {
            return event.color
        },
        setToday () {
            this.focus = ''
        },
        prev () {
            this.$refs.calendar.prev()
        },
        next () {
            this.$refs.calendar.next()
        },
        showEvent ({ nativeEvent, event }) {
            /* 이 부분은 건드릴 일 전혀 없음 */
            const open = () => {
                this.selectedEvent = event
                this.selectedElement = nativeEvent.target
                requestAnimationFrame(
                    () => requestAnimationFrame(() => this.selectedOpen = true)
                )
            }

            if (this.selectedOpen) {
                this.selectedOpen = false
                requestAnimationFrame(() => requestAnimationFrame(() => open()))
            } else {
                open()
            }

            nativeEvent.stopPropagation();
        },
        updateRange ({ start, end }) {
            /* 현재는 테스트를 위해 직접 events 배열을 랜덤하게 생성하였음
               실제 프로젝트에서는 axios 를 통해서 DB 정보를 요청하고
               해당 DB 정보를 events 에 배치하여 달력에 출력하도록 만들어야 한다. */
            const events = []

            const min = new Date(`${start.date}T00:00:00`)
            const max = new Date(`${end.date}T23:59:59`)
            const days = (max.getTime() - min.getTime()) / 86400000
            const eventCount = this.randDay(days, days + 20)

            for (let i = 0; i < eventCount; i++) {
                const allDay = this.randDay(0, 3) === 0
                const firstTimestamp = this.randDay(min.getTime(), max.getTime())
                const first = new Date(firstTimestamp - (firstTimestamp % 450000))
                const secondTimestamp = this.randDay(2, allDay ? 288 : 8) * 450000
                const second = new Date(first.getTime() + secondTimestamp)

                events.push({
                    name: this.names[this.randDay(0, this.names.length - 1)],
                    start: first,
                    end: second,
                    color: this.colors[this.randDay(0, this.colors.length - 1)],
                    timed: !allDay
                })
            }

            this.events = events
        },
        randDay (min, max) {
            return Math.floor((max - min + 1) * Math.random()) + min
        }
    }
}

</script>