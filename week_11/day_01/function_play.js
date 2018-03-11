function hello(name, mood) {
  console.log(name + " you are " + mood);
};

hello("Ian", "happy")

function add(a, b){
  return a + b;
}

console.log(add(1,2,3));

function sum() {
  var i, total = 0;


  for (i = 0; i < arguments.length; i++){
    total += arguments[i];
  }
  return total;
}


console.log(sum(1,2,3,4));


var add = function(a,b){
  return a + b;
};



var wow = function(functionToInvoke) {
  console.log(functionToInvoke(2,1));
};
wow(add);


wow(function(a,b) {
return a * b;
});









var fullName = function(name, surname) {
  console.log("Howdy, I am " + name + " " + surname);
};
fullName("Tom", "Cruise");

var multiply = function(number1, number2) {
  return number1*number2;
};
console.log(multiply(2, 3));

var returnFirst = function(array) {
  return array[0];
}

console.log(returnFirst([ 2, 3, 5, 6]));

var printListOfNames=function(){
  for (var i = 0; i < arguments.length; i++) {
    console.log(arguments[i]);
  }
};


printListOfNames("Ben", "Phill", "Andrew", "Sofie");

var animals = ["Yogi", "Peppa", "Rudolph"];

var farmFunc = function(animals) {
  var farm = [];
  for (var i = 0; i < animals.length; i++){
    farm.push(animals[i]);
  }
  printAnimals(farm);
};

function printAnimals(farm){
  for(var animal of farm){
    console.log(animal);
  }
}

farmFunc(animals);
