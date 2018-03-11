// var guitars = ["Fender", "Gibson", "Gretsch"];
// console.log("Guiters:", guitars);
//
// var drums = new Array();
// drums.push("Yamaha");
// drums.push("Gretsch");
//
// console.log(guitars[2]);
// console.log(drums[1]);
//
// drums[1] = "Zildjan";
// drums[10] = "boom";
// console.log(drums);
// console.log(drums.length);
//
// for (var i = 0; i < guitars.length; i++) {
//   console.log(guitars[i]);
// }
//
// for (var g of guitars){
//   console.log(g);
// }

var myPerson = {
  name: "Guybrush",
  age: 32,
  weapon: "Cutlass",
  talk: function(){
    console.log("Shiver my timbers " + this.name);
  }
}

console.log(myPerson.name);
console.log(myPerson["name"]);

myPerson.name = "Ian";

myPerson.occupation = "Pirate";
console.log(myPerson.occupation);

myPerson.talk;
// refers directly to the function
myPerson.talk();
// calls the function

var anotherObject = Object.create(null);
var yetAnotherObject = new Object();

for (var key in myPerson) {
   console.log(`myPerson.${key} = ${myPerson[key]}`);
  }

var keys = Object.keys(myPerson);

console.log(keys);

var values = Object.values(myPerson);

console.log(values);
