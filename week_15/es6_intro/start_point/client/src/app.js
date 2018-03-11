var MakeupGetter = require('./MakeupGetterES5');
import MakeupGetterES6 from './MakeupGetterES6';

var app = function(){
  // var mg = new MakeupGetter("maybelline");
  // mg.fetchProducts();
  const mg = new MakeupGetterES6("maybelline");
  mg.fetchProducts();
};

window.onload = app;
