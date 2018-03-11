

//
//
// var name = "Rick";
//
// var talk = function(){
//
//   console.log(name);
// };
//
// console.log(name);
//
// var walk = function(){
//   console.log(name + " is walking")
// };
//
// talk();
// walk();



var talk = function(){
  name= "Rick";
  console.log(name);
};

// wont work here because talk not called yet, so name not instanciated.
// console.log(name);

var walk = function(){
  console.log(name + " is walking")
};

talk();
walk();
console.log(name);

const MY_FAV = 7;

// neither will work to change it once declared.
// MY_FAV = 10;
// const MY_FAV = 10:

const MY_OBJECT = {name: "Guybrush"};
//  wont work
// MY_OBJECT = {name: "Upul" };

// but can add
// or change the object, just not all things are mutable or immutable
MY_OBJECT.age = 34;


function varTest(){
  var x = 1;
  if (true){
    var x =2;
    console.log(x); //2 and x now reassigned outside the if block
  }
  console.log(x); //2
}



function letTest(){
  let x = 1;
  if(true){
    let x =2;           //different variable
    console.log(x); //2
  }
  console.log(x); //1
}

for (let i = 0; i < array.length; i++){
  array[i]
}
