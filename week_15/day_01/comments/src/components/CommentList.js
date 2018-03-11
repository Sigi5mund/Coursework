import React, { Component } from 'react';
import Comment from './Comment.js'

class CommentList extends Component {

  render() {



    const commentNodes = this.props.comments.map( comment => {

        return (
          <Comment author={comment.author} key={comment.id}>
            { comment.comment }
          </Comment>
        )

    })

    return (
      <div className="commentList"> {commentNodes}</div>
    )
  }

}

export default CommentList;
