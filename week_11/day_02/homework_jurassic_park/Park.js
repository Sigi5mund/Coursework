const Dinosaur = require('./Dinosaur.js');



const Park = function(){
    this.enclosure = [];
};


Park.prototype.addDinosaur = function (dinosaur) {

this.enclosure.push(dinosaur);
};

Park.prototype.findDinosaursWith2orMoreOffspring = function () {
  var array = [];
    for (dinosaur of this.enclosure){
      if (dinosaur.offspring_per_year >= 2)
      array.push(dinosaur);
    }
    return array;
};

Park.prototype.removeByType = function(type) {
var dinosaurToKeep =[];
  for (dinosaur of this.enclosure){
    if (dinosaur.type != type )
    dinosaurToKeep(dinosaur);
};
this.enclosure = dinosaurToKeep;
}

Park.prototype.calculateDinosaurs = function(years){
  let totalDinosaurs = 0;
  for (var dinosaur of this.enclosure){
    totalDinosaurs +=((dinosaur.offspring_per_year +1) ** years);
  }
  return totalDinosaurs;
}


module.exports = Park;
