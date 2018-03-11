import React from 'react';

const CountryDetail = (props) => {
  if (!props.country) return null;
  return (
    <h3>
      Country: {props.country.name} <br></br>
      Population: {props.country.population}
    </h3>
  )
}

export default CountryDetail;
