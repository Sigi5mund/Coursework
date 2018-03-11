const assert = require('assert');
const WaterBottle = require('../water_bottle.js')

describe('Water Bottle', function () {



  it('should be empty at start', function(){
    let bottle = new WaterBottle();
    assert.strictEqual(bottle.volume, 0);
  })


  it('should be full if 100 added', function(){
    let bottle = new WaterBottle();
    bottle.fillup(100);
    assert.strictEqual(bottle.volume, 100);
  })

  it('should go down by 10 when drink', function(){
    let bottle = new WaterBottle();
    bottle.fillup(100);
    bottle.drink();
    assert.strictEqual(bottle.volume, 90);
  })

  it('should go down to 0 when emptied', function(){
    let bottle = new WaterBottle();
    bottle.fillup(100);
    bottle.empty();
    assert.strictEqual(bottle.volume, 0);
  })

  it('cannot go below 0', function(){
    let bottle = new WaterBottle();
    bottle.empty();
    bottle.drink();
    assert.strictEqual(bottle.volume, 0);
  })

})
