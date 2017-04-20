import React from 'react'
import Article from '../Article/index.jsx'

export default class ArticleList extends React.Component{
    render(){

        const { articles } = this.props

        return(
            <ul>{articles.map((a, i) => <li key={i}><Article name={a.name} /></li>)}</ul>
        )
    }
}

ArticleList.defaultProps = {
    articles: []
}