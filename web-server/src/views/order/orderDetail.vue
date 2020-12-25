<template>
  <div class="detail-container">
    <div>
      <el-steps :active="formatStepStatus(order.status)" finish-status="success" align-center>
        <el-step title="提交订单" :description="formatTime(order.createTime)"></el-step>
        <el-step title="支付订单" :description="formatTime(order.paymentTime)"></el-step>
        <el-step title="平台发货" :description="formatTime(order.deliveryTime)"></el-step>
        <el-step title="确认收货" :description="formatTime(order.receiveTime)"></el-step>
      </el-steps>
    </div>
    <el-card shadow="never" style="margin-top: 15px;text-align: left;">
      <div class="operate-container">
        <i class="el-icon-warning color-danger" style="margin-left: 20px"></i>
        <span class="color-danger">当前订单状态：{{order.status | formatStatus}}</span>
      </div>
      <div style="margin-top: 20px">
        <i class="el-icon-s-order"></i>
        <span class="font-small">基本信息</span>
      </div>
      <div class="table-layout">
        <el-row>
          <el-col :span="8" class="table-cell-title">订单编号</el-col>
          <el-col :span="8" class="table-cell-title">用户账号</el-col>
          <el-col :span="8" class="table-cell-title">支付方式</el-col>
        </el-row>
        <el-row>
          <el-col :span="8" class="table-cell">{{order.orderSn}}</el-col>
          <el-col :span="8" class="table-cell">{{order.memberUsername}}</el-col>
          <el-col :span="8" class="table-cell">{{order.payType | formatPayType}}</el-col>
        </el-row>
        <el-row>
          <el-col :span="8" class="table-cell-title">发货状态</el-col>
          <el-col :span="8" class="table-cell-title">物流公司</el-col>
          <el-col :span="8" class="table-cell-title">物流单号</el-col>
        </el-row>
        <el-row>
          <el-col :span="8" class="table-cell">{{order.status | formatStatus}}</el-col>
          <el-col :span="8" class="table-cell">{{order.deliveryCompany | formatNull}}</el-col>
          <el-col :span="8" class="table-cell">{{order.deliverySn  | formatNull}}</el-col>
        </el-row>
      </div>
      <div style="margin-top: 20px;text-align: left;">
        <i class="el-icon-s-custom"></i>
        <span class="font-small">收货人信息</span>
      </div>
      <div class="table-layout">
        <el-row>
          <el-col :span="6" class="table-cell-title">收货人</el-col>
          <el-col :span="6" class="table-cell-title">手机号码</el-col>
          <el-col :span="12" class="table-cell-title">收货地址</el-col>
        </el-row>
        <el-row>
          <el-col :span="6" class="table-cell">{{order.receiverName}}</el-col>
          <el-col :span="6" class="table-cell">{{order.receiverPhone}}</el-col>
          <el-col :span="12" class="table-cell">{{order.formatAddress}}</el-col>
        </el-row>
      </div>
    </el-card>
  </div>
</template>
<script>
  import {getOrderDetail} from '@/api/order';
  import {formatDate} from '@/utils/date';

  export default {
    name: 'orderDetail',
    data() {
      return {
        id: null,
        order: {},
        message: {title: null, content: null},
      }
    },
      created() {
        this.id = this.list = this.$route.query.id;
        getOrderDetail(this.id).then(response => {
          this.order = response.data;
        });
      },
    filters: {
      formatNull(value) {
        if (value === undefined || value === null || value === '') {
          return '暂无';
        } else {
          return value;
        }
      },
      formatPayType(value) {
        if (value === 1) {
          return '支付宝';
        } else if (value === 2) {
          return '微信';
        } else {
          return '未支付';
        }
      },
      formatStatus(value) {
        if (value === 1) {
          return '待发货';
        } else if (value === 2) {
          return '已发货';
        } else if (value === 3) {
          return '已完成';
        } else if (value === 4) {
          return '已关闭';
        } else if (value === 5) {
          return '无效订单';
        } else {
          return '待付款';
        }
      }
    },
    methods: {
      formatTime(time) {
        if (time == null || time === '') {
          return '';
        }
        let date = new Date(time);
        return formatDate(date, 'yyyy-MM-dd hh:mm:ss')
      },
      formatStepStatus(value) {
        if (value === 1) {
          //待发货
          return 2;
        } else if (value === 2) {
          //已发货
          return 3;
        } else if (value === 3) {
          //已完成
          return 4;
        } else {
          //待付款、已关闭、无限订单
          return 1;
        }
      }
    }
  }
</script>
<style scoped>
  .detail-container {
    width: 80%;
    padding: 20px 20px 20px 20px;
    margin: 20px auto;
  }

  .operate-container {
    background: #F2F6FC;
    height: 80px;
    margin: -20px -20px 0;
    line-height: 80px;
  }

  .table-layout {
    margin-top: 20px;
    border-left: 1px solid #DCDFE6;
    border-top: 1px solid #DCDFE6;
  }

  .table-cell {
    height: 60px;
    line-height: 40px;
    border-right: 1px solid #DCDFE6;
    border-bottom: 1px solid #DCDFE6;
    padding: 10px;
    font-size: 14px;
    color: #606266;
    text-align: center;
    overflow: hidden;
  }

  .table-cell-title {
    border-right: 1px solid #DCDFE6;
    border-bottom: 1px solid #DCDFE6;
    padding: 10px;
    background: #F2F6FC;
    text-align: center;
    font-size: 14px;
    color: #303133;
  }
</style>


