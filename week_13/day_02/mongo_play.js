

db.animals.renameCollection("crisps");

use crisps;

    db.crisps.insert({
      brand: "Space Raiders",
      flavour: "Spicy"
    });

    db.crisps.insert({
      brand: "Skips",
      flavour: "Chedder"
    });

    db.crisps.update({
      brand: "Skips"
    },{
      $set: {flavour: "Salt and Vinegar"}
    });

    db.crisps.remove( {brand: "Space Raiders"});

    db.crisps.find();

    db.sweets.insert([{
      brand: "Cadbury",
      type: "Dairy Milk"
    },
    {
      brand: "Nestle",
      type : "Mars"
    }
  ]);

  db.sweets.find();
  show collections;



db.dropDatabase();
