const Cohort = require('./cohort.js');

const Cohorts = function(){
  this.cohortsArray = [];
}

Cohorts.prototype.populate = function () {

    var teachers1 = ["Keith", "Sandy", "Sian", "Upul"];
    var teachers2 =["Craig", "Zsolt", "John"];
    var teachers3 = ["Darren", "Finn", "Jarrod"];

    cohort1 = new Cohort("E17", new Date(2017, 9, 30, 11, 59), teachers1, true, "https://docs.google.com/forms/d/e/1FAIpQLSd0pVHemq7NOwRcKnMCuDND1m9GB1xQqfT_0KipE_6wd-FECw/viewform");
    cohort2 = new Cohort("E18", new Date(2017, 10, 20, 11, 59), teachers2, true, "https://docs.google.com/forms/d/e/1FAIpQLSfqghB5o61Hjo8y4w-UPAH6Zp7v4HOoxjBLqaMrtqcfk05hzQ/viewform");
    cohort3 = new Cohort("E19", new Date(2018, 0, 29, 11, 59), teachers3, false, "https://docs.google.com/forms/d/e/1FAIpQLSfBtfnkjDNSKWJu3bG7HmNAr4sv34xr6-kRQl2VYG7AS28KAw/viewform");
    cohort4 = new Cohort("E20", new Date(2018, 2, 5, 11, 59), teachers1, false, "https://docs.google.com/forms/d/e/1FAIpQLSd0pVHemq7NOwRcKnMCuDND1m9GB1xQqfT_0KipE_6wd-FECw/viewform");
    cohort5 = new Cohort("E16", new Date(2017, 9, 1, 11, 59), teachers1, true, "https://docs.google.com/forms/d/e/1FAIpQLSd0pVHemq7NOwRcKnMCuDND1m9GB1xQqfT_0KipE_6wd-FECw/viewform");

    this.cohortsArray.push(cohort4);
    this.cohortsArray.push(cohort2);
    this.cohortsArray.push(cohort3);
    this.cohortsArray.push(cohort1);
    this.cohortsArray.push(cohort5);

    this.checkAge();
    this.sortByWeek();

    return this.cohortsArray;
};

Cohorts.prototype.sortByWeek = function () {
  return this.cohortsArray.sort(function(a, b){
    return b.week - a.week;
  })
};

Cohorts.prototype.checkAge = function () {
  var updatedArray = []
  this.cohortsArray.forEach(function(cohort){
    if(cohort.week > 0 && cohort.week < 17){
      updatedArray.push(cohort);
    }
  })
  this.cohortsArray = updatedArray;
  return this.cohortsArray;
};


module.exports = Cohorts;
