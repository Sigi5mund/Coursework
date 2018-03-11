const DateView = function() {
  
}

DateView.prototype.displayDate = function () {
  const now = new Date();
  dateField = document.querySelector('#date');
  const options = { weekday: 'long', year: 'numeric', month: 'long', day: 'numeric', hour: 'numeric', minute: 'numeric' };
  dateField.innerText = now.toLocaleDateString('gb-GB', options);
};

DateView.prototype.dynamicDate = function () {
  setInterval(this.displayDate, 1000);
};

module.exports = DateView;
