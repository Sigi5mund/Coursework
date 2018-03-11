const assert = require('assert');
const WaterBottle = require('../water_bottle.js')
const Athlete = require('../athlete.js')

describe('Athlete', function () {

let bottle;
let athlete;

beforeEach(function(){
    bottle = new WaterBottle();
    bottle.fillup(100);
    athlete = new Athlete(bottle);

  });



  it('has hydration level', function(){
    assert.strictEqual(athlete.hydration, 100);
  })

  it('has distance_covered level', function(){
    assert.strictEqual(athlete.distance_covered, 0);
  })

  it('run changes distance_covered and hydration', function(){
    athlete.run();
    assert.strictEqual(athlete.hydration, 90);
    assert.strictEqual(athlete.distance_covered, 10);
  })

  it('too dehydrated to run', function(){
    athlete.run();
    athlete.run();
    athlete.run();
    athlete.run();
    athlete.run();
    athlete.run();
    athlete.run();
    athlete.run();
    athlete.run();
    athlete.run();
    athlete.run();
    assert.strictEqual(athlete.hydration, 0);
    assert.strictEqual(athlete.distance_covered, 100);
  })

  it('rehydrate with waterbottle', function(){
    athlete.run();
    athlete.run();
    assert.strictEqual(athlete.hydration, 80);
    athlete.drink();
    assert.strictEqual(athlete.hydration, 90);
  })


})
