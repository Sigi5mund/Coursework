

use pokemon;

    db.pokemon.insert({
      name: "Charmander",
      type: "Fire"
    });

    db.pokemon.insert({
      name: "Squirtle",
      type: "Water"
    });

    db.pokemon.insert({
      name: "Bulbasaur",
      type: "Grass"
    });

    db.pokemon.find();

    db.pokemon.update({
        name: "Bulbasaur"
    },{
      $set: {name: "Venosaur"}
    });

    db.pokemon.remove({name: "Venosaur", type: "Grass"});

    db.pokemon.find();

    db.pokemon.insertMany([{
    name: "Charizard",
    type: "Fire"
    },
    {
    name: "Pikachu",
    type: "Electric"
    }
  ]);

  db.pokemon.update({
    {name: "Charizard"},{
      $set: {name: "Charmander"}
    }
  });

  db.pokemon.find();
  show collections;


db.pokemon.latencyStats();

db.pokemon.storageSize()

db.dropDatabase();
