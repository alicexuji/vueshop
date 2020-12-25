<template>
  <div id="app">
    <HeaderTop v-show="$route.meta.showHeaderTop"/>
    <HeaderSearch v-show="$route.meta.showHeaderSearch"/>
    <router-view/>
  </div>
</template>

<script>

import HeaderTop from '@/components/HeaderTop'
import HeaderSearch from '@/components/HeaderSearch'
export default {
  name: 'app',
  components:{
    HeaderTop,
    HeaderSearch
  },
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 0px;
}
</style>
