import React, {Component} from 'react';

class CommentForm extends Component {

  constructor(){
    super();

    this.state = {
        author: '',
        comment: ''
    }

    this.handleAuthorChange = this.handleAuthorChange.bind(this);
    this.handleCommentChange = this.handleCommentChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

handleAuthorChange(e){
  this.setState({
    author: e.target.value
  })
}

handleCommentChange(e){
  this.setState({
    comment: e.target.value
  })
}

handleSubmit(e){
  e.preventDefault();
  const author = this.state.author.trim();
  const comment = this.state.comment.trim();
  if(!author || !comment){
    return;
  }

  this.props.onCommentSubmit({author: author, comment: comment});

  this.setState({
    author: '',
    comment: ''
  })

}

render() {
  return(
    <form className="commentForm" onSubmit ={this.handleSubmit}>
      <input
        type="text"
        placeholder ="Your Name"
        value = {this.state.author}
        onChange={this.handleAuthorChange}
      />
      <input
        type ="text"
        placeholder="Your comment"
        value = {this.state.comment}
        onChange={this.handleCommentChange}
      />
      <input type="submit" value="Add New Comment >>"/>

    </form>
  )
}


}
export default CommentForm;
