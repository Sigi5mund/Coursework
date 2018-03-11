import React, { Component } from 'react';
import MovieList from '../components/MovieList.js'
import MoreButton from '../components/MoreButton.js'

class MovieOverview extends Component {

  constructor(){
    super();

    this.state ={
      movies: [
        {id: 1, title: "Guardians of the Galaxy", time: "17.30"},
        {id: 2, title: "Kung Fu Panda", time: "19.20"},
        {id: 3, title: "Rocky 5000", time: "21.40"}
      ]
    }
  }


  render() {
    return <div className= "movie-overview">
      <MovieList movies={this.state.movies}/> {/* this is the state*/}
      <MoreButton />
  </div>;

  }


}

export default MovieOverview;
