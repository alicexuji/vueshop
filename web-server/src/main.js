import Vue from 'vue'
import App from './App.vue'
import './plugins/element.js'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';

import router from './router'
import store from './store'
import '@/styles/index.scss' // global css
import '@/icons' // icon
import '@/permission' // permission control
import VCharts from 'v-charts'

Vue.config.productionTip = false
Vue.use(ElementUI);
Vue.use(VCharts)

new Vue({
  el: '#app',
  router,
  store,
  components: {
    App
  },
  template: '<App/>',
  render: h => h(App)
})

