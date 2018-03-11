const Person = function(name, pet){
this.name = name;
this.pet = pet;

}

const shaggy = new Person("Shaggy Rogers");
shaggy.greet;

const velma = new Person("Velma Dinkley");
velma.greet;

Person.prototype.greet = function () {
  console.log(`Hi! My name is ${ this.name }`)
};

Person.prototype.feed = function (food) {
    console.log(`${this.name} fed a`, food, "to", this.pet.name)
};
module.exports = Person;
