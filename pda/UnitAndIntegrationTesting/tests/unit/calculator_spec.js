var Calculator = require('../../public/js/calculator.js')
var assert = require('assert')

describe('calculator', function () {
  beforeEach(function () {
    calculator = new Calculator()
  });

  // write unit tests here in the form of "it should do something..."
  it('it has a sample test', function(){
    assert.equal(true, true)
  })

  it('adds 1 and 4 correctly', function(){
    calculator.numberClick(4);
    calculator.operatorClick('+');
    calculator.numberClick(1);
    calculator.operatorClick('=')
    assert.equal(calculator.runningTotal, 5)
  })


  it('adds floating point numbers correctly', function(){
    calculator.numberClick(3);
    calculator.operatorClick('+');
    calculator.numberClick(1);
    calculator.operatorClick('=')
    assert.equal(calculator.runningTotal, 4)
  })

  it('subtracts 7 from 4 correctly', function(){
    calculator.numberClick(7);
    calculator.operatorClick('-');
    calculator.numberClick(4)
    calculator.operatorClick('=')
    assert.equal(calculator.runningTotal, 3 )
  })

  it('subtracts floating point numbers correctly', function(){
    calculator.numberClick(10.5);
    calculator.operatorClick('-');
    calculator.numberClick(5.5)
    calculator.operatorClick('=')
    assert.equal(calculator.runningTotal, 5 )
  })

  it('multiply correctly', function(){
    calculator.numberClick(2);
    calculator.operatorClick('*');
    calculator.numberClick(3)
    calculator.operatorClick('=')
    assert.equal(calculator.runningTotal, 6 )
  })

  it('multiply floating point numbers correctly', function(){
    calculator.numberClick(2.5);
    calculator.operatorClick('*');
    calculator.numberClick(2)
    calculator.operatorClick('=')
    assert.equal(calculator.runningTotal, 5 )
  })

  it('divide correctly', function(){
    calculator.numberClick(3);
    calculator.operatorClick('/');
    calculator.numberClick(1)
    calculator.operatorClick('*');
    calculator.numberClick(5)
    calculator.operatorClick('=')
    assert.equal(calculator.runningTotal, 15 )
  })

  it('divide floating point numbers correctly', function(){
    calculator.numberClick(10);
    calculator.operatorClick('/');
    calculator.numberClick(2.5)
    calculator.operatorClick('=')
    assert.equal(calculator.runningTotal, 4 )
  })

  it('clear button works', function(){
    calculator.numberClick(10);
    calculator.operatorClick('/');
    calculator.numberClick(2.5);
    calculator.operatorClick('=');
    calculator.clearClick();
    assert.equal(calculator.runningTotal, 0 )
  })

  it('multiply 3 and 5', function(){
    calculator.numberClick(3);
    calculator.operatorClick('*');
    calculator.numberClick(5);
    calculator.operatorClick('=')
    assert.equal(calculator.runningTotal, 15)
  })

  it('divide 21 by 7 correctly', function(){
    calculator.numberClick(21);
    calculator.operatorClick('/');
    calculator.numberClick(7);
    calculator.operatorClick('=')
    assert.equal(calculator.runningTotal, 3)
  })

  it('concatenate', function(){
    calculator.numberClick(3);
    calculator.numberClick(1);
    assert.equal(calculator.runningTotal, 31)
  })


});
