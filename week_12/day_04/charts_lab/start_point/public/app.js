var makeRequest = function(url, callback) {
  var request = new XMLHttpRequest();
  request.open('GET', url);
  request.addEventListener('load', callback);
  request.send();
}

var requestComplete = function() {
  if(this.status !== 200) return;
  var jsonString = this.responseText;
  var countries = JSON.parse(jsonString);
  getData(countries);
}

var getData = function(countries, fieldName) {
  var countryObjects = [];
  for(country of countries) {
    countryObjects.push({
      name: country.name,
      population: country.population
    });
  }
  createChartData(countryObjects);
}

var createChartData = function(countryData) {
  var container = document.querySelector('#pie-chart');
  var countriesChartData = {
    chart: {
      type: 'pie',
      renderTo: container
    },
    title: {
      text: 'Populations of Countries'
    },
    series: [{
      name: 'Population',
      data: []
    }]
  }

  for(each of countryData) {
    object = {
      name: each.name,
      y: each.population
    }
    // console.log(countriesChartData.series[0]);
    countriesChartData.series[0].data.push(object);
  }
  new PieChart(countriesChartData);
}



var app = function() {
  var url = 'https://restcountries.eu/rest/v2/regionalbloc/nafta';
  var naftaButton = document.querySelector('#nafta-button');
  var euButton = document.querySelector('#eu-button');
  var carButton = document.querySelector('#caricom-button');

  naftaButton.addEventListener('click', function() {
    url = 'https://restcountries.eu/rest/v2/regionalbloc/nafta';
    makeRequest(url, requestComplete);
  })

  carButton.addEventListener('click', function() {
    url = 'https://restcountries.eu/rest/v2/regionalbloc/caricom';
    makeRequest(url, requestComplete);
  })

  euButton.addEventListener('click', function() {
    url = 'https://restcountries.eu/rest/v2/regionalbloc/eu';
    makeRequest(url, requestComplete);
  })

  makeRequest(url, requestComplete);
  // new PieChart();
  // new BarChart();
}

window.addEventListener('load', app);
