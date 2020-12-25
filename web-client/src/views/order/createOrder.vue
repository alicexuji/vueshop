<template>
  <el-card class="app-container" shadow="never">
    <div>
      <el-form label-width="120px" style="width: 600px" size="small">
        <el-form-item label="收货人姓名：">
          <el-input v-model="revievename" placeholder="收货人姓名"></el-input>
        </el-form-item>
        <el-form-item label="收货人电话：">
          <el-input v-model="phone" placeholder="收货人电话"></el-input>
        </el-form-item>
        <el-form-item label="收货地址：">
          <el-input v-model="address" placeholder="请输入内容"></el-input>
        </el-form-item>
        <el-form-item style="text-align: center">
          <el-button type="primary" size="medium" @click="handleFinishCommit">提交</el-button>
        </el-form-item>
      </el-form>
    </div>
  </el-card>

</template>
<script>

import {createOrder, deleteGoods} from '@/api/index';
import {MessageBox} from "element-ui";
import {getCookie} from "@/utils/support";

export default {
  name: 'createOrder',
  data() {
    return {
      revievename: '',
      phone: '',
      address: ''
    }
  },
  created() {
    console.log("totalPrice=" + this.$route.query.totalPrice)
    console.log("selectedGoods=" + this.$route.query.selectedGoods+"count="+this.$route.query.selectedGoods.length)
  },
  methods: {
    handleFinishCommit() {

      let param = {
        "receiverName": this.revievename,
        "receiverPhone": this.phone,
        "formatAddress": this.address,
        "createTime": new Date(),
        "totalAmount": this.$route.query.totalPrice,
        "orderSn": new Date().getTime() + "",
        "memberUsername": getCookie("username"),
        "receiverKeyword": this.revievename
      }
      console.log("提交订单=" + param)
      createOrder(param).then(response => {
        let cout = 0;
        this.$route.query.selectedGoods.forEach((id, index) => {
          deleteGoods(id).then(response => {
            cout++
            if (cout == this.$route.query.selectedGoods.length) {
              MessageBox({
                type: 'success',
                message: '订单提交成功',
                showClose: true,
              });
              this.$router.replace('/');
            }

          });
        });
      });
    }

  }
}
</script>
<style>

.app-container {
  position: absolute;
  left: 0;
  right: 0;
  width: 720px;
  padding: 35px 35px 15px;
  margin: 20px auto;
}
</style>
