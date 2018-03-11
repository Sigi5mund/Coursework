const assert = require('assert');
const Dinosaur = require('../Dinosaur.js');
const Park = require('../Park.js');


describe(`Park`, function(){


  beforeEach(function(){
    tyrannosaurus = new Dinosaur('tyrannosaurus', 3);
    dilophosaurus = new Dinosaur('dilophosaurus', 2);
    park = new Park();
  })


it('should be able to calculate number of dinosaurs after 1 year starting with 1 dinosaur', function(){
  park.addDinosaur(tyrannosaurus);
  assert.strictEqual(park.calculateDinosaurs(1), 4);
});

it('should be able to calculate number of dinosaurs after 2 years starting with 1 dinosaur', function(){
  park.addDinosaur(tyrannosaurus);
  assert.strictEqual(park.calculateDinosaurs(2), 16);
});

it('should be able to calculate number of dinosaur after year two starting with 2 dinosaurs', function(){
  park.addDinosaur(tyrannosaurus);
  park.addDinosaur(dilophosaurus);
  assert.strictEqual(park.calculateDinosaurs(2), 25);
});

});
