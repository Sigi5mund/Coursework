const Pet = function(name, species){
  this.name = name;
  this.species = species;
};


Pet.prototype.eat = function (food) {
  console.log(`${this.name} ate a`, food)
};

const tsiki = new Pet("Tsiki", "Dog");

tsiki.eat("melba");
tsiki.eat("an entirely evil pigeon");

module.exports = Pet;
