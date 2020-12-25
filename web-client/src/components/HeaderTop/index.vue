<template>
  <div class="header_nav">
    <div>
      <p>嗨~欢迎来到汪星人商城</p>
    </div>
    <ul>
      <li v-if="!token">
        <router-link to="/login">您好,请登录</router-link>
        <router-link to="/login">免费注册</router-link>
      </li>
      <li v-else>
        <a>您好,{{ username }}</a>
        <a @click="headerLogout">退出登录</a>
      </li>
      <li v-if="this.$route.path.indexOf('/home') === -1">
        <router-link to="/">返回首页</router-link>
      </li>
    </ul>
  </div>
</template>

<script>
import {MessageBox} from 'element-ui';
import {getToken} from '@/utils/auth';
import {getCookie} from '@/utils/support';

export default {
  data() {
    return {
      username: getCookie("username"),
      token: getToken()
    }
  },

  methods: {

    headerLogout() {
      this.$confirm('您确定退出登录吗?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        this.$store.dispatch('FedLogOut').then(() => {
          location.reload() // 为了重新实例化vue-router对象 避免bug
          this.$message({
            type: 'success',
            message: '退出成功!'
          });

        })

      }).catch(() => {
        this.$message({
          type: 'info',
          message: '已取消退出'
        });
      });
    },
    goMe() {
      if (getToken()) {
        this.$router.replace('/me');
      } else {
        MessageBox({
          type: 'info',
          message: "请先登录!",
          showClose: true,
        });
      }
    },
    goShopCar() {
      if (!getToken()) {
        this.$router.replace('/shopcar');
      } else {
        MessageBox({
          type: 'info',
          message: "请先登录!",
          showClose: true,
        });
      }
    },
  },
}
</script>

<style scoped>
/*头部导航*/
.header_nav {
  width: 100%;
  height: 30px;
  background: #F2F2F2;
  font-family: "Microsoft YaHei";

  display: flex;
  align-items: center;
  justify-content: space-between;
}

.header_nav > div {
  display: flex;
  align-items: center;
}

.header_nav > div p {
  margin: 0 30px 0 20px;
  color: #999;
  font-size: 15px;
}

.locationWrapper {
  position: relative;
  max-width: 100px;

  display: flex;
  align-items: center;

}

.locationWrapper .el-cascader {
  position: absolute;
  opacity: 0;
}

.locationWrapper .address {
  max-width: 58px;
  font-size: 12px;
  color: #999;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
  vertical-align: middle;
}

.locationWrapper .icon {
  margin: 0 3px;
  width: 15px;
  height: 15px;
  vertical-align: middle;
}

.locationWrapper .icon path {
  fill: #dd6161;
}

.header_nav > ul {
  margin: 0 50px;
  list-style: none;

  display: flex;
  align-items: center;
}

.header_nav > ul > li:first-child {
  font-size: 14px;
  color: red;
  line-height: 20px;
  cursor: pointer;
}

.header_nav > ul > li > a {
  display: inline-block;
  padding: 5px 15px;
  font-size: 12px;
  line-height: 20px;
  color: #999;
  text-decoration: none;
  cursor: pointer;
}

.header_nav > ul > li > a:hover {
  color: red;
}

.header_nav > ul > li:first-child > a:nth-child(2) {
  padding-left: 0;
  color: red;
}
</style>
