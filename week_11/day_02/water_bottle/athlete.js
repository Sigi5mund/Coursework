const Athlete = function(waterbottle){
  this.hydration = 100;
  this.distance_covered = 0;
  this.waterbottle = waterbottle;

}

Athlete.prototype.run = function() {
  if (this.hydration >= 10){
  this.hydration = (this.hydration - 10);
  this.distance_covered = (this.distance_covered + 10);
}
else {
  console.log('You are too dehydrated to run!')
}
};

Athlete.prototype.drink = function () {
  if ((this.waterbottle.volume >= 10)&&(this.hydration <=90)){
      this.waterbottle.volume = (this.waterbottle.volume - 10);
      this.hydration = (this.hydration + 10);
}
}


module.exports = Athlete;
