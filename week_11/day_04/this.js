function add(a,b){
  this.myNumber = 20;
  return a + b;
}

// console.log(add(5,3)); //8
let car = {

  speed: 0,

  accelerate: function(){
    // console.log(this);
    this.speed += 10;
  },

  decelerate: function(){
    this.speed -=10;
  }

}

car.accelerate();

function Animal(type, legs){
  this.type = type;
  this.legs = legs;
  this.logInfo = function(){
    console.log(`The ${this.type}, has ${this.legs} legs.`);
  }
}

let myCat = new Animal('Cat', 4);

// myCat.logInfo();

setTimeout(myCat.logInfo.bind(myCat), 1000);
