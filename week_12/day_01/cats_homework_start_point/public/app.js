// var app = function() {
//   addCat("Tony", "Zebra", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Cecil_the_lion_at_Hwange_National_Park_%284516560206%29.jpg/330px-Cecil_the_lion_at_Hwange_National_Park_%284516560206%29.jpg)")
// };
//
// var addCat = function(name, fav_Food, photo) {
//   var name = createName(name);
//   var favFood = createFavFood(fav_Food);
//   var photo = createPhoto(photo);
//   var list = createUl;
//   var cat = document.querySelector('#cats');
//   appendElements(name, favFood, photo, list);
// };
//
var createName = function(nameInput) {
  var name = document.createElement('li');
  name.innerText = nameInput;
  return name;
};

var createFavFood = function(fav_Food) {
  var favFood = document.createElement('li');
  favFood.innerText = fav_Food;
  return favFood;
};

var createPhoto = function(photoInput) {
  var photo = document.createElement('li');
  photo.src = photoInput;
  photo.width = "500"
  return photo;
};

var createUl = function() {
  var list = document.createElement('ul');
  return list;
};

// var appendElements = function(name, favFood, photo, list){
//   this.list.appendChild(name);
//   this.list.appendChild(favFood);
//   this.list.appendChild(photo);
// };


var name =createName("Tony");
var food = createFavFood("Zebra");
var photo = createPhoto("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Cecil_the_lion_at_Hwange_National_Park_%284516560206%29.jpg/330px-Cecil_the_lion_at_Hwange_National_Park_%284516560206%29.jpg)");
var space = document.elementById('lion');
var list = createUl();
list.appendElement(name):
list.appendElement(food):
list.appendElement(photo):

window.onload = app;
