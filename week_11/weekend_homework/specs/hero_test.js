const assert = require('assert');
const Hero = require('../Hero.js');
const Food = require('../Food.js');
const Task = require('../Task.js');
const Rat = require('../Rat.js');

describe('Hero', function(){

  beforeEach(function(){
    food = new Food("Banana", 20);
    task = new Task("Quest", 5, 10, food);
    rat = new Rat();
    hero = new Hero("Thor", food);
  })

  it("initialised properly", function() {
    assert.strictEqual(hero.name, "Thor");
    assert.strictEqual(hero.fav_food.name, food.name);
    assert.strictEqual(hero.tasks.length, 0);
    assert.strictEqual(hero.foods.length, 0);
  })

  it("hero can add food", function() {
    hero.addFood(food);
    assert.strictEqual(hero.foods.length, 1);
  })

  it("hero can eat", function() {
    hero.addFood(food);
    hero.eat(hero.foods[0]);
    assert.strictEqual(hero.health, 130);
  })

  it("hero can add task", function() {
    hero.addTask(task)
    assert.strictEqual(hero.tasks.length, 1);
  })

  it("hero can complete a task", function() {
    hero.addTask(task);
    hero.completeTask(hero.tasks[0]);
    assert.strictEqual(hero.tasks.length, 1);
    assert.strictEqual(hero.foods.length, 1);
    assert.strictEqual(hero.tasks[0].complete, true);
  })



})
