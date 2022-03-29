import {
    FETCH_BOARD_LIST,
    FETCH_BOARD,
    FETCH_PRODUCT_BOARD_LIST,
    FETCH_PRODUCT_BOARD,
    FETCH_JPA_BOARD_LIST,
    FETCH_JPA_BOARD,
    FETCH_BUSINESS_MEMBER,
    CRAWL_START
} from './mutation-types'

import axios from 'axios'
import router from '@/router'
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
    },
    fetchBusinessMember ({ commit }) {
        return axios.get('http://localhost:7777/63th/jpaMember/checkBusiness')
            .then((res) => {
                commit(FETCH_BUSINESS_MEMBER, res.data)
            })
    },
    async crawlFind ({ commit }, category) {
        axios.get('http://localhost:7777/64th/crawl/' + `${category}`)
            .then(({ data }) => {
                commit(CRAWL_START, data)

                if (window.location.pathname !== '/daumNewsCrawl') {
                    router.push('/daumNewsCrawl')
                }
            })
    }
}