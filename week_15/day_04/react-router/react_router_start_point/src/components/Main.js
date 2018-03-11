import React, { Component } from "react";
import About from "./About";
import Home from "./Home";
import Pricing from "./Pricing";
import NavBar from './NavBar'
import { BrowserRouter as Router, Route} from "react-router-dom"

class Main extends Component {

constructor(){
  super()
  this.state ={
    pricing: [
        {level: "Hobby", cost: 0},
        {level: "Startup", cost: 10},
        {level: "Enterprise", cost: 100}
      ]
  }
}

render() {
  return (

    <Router>
      <React.Fragment>
        <NavBar />
        <Route exact path ="/" component = {Home} />
        <Route path = "/about" component={About} />
        <Route
          path = "/pricing"
          render={ () => { return <Pricing prices ={this.state.pricing} />} }
        />
      </React.Fragment>
    </Router>
  )
}
}


export default Main;
