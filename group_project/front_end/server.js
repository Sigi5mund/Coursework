const express = require('express');
const server = express();
const cors = require('cors');
const request = require('request');

server.use(express.static('build'));
server.use(cors());

server.get('/api/events', function(req, res) {
  const options = {
    url: 'https://opentechcalendar.co.uk/api1/area/62/events.json',
    method: 'GET',
    headers: {
        'Accept': 'application/json',
        'Accept-Charset': 'utf-8',
    }
  };
  request(options, function(error, response, body) {
    let json = JSON.parse(body);
    res.json(json)
  });
});

server.listen(3000, function(){
  console.log("Listening on port 3000");
});
