
const ColumnConstruct = function(){
}

ColumnConstruct.prototype.renderColumn1 = function(week, syllabus){
  const day1 = document.querySelector('.Mon1');
  const day2 = document.querySelector('.Tue1');
  const day3 = document.querySelector('.Wed1');
  const day4 = document.querySelector('.Thu1');
  const day5 = document.querySelector('.Fri1');

  syllabus.forEach(function(element){
    if (element.week_number == week){
      day1.innerText = element.day1;
      day2.innerText = element.day2;
      day3.innerText = element.day3;
      day4.innerText = element.day4;
      day5.innerText = element.day5;
    }
  })

};

ColumnConstruct.prototype.renderColumn2 = function(week, syllabus){
  const day1 = document.querySelector('.Mon2');
  const day2 = document.querySelector('.Tue2');
  const day3 = document.querySelector('.Wed2');
  const day4 = document.querySelector('.Thu2');
  const day5 = document.querySelector('.Fri2');

  syllabus.forEach(function(element){
    if (element.week_number == week){
      day1.innerText = element.day1;
      day2.innerText = element.day2;
      day3.innerText = element.day3;
      day4.innerText = element.day4;
      day5.innerText = element.day5;
    }
  })
};

ColumnConstruct.prototype.renderColumn3 = function(week, syllabus){
  const day1 = document.querySelector('.Mon3');
  const day2 = document.querySelector('.Tue3');
  const day3 = document.querySelector('.Wed3');
  const day4 = document.querySelector('.Thu3');
  const day5 = document.querySelector('.Fri3');

  syllabus.forEach(function(element){
    if (element.week_number == week){
      day1.innerText = element.day1;
      day2.innerText = element.day2;
      day3.innerText = element.day3;
      day4.innerText = element.day4;
      day5.innerText = element.day5;
    }
  })
};

module.exports = ColumnConstruct;
