import React from 'react';
import CountrySelector from '../components/CountrySelector';
import CountryDetail from '../components/CountryDetail';

class CountryContainer extends React.Component {
  constructor(props){
    super(props);
    this.state = {
      countries: [],
      currentCountry: null
    };

 this.handleCountrySelected = this.handleCountrySelected.bind(this);
}
componentDidMount(){
    const url = 'https://restcountries.eu/rest/v2/all';
    const xhr = new XMLHttpRequest();
    xhr.open('GET', url);
    xhr.addEventListener('load', () => {
      if (xhr.status !== 200) return;
      const jsonString = xhr.responseText;
      const countries = JSON.parse(jsonString);
      this.setState({
        countries: countries
      })
    })
    xhr.send();
  }

  handleCountrySelected(index){
    const selectedCountry = this.state.countries[index]
    this.setState({
      currentCountry: selectedCountry
    });
  }


  render(){
    return (
      <div>
        <h2>Country Container</h2>
        <CountrySelector onCountrySelected = {this.handleCountrySelected} countries={this.state.countries}/>
        <CountryDetail country ={this.state.currentCountry}/>
      </div>
    );
  }
}


export default CountryContainer;
