var Cohort = require('../cohort');
var assert = require('assert');

describe ('Cohort', function () {
  var cohort1;
  var cohort2;
  var cohort3;
  var teachers1;
  var teachers2;
  var teachers3;
});

beforeEach(function () {
  teachers1 = ["Keith", "Sandy", "Sian", "Upul"];
  teachers2 =["Craig", "Zsolt", "John"];
  teachers3 = ["Darren", "Finn", "Jarrod"];
  cohort1 = new Cohort("E17", new Date(2017, 09, 30), teachers1, true);
  cohort2 = new Cohort("E18", new Date(2017, 10, 20), teachers2, true);
  cohort3 = new Cohort("E19", new Date(2018, 0, 29), teachers3, false);
  cohort4 = new Cohort("E20", new Date(2018, 2, 5), teachers1, false);
});

it('should count the week numbers since starting', function() {
  assert.equal(cohort1.week, 14);
  assert.equal(cohort2.week, 11);
  assert.equal(cohort3.week, 3);
  assert.equal(cohort4.week, 0);

});
