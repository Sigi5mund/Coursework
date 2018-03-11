const Request = require('../services/request');


const SelectList = function (url) {
  this.url = url;
  this.onLoad = null;
}


SelectList.prototype.getData = function() {
  const request = new Request(this.url);
  console.log(request);
  request.get(this.onLoad);
}

SelectList.prototype.buildList = function (container) {
  console.log(this.onLoad);
}

SelectList.prototype.requestComplete = function(responseText) {
  this.onLoad = responseText;
}

module.exports = SelectList;
