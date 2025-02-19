// see http://vuejs-templates.github.io/webpack for documentation.
var path = require('path')

module.exports = {
    build: {
			sitEnv: require('./sit.env'),
			prodEnv: require('./prod.env'),
			index: path.resolve(__dirname, '../dist/index.html'),
			assetsRoot: path.resolve(__dirname, '../dist'),
			assetsSubDirectory: 'static',
			assetsPublicPath: '/im/',          //请根据自己路径配置更改
			productionSourceMap: false,
			// Gzip off by default as many popular static hosts such as
			// Surge or Netlify already gzip all static assets for you.
			// Before setting to `true`, make sure to:
			// npm install --save-dev compression-webpack-plugin
			productionGzip: false,
			productionGzipExtensions: ['js', 'css'],
			// Run the build command with an extra argument to
			// View the bundle analyzer report after build finishes:
			// `npm run build --report`
			// Set to `true` or `false` to always turn it on or off
			bundleAnalyzerReport: process.env.npm_config_report
    },
    dev: {
			env: require('./dev.env'),
			port: 9527,
			autoOpenBrowser: true,
			assetsSubDirectory: 'static',
			assetsPublicPath: '/',
			proxyTable: {
			    '/TeamTalk': {
			        target: 'http://localhost:8090/',
			        secure: false,
					changeOrigin: true,   //开启跨域
					pathRewrite: {
					  '^/TeamTalk': '/im' //重写路径将'/api'转化为'/'
						  //"^“这个字符是在中括号”[]“中被使用的话就是表示字符类的否定，如果不是的话就是表示限定开头。
						//得到正确的请求地址http://localhost:8080/xx
					}
			    }
			},
			// CSS Sourcemaps off by default because relative paths are "buggy"
			// with this option, according to the CSS-Loader README
			// (https://github.com/webpack/css-loader#sourcemaps)
			// In our experience, they generally work as expected,
			// just be aware of this issue when enabling this option.
			cssSourceMap: false
    }
}
