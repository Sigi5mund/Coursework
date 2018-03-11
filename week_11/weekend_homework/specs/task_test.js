const assert = require('assert');
const Hero = require('../Hero.js');
const Food = require('../Food.js');
const Task = require('../Task.js');
const Rat = require('../Rat.js');

describe('Task', function(){



    beforeEach(function(){
      food = new Food("Banana", 20)
      task = new Task("Quest", 5, 10, banana)
    })

    it("has initialised ok", function() {
      assert.strictEqual(task.desc, "Quest");
      assert.strictEqual(task.difficulty, 5);
      assert.strictEqual(task.urgency, 10);
      assert.strictEqual(task.reward.name, food.name);
    })


})
