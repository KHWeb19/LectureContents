<template>
    <div>
        <v-container>
            <v-row>
                <v-col v-for="image in images" :key="image" class="d-flex child-flex" cols="4">
                    <v-img :src="image" aspect-ratio="1" class="grey lighten-2">
                        <template v-slot:placeholder>
                            <v-row class="fill-height ma-0" align="center" justify="center">
                                <v-progress-circular indeterminate color="grey lighten-5">
                                </v-progress-circular>
                            </v-row>
                        </template>
                    </v-img>
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
            images: [
                require('@/assets/logo.png'),
                require('@/assets/img/mario.png'),
                require('@/assets/img/dune.jpg'),
                "https://images.nintendolife.com/71e351f5c1289/zelda-breath-of-the-wild.900x.jpg",
                "https://media.gq-magazine.co.uk/photos/5d13a88fa56e59087435810d/16:9/w_2560%2Cc_limit/zelda-02-gq-21nov18_b.jpg",
                "https://cdn.clien.net/web/api/file/F01/11974211/fc001eacc2824.png"
            ]
        }
    }
}

</script>