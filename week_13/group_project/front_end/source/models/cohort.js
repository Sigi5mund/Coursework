const Request = require('../services/request');


const Cohort = function(name, start_date, teachers, week){
  this.name = name;
  this.start_date = start_date;
  this.teachers = teachers;
  this.syllabus= "";
  this.week = week;
}

module.exports = Cohort;
