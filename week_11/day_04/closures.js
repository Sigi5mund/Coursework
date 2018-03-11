//
//
//
// let setupAddFunction = function(){
//   var counter = 0;
//
//   return function() {
//     counter  ++;
//     console.log(counter);
//   }
//
//
// }
//
//
// var add = setupAddFunction();
// add();





let setupConversation = function(){
  var messages = [];

  return function(message){
    messages.push(message);
    messages.forEach(function(element){
      console.log(element);
    })
  }
}


// var addMessage = setupConversation();
//
// addMessage("I've got something very important to tell you that must never be forgotten");
// addMessage("Oh yeah?");
// addMessage("Oh, no. Wait... It's fine.");


var greetCurried = function(greeting){
  return function(name){
    console.log(greeting + ', ' + name);
  }
}

var greetHello = greetCurried("Hello")

greetHello("Sian");
