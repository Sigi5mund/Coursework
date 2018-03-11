

var bear = {
name : "Yogi",
type: "cartoon",
age: 43,
weapon: "claws",
belly: [],
eat: function(fish){
  this.belly.push(fish);
}
};

bear.eat("A fish");
console.log(bear.belly);
