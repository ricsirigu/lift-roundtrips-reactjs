const path = require('path')

module.exports = {
    entry: './src/main/webapp/assets/js/main.js',
    output: {path: __dirname + '/src/main/webapp/assets/compiled', filename: 'bundle.js'},
    devtool: "#eval-source-map",
    module: {
        loaders: [
            {
                test: /.jsx?$/,
                loader: 'babel-loader',
                exclude: /node-modules/,
                query: {
                    presets: ['es2015', 'react']
                }
            }
        ]
    }
}