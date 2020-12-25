module.exports = {
    // 选项...
    publicPath:'/',
    outputDir:'dist',
    lintOnSave:true,//lintOnSave: process.env.NODE_ENV !== 'production'  在生产构建时禁用 eslint-loader
    productionSourceMap:true,
    css:{
        sourceMap:true
    },
    devServer: {
        // proxy: null,
        disableHostCheck: true,
        host: 'localhost',
        port: 8080,
        https: false,
        hotOnly: false,
        proxy: {
            '/api': {
                target: 'http://localhost:8081', //源地址
                changeOrigin: true, //改变源
                // pathRewrite: {
                //   '^/api': '' //路径重写
                // }
            },
        },
        // before: app => {}
    },
    parallel:require('os').cpus().length > 1,



}
