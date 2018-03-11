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
  }

const db = client.db("codeclan_dashboard");

  server.get('/api/syllabus', function(req, res){
    db.collection('syllabus').find().toArray(function(err, results){
      if (err) {
        console.log(err);
        res.status(500);
        res.send();
      }
      res.json(results);
      console.log("API call success");
    })
  });


  server.listen(5000, function() {
    console.log('Listening on port 5000');
  });


});
