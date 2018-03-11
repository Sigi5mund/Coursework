const Task = function(desc, difficulty, urgency, reward){

  this.complete = false;
  this.desc = desc;
  this.difficulty = difficulty;
  this.urgency = urgency;
  this.reward = reward;

}



module.exports = Task;
