## vue-shop 项目介绍

##### 后台管理系统 `web-server`
- 统计报表
- 分类管理
- 商品管理
- 订单管理


##### 用户端系统 `web-client`
-首页
-分类列表
-商品列表
-商品详情
-购物车
-下单

##### Java后端 `mySpringBoot`

## 技术栈

#### 前端技术
|技术               | 说明                               | 官网

|----------------|----------------------------|----------------------------------|
|Vue                | 前端框架                         | https://vuejs.org/
|Vue-router     | 路由框架                         | https://router.vuejs.org/
|Vuex              | 全局状态管理框架          | https://vuex.vuejs.org/
|Element         | 前端UI框架                     | https://element.eleme.io/
|Axios             | 前端HTTP框架                | https://github.com/axios/axios
|v-charts         | 基于Echarts的图表框架  | https://v-charts.js.org/
|Js-cookie      | cookie管理工具              | https://github.com/js-cookie/js-cookie

#### 后端技术

| 技术                         | 说明                                 | 官网                                                 |
| ---------------------- | ---------------------- -| ---------------------------------------------------- |
| MySQL                     |数据库
| SpringBoot             | 容器+MVC框架         | https://spring.io/projects/spring-boot               
| MyBatis                  | ORM框架                  | http://www.mybatis.org/mybatis-3/zh/index.html       
| MyBatisGenerator  | 数据层代码生成      | http://www.mybatis.org/generator/index.html          
| PageHelper            | MyBatis物理分页插件 | http://git.oschina.net/free/Mybatis_PageHelper       


## 项目布局
### web-server
``` 
src -- 源码目录
├── api -- axios网络请求定义
├── assets -- 静态图片资源文件
├── components -- 通用组件封装
├── icons -- 图片文件
├── router -- vue-router路由配置
├── store -- vuex的状态管理
├── styles -- 全局css样式
├── utils -- 工具类
└── views -- 前端页面
    ├── home -- 首页
    ├── layout -- 通用页面加载框架
    ├── login -- 登录页
    ├── order -- 订单模块页面
    ├── product -- 商品模块页面
    └── productCate -- 分类模块页面
```
### web-client
``` 
src -- 源码目录
├── api -- axios网络请求定义
├── components -- 通用组件封装
├── router -- vue-router路由配置
├── store -- vuex的状态管理
├── utils -- 工具类
└── views -- 前端页面
    ├── login -- 登录页
    ├── home -- 首页
    ├── goods -- 商品详情页
    ├── search -- 根据分类查询商品列表页面
    ├── shopCar -- 购物车页面
    └── order -- 下单填写收货人信息页面
```

## 环境搭建
## 前端
- 下载node并安装
- 运行命令：npm install,下载相关依赖; 
- 运行命令:  npm run serve,运行项目 

## 后端
- 安装mySql 导入sql文件    
- 开发工具IDEA 2018版 JDK 1.8 导入项目,运行                               
