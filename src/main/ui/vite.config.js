import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

// const proxyPlugin = require('vite-plugin-proxy')
// https://vitejs.dev/config/
export default {
  plugins: [
    vue(),
    // proxyPlugin({
    //   '/api': {
    //     target: 'http://localhost:9999',
    //     changeOrigin: true,
    //     onProxyRes: (proxyRes) => {
    //       // cache all responses for faster development
    //       // use browser's "Disable cache" in dev tools when you need to update API responses
    //       proxyRes.headers['Cache-Control'] = `public, max-age=${ONE_YEAR_IN_SECONDS}`
    //       // delete headers you don't want
    //       delete proxyRes.headers['expires']
    //     },
    //   },
    // }),
  ],
}
