const Hero = function(name, fav_food){

  this.name = name;
  this.fav_food = food;
  this.foods = [];
  this.tasks = [];
  this.health = 100;

}


Hero.prototype.talk = function () {
  return ` I am ${name}, desist in this crimal activity`
};

Hero.prototype.eat = function (food){
  if (food.poisoned == false) {
    if (hero.fav_food == food){
      this.health += (food.healthIncrease * 1.5)
    }
    else {
      this.health += food.healthIncrease;
    }
  }
  else {
    this.health -= food.healthDecrease;
  }
}

Hero.prototype.addFood = function (food){
  this.foods.push(food);
}

Hero.prototype.addTask = function (task){
  this.tasks.push(task);
}

Hero.prototype.completeTask = function (task){
  for (item of this.tasks){
    if (item == task){
      item.complete = true;
      this.foods.push(this.tasks.reward)
    }
  }
}

Hero.prototype.sortTaskByDifficulty = function (){
  let newArrayHard = [];
  let newArrayMedium = [];
  let newArrayEasy = [];
  let completeArray =[];
  let newArray = [];

  for (task in this.tasks){
    if (task.difficulty == "Hard");
    newArrayHard.push(task);
  }
  completeArray.push(newArrayHard);

  for (task in this.tasks){
    if (task.difficulty == "Medium");
    newArrayMedium.push(task);
  }
  completeArray.push(newArrayMedium);

  for (task in this.tasks){
    if (task.difficulty == "Easy");
    newArrayEasy.push(task);
  }
  completeArray.push(newArrayEasy);


  for (task in this.newArrayHard){
    newArray.push(task);
  }

  for (task in this.newArrayMedium){
    newArray.push(task);
  }

  for (task in this.newArrayEasy){
    newArray.push(task);
  }

  return newArray;
}


Hero.prototype.sortTaskByUrgency = function (urgency) {
  let newArray = [];
  for (task in this.tasks){
    if (task.urgency == urgency);
    newArray.push(task);
  }
  return newArray
}

Hero.prototype.sortTasksComplete = function () {
  let newArray = [];
  for (task in this.tasks){
    if (task.complete == true);
    newArray.push(task);
  }
  return newArray
}


Hero.prototype.sortTasksIncomplete = function () {
  let newArray = [];
  for (task in this.tasks){
    if (task.complete == false);
    newArray.push(task);
  }
  return newArray
}






module.exports = Hero;
