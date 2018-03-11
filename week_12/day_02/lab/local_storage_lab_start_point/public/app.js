var init = function () {
  var button = document.querySelector('button');
  button.addEventListener('click', handleButtonClick);

  var todosArray = JSON.parse(localStorage.getItem('todoList')) || [];
  populate(todosArray);
}

var populate = function (todos) {

  // - loop through the array of todos, invoking addItem() for each todo item
}

var addItem = function (item) {
  var ul = document.querySelector('#todo-list');
  var itemElement = document.createElement('li');
  var paragraph = document.createElement('p');
  paragraph.innerText = item;
  itemElement.appendChild(paragraph);
  ul.appendChild(itemElement);
}

var handleButtonClick = function () {
  var textBoxString = document.querySelector('#new-item');
  var tag = textBoxString.value;
  addItem(tag);


  // - add it to local storage by invoking save()
}

var save = function (newItem) {
  // this function needs to:
  // - get the data back from local storage and parse to an array

  // - add the newItem to the array

  // - stringify the updated array

  // - save it back to localstoage
}

window.addEventListener('load', init);
