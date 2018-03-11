import React, { Component } from 'react';

class Movie extends Component {

  render() {

    return (
      <div>
        <h4> {this.props.title}: {this.props.children}</h4>

      </div>
    )
  }


}

export default Movie;
