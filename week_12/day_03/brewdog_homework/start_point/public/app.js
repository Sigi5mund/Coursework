var app = function(){
  console.log('sup!')
  var url = 'https://api.punkapi.com/v2/beers';
    makeRequest(url, requestComplete);
}

var makeRequest = function(url, callback){
  var request = new XMLHttpRequest();
  request.open('GET', url);
  request.addEventListener('load', callback);
  request.send();
}

var requestComplete = function() {
  if (this.status !== 200)
  return;
  var jsonString = this.responseText;
  beers = JSON.parse(jsonString);
  console.log(beers);
  buildList(beers);
}

var buildList = function(beers){
  var ul = document.querySelector('#beer-list');
  beers.forEach(function(beer, index){
    li = document.createElement('li');
    img = document.createElement('IMG')
    li2 = document.createElement('li');
    li.innerText = `Name: ${beer.name}`;
    li2.innerText = `Desc: ${beer.description}\n\n`;
     // li2.innerText = `Malt ${beer.ingredients.malt[0].amount.value} ${beer.ingredients.malt[0].amount.unit} of ${beer.ingredients.malt[0].name} \n\n` + `Malt ${beer.ingredients.malt[1].amount.value} ${beer.ingredients.malt[1].amount.unit} of ${beer.ingredients.malt[1].name} \n\n`
     //  + `Malt ${beer.ingredients.malt[2].amount.value} ${beer.ingredients.malt[2].amount.unit} of ${beer.ingredients.malt[2].name} \n\n`
    img.width = 200;
    img.src = beer.image_url;
    ul.appendChild(li);
    ul.appendChild(img);
    ul.appendChild(li2);

  })


}

document.addEventListener('DOMContentLoaded', app);
