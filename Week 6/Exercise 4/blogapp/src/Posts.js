// src/Posts.js
import React from 'react';
import Post from './Post';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false,
      errorMsg: ''
    };
  }

  // Method to load posts using Fetch API
  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then((response) => response.json())
      .then((data) => {
        const posts = data.slice(0, 5).map(
          (item) => new Post(item.id, item.title, item.body)
        );
        this.setState({ posts });
      })
      .catch((error) => {
        this.setState({ hasError: true, errorMsg: error.message });
      });
  }

  // Lifecycle method: Called after component mounts
  componentDidMount() {
    this.loadPosts();
  }

  // Lifecycle method: Catches errors in child components
  componentDidCatch(error, info) {
    this.setState({ hasError: true, errorMsg: error.toString() });
  }

  // Render method
  render() {
    if (this.state.hasError) {
      return <div>Error: {this.state.errorMsg}</div>;
    }

    return (
      <div>
        <h2>Posts</h2>
        {this.state.posts.map((post) => (
          <div key={post.id}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
            <hr />
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
