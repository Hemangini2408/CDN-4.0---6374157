import React from 'react';
import './App.css';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  return (
    <div className="app-container">
      <div className="section">
        <CourseDetails />
      </div>
      <div className="section">
        <BookDetails />
      </div>
      <div className="section">
        <BlogDetails />
      </div>
    </div>
  );
}

export default App;
