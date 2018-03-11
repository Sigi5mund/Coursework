import React, { Component } from 'react';
import CommentList from '../components/CommentList.js'

class CommentBox extends Component {

  constructor(){
    super();

    this.state ={
      comments: [
        {id: 1, author: "Beth", comment: "I love cats!"},
        {id: 2, author: "Ian", comment: "Yo!"},
        {id: 3, author: "Upul", comment: "Skidoosh"}
      ]
    }
  }

  render() {
    return <div className= "comment-box">
      <CommentList comments={this.state.comments}/> {/* this is the state*/}
  </div>;

  }


}

export default CommentBox;
