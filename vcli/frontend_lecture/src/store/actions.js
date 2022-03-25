import {
    FETCH_BOARD_LIST,
    FETCH_BOARD,
    FETCH_PRODUCT_BOARD_LIST,
    FETCH_PRODUCT_BOARD,
    FETCH_JPA_BOARD_LIST,
    FETCH_JPA_BOARD,
} from './mutation-types'

import axios from 'axios'
// npm install axios --save-dev

export default {
    fetchBoardList ({ commit }) {
        return axios.get('http://localhost:7777/48th/vueboard/list')
                .then((res) => {
                    commit(FETCH_BOARD_LIST, res.data)
                })
    },
    fetchBoard ({ commit }, boardNo) {
        return axios.get(`http://localhost:7777/49th/vueboard/${boardNo}`)
                .then((res) => {
                    commit(FETCH_BOARD, res.data)
                })
    },
    fetchProductBoardList ({ commit }) {
        return axios.get('http://localhost:7777/53th/vueproduct/list')
                .then((res) => {
                    commit(FETCH_PRODUCT_BOARD_LIST, res.data)
                })
    },
    fetchProductBoard ({ commit }, productNo) {
        return axios.get(`http://localhost:7777/53th/vueproduct/${productNo}`)
                .then((res) => {
                    commit(FETCH_PRODUCT_BOARD, res.data)
                })
    },
    fetchJpaBoardList ({ commit }) {
        return axios.get('http://localhost:7777/62th/board/list')
            .then((res) => {
                commit(FETCH_JPA_BOARD_LIST, res.data)
            })
    },
    fetchJpaBoard ({ commit }, boardNo) {
        return axios.get(`http://localhost:7777/62th/board/${boardNo}`)
            .then((res) => {
                commit(FETCH_JPA_BOARD, res.data)
            })
    }
}