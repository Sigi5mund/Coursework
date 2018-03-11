import React from 'react';

const CountrySelector = (props) => {

  function handleChange(e){
    props.onCountrySelected(e.target.value);
  }

  const options = props.countries.map( (country, index) => {
    return <option value = {index} key ={index}>{country.name}</option>
  })

  return (
    <select id="country-selector" onChange={handleChange} defaultValue="default">
      <option disabled value="default">Choose a country...</option>
      { options }
    </select>
  )
}

export default CountrySelector;
