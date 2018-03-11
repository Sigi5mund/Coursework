var express = require('express');
var app = express();
app.use(express.static('public'));
const bodyParser = require('body-parser');
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended: true}));

app.use(require('./controllers/index'));

app.listen(3000, function() {
  console.log('Happy days! Listening on port ' + this.address().port);
});
