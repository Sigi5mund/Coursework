const express = require('express');
const dogRouter = new express.Router();

var dogs = ["German Sheperd", "Golden Retriever", "Jack Russell"];


//index
dogRouter.get('/', function(req, res){
  res.json({data: dogs});
});

//create
dogRouter.post('/', function(req, res){
  dogs.push(req.body.dog);
  res.json({data: dogs});
});

//show
dogRouter.get('/:id', function(req, res){
  res.json({data: dogs[req.params.id]});
});

//update
dogRouter.put('/:id', function(req, res){
  dogs[req.params.id] = req.body.dog;
  res.json({data: dogs});
});

//destroy
dogRouter.delete('/:idcd', function(req, res){
  dogs.splice(req.params.id, 1);
  res.json({data: dogs});
});

module.exports = dogRouter;
