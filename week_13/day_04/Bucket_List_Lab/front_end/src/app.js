const SelectList = require('./models/select_list');
const CountrySelect = require('./views/country_select');
const Request = require('./services/request.js');
const BucketView = require('./views/bucket_view');

const bucketView = new BucketView();
const bucketRequest = new Request('http://localhost:5000/api/bucketlist');


const getbucketList = function(countries) {
  countries.forEach(function(country) {
    bucketView.addCountry(country);
  })
}

const app = function(){
  var select = document.querySelector('#countries-dropdown');
  const selectList = new SelectList("https://restcountries.eu/rest/v2/all");
  const countrySelect = new CountrySelect(select);
  selectList.onLoad = countrySelect.render.bind(countrySelect);
  selectList.getData();
  var button = document.querySelector('#submit');
  button.addEventListener('click', function(){
    var submitRequest = new Request('http://localhost:5000/api/bucketlist');
    console.log(submitRequest);
    const body = {country: select.value};
    submitRequest.post(createRequestComplete, body)
  })

  bucketRequest.get(getbucketList);


  var createRequestComplete = function(country) {
    bucketView.addCountry(country);
  }








}

document.addEventListener('DOMContentLoaded', app);
