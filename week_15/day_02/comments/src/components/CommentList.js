import React, { Component } from 'react';
import Comment from './Comment';

class CommentList extends Component {

  constructor(props){
    super(props);

    console.log(props);
  }

  render() {

    const commentNodes = this.props.comments.map( comment => {

      return (
        <Comment author={comment.author} comment={comment.comment} key={comment.id}>
        </Comment>
      )

    })

    return <div className="commentList"> {commentNodes} </div>;
  }
}

export default CommentList;
