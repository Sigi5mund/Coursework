import React, { Component } from 'react';
import Movie from './Movie.js'

class MovieList extends Component {

  render() {



    const movieNodes = this.props.movies.map( movie => {

        return (
          <Movie title={movie.title} key={movie.id}>
            { movie.time }
          </Movie>
        )

    })

    return (
      <div className="movieList"> {movieNodes}</div>
    )
  }

}

export default MovieList;
