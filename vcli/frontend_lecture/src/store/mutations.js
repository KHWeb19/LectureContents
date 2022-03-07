import {
    FETCH_BOARD_LIST,
    //FETCH_BOARD
} from './mutation-types'

export default {
    [FETCH_BOARD_LIST] (state, boards) {
        state.boards = boards
    }
}