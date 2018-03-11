import React, { Component } from 'react';
import CommentList from '../components/CommentList';
import CommentForm from '../components/CommentForm';

class CommentBox extends Component {

  constructor() {
    super();

    this.state = {
      comments: [
        {id: 1, author: "Beth", comment: "I love cats!"},
        {id: 2, author: "Ian", comment: "Yo!"},
        {id: 3, author: "Upul", comment: "Skidoosh!"}
      ]
    }
      this.handleCommentSubmit = this.handleCommentSubmit.bind(this)
  }

  handleCommentSubmit(comment){
    comment.id =Date.now();
    const newComments =this.state.comments.concat([comment]);
    this.setState({comments: newComments});
  }

  render() {
    return (
      <div className="comment-box">
        <CommentList comments={ this.state.comments } title="My Comment List"/>
        <h4>Add your comment here</h4>
        <CommentForm onCommentSubmit = {this.handleCommentSubmit}/>

      </div>
    )
  }

}

export default CommentBox;
