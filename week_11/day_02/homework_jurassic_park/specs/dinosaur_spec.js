const assert = require('assert');
const Dinosaur = require('../Dinosaur.js');
const Park = require('../Park.js');

describe(`Dinosaur`, function(){

  let dinosaur;

  beforeEach(function(){
    dinosaur = new Dinosaur('tyrannosaurus', 3)

  })

  it('dinosaur type', function(){
    assert.strictEqual(dinosaur.type, "tyrannosaurus");
  })

  it('dinosaur has offspring', function(){
    assert.strictEqual(dinosaur.offspring_per_year, 3);
  })

})
