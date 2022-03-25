import {
    FETCH_BOARD_LIST,
    FETCH_BOARD,
    FETCH_PRODUCT_BOARD_LIST,
    FETCH_PRODUCT_BOARD,
    FETCH_JPA_BOARD_LIST,
    FETCH_JPA_BOARD,
} from './mutation-types'

export default {
    [FETCH_BOARD_LIST] (state, boards) {
        state.boards = boards
    },
    [FETCH_BOARD] (state, board) {
        state.board = board
    },
    [FETCH_PRODUCT_BOARD_LIST] (state, productBoards) {
        state.productBoards = productBoards
    },
    [FETCH_PRODUCT_BOARD] (state, productBoard) {
        state.productBoard = productBoard
    },
    [FETCH_JPA_BOARD_LIST] (state, boards) {
        state.jpaBoards = boards
    },
    [FETCH_JPA_BOARD] (state, board) {
        state.jpaBoard = board
    }
}