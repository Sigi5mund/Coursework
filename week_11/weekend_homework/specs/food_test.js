const assert = require('assert');
const Hero = require('../Hero.js');
const Food = require('../Food.js');
const Task = require('../Task.js');
const Rat = require('../Rat.js');

describe('Food', function(){

  beforeEach(function(){
    food = new Food("Banana", 20);
    task = new Task("Quest", 5, 10, food);
    rat = new Rat();
    hero = new Hero("Thor", food);
  })

  it("initialised properly", function() {
    assert.strictEqual(food.name, "Banana");
    assert.strictEqual(food.healthIncrease, 20);
    assert.strictEqual(food.poisoned, false);
  })






})
