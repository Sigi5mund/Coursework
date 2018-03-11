const express = require('express');
const server = express();
const bodyParser = require('body-parser');
const MongoClient = require('mongodb').MongoClient;
const cors = require('cors');

server.use(bodyParser.json());
server.use(express.static('client/build'));
server.use(bodyParser.urlencoded({extended: true}));
server.use(cors());

MongoClient.connect('mongodb://localhost:27017', function(err, client) {
  if (err) {
    console.log(err);
    return;
  };

  const db = client.db("bucket_list");

  server.get('/api/bucketlist', function(req, res) {
    db.collection("bucket_list").find().toArray(function(err, result) {
      res.status(200);
      res.json(result);
    })
  });

  server.post('/api/bucketlist', function(req, res) {
    db.collection("bucket_list").insert(req.body, function(err, result) {
      if (err) {
        console.log(err);
        res.status(500);
        res.send();
      }

      res.status(201);
      res.json(result.ops[0]);
    });
  });

  server.listen(5000, function() {
    console.log('Listening on port 5000');
  });

})
