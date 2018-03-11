const CountrySelect = function(container) {
  this.container = container;
}

CountrySelect.prototype.render = function(data) {
  data.forEach(function(element) {
    var optionTag = document.createElement('option');
    optionTag.innerText = element.name;
    this.container.appendChild(optionTag);
  }.bind(this))
}

module.exports = CountrySelect;
