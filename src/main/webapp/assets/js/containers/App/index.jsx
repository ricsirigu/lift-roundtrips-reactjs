import React from 'react'
import ReactDOM from 'react-dom'
import ArticleList from '../../components/ArticleList/index.jsx'

class App extends React.Component{

    constructor(props){
        super(props)
        this.state = {articles: [{}]}
    }

    componentDidMount(){
        //Ugly workaround
        setTimeout(() => {
            myRTFunctions.articleQuery().then((articles) => {
                this.setState({articles}, console.log(JSON.stringify(this.state)))
            })
        }, 0)
    }

    render(){
        return(<ArticleList articles={this.state.articles}/>)
    }
}

ReactDOM.render(<App />, document.getElementById('app'))