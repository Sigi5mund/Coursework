import React, { Component } from 'react';
import PiggyBank from './PiggyBank'

class App extends Component {
  render() {
    return (
      <PiggyBank title="Beth's Savings Pig" owner= "Beth" depositAmount = '10'/>
    );
  }
}

export default App;
