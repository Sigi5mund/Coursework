const Request = require('../services/request');
const Cohort = require('cohorts.js');



var cohorts = [];

var teachers1 = ["Keith", "Sandy", "Sian", "Upul"];
var teachers2 =["Craig", "Zsolt", "John"];
var teachers3 = ["Darren", "Finn", "Jarrod"];

var cohort1 = new Cohort("E17", 30/10/17, teachers1, 13);
var cohort2 = new Cohort("E18", 20/11/17, teachers2, 10);
var cohort3 = new Cohort("E19", 29/01/18, teachers3, 2);

cohorts.push(cohort1);
cohorts.push(cohort2);
cohorts.push(cohort3);

module.exports = cohorts;
