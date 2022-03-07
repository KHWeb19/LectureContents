import {
    FETCH_BOARD_LIST,
    //FETCH_BOARD
} from './mutation-types'

import axios from 'axios'
// npm install axios --save-dev

export default {
    fetchBoardList ({ commit }) {
        return axios.get('http://localhost:7777/48th/vueboard/list')
                .then((res) => {
                    commit(FETCH_BOARD_LIST, res.data)
                })
    }
}