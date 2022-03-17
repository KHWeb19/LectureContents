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
                            <v-btn fab="fab" text="text" small="small" color="grey darken=-2" @click="prev">
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
                                    :event="events" :event-color="getEventColor" :type="type">
                        </v-calendar>
                    </v-sheet>
                </v-col>
            </v-row>
        </v-container>
    </div>
</template>

<script>

export default {
    components: {
    },
    data () {
        return {
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
        }
    },
    mounted () {
        this.$refs.calendar.checkChange()
    }
}

</script>