import Vue from 'vue'
import Vuex from 'vuex'

import state from './states'
import actions from './actions'
import mutations from './mutations'
import getters from './getters'

Vue.use(Vuex)

export default new Vuex.Store({
  /* state에는 복수형을 사용하지 맙시다 */
  state,
  actions,
  mutations,
  getters
})
