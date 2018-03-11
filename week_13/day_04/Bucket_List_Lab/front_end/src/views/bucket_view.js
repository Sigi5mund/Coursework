const BucketView = function() {
  this.countries = [];
}

BucketView.prototype.addCountry = function(country) {
  console.log(country);
  this.countries.push(country);
  this.render();
};

BucketView.prototype.render = function() {
  var bucketlist = document.querySelector('#bucketlist')
  bucketlist.innerHTML = ""
  this.countries.forEach(function(element) {
    var li = document.createElement('li');
    li.innerText = element.country;
    bucketlist.appendChild(li);
  })
};

module.exports = BucketView;
