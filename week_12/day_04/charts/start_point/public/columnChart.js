var ColumnChart = function(){
  var container = document.querySelector('#column-chart');

  var chart = new Highcharts.Chart( {
    chart: {
      type: 'column',
      renderTo: container
    },
    title: {
      text: 'Our Favourite Programming Languages'
    },
    series: [{
      name: 'Cohort 17',
      data: [8, 12, 3, 1]
    },{
      name: 'Cohort 18',
      data: [2, 15, 1, 5]
    }],
    xAxis: {
      categories: ['JavaScript', 'Java', 'Ruby', 'Algol']
    }
   })
}
