const WaterBottle = function(){
  this.volume = 0;

}

WaterBottle.prototype.fillup = function (amount) {
  this.volume = amount;
};

WaterBottle.prototype.drink = function () {
  if (this.volume <10) {
    return "The bottle is empty"
  }
  else
   {this.volume = this.volume - 10};
};

WaterBottle.prototype.empty = function (){
  this.volume = 0;
}

module.exports = WaterBottle;
