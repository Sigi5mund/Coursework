window.addEventListener('load', function(){
  var canvas =document.querySelector('#main-canvas');
//console.log('canvas', canvas);
var context = canvas.getContext('2d');
console.log(context);

// context.fillStyle = 'blue';
context.fillRect(10,10,50, 50);

context.beginPath();
context.moveTo(100,100);
context.lineTo(100,200);
context.stroke();

context.beginPath();
context.moveTo(200,300);
context.lineTo(200,400);
context.lineTo(100,400);
context.closePath();
context.fill();

var drawCircle = function(x, y){
context.beginPath();
context.arc(x, y, 100, 0, 2 * Math.PI);
// context.fill();
context.stroke();
}
//
// var img = document.createElement('img');
// img.src = 'http://emojis.slackmojis.com/emojis/images/1457563042/312/doge.png'
//
// var drawDog = function(){
//   context.drawImage(img, 300, 200, 190, 190)
// }
//
// img.addEventListener('load', drawDog);

canvas.addEventListener('click', function(event){

  drawCircle(event.x, event.y);
  // console.log('canvas clicked');
  // console.log('location', layer.x, layer.y);
})

var changeColour = function (){
  context.strokeStyle = this.value;
}

var colourPicker = document.querySelector('#input-color');
colourPicker.addEventListener('change', changeColour);

//
// context.moveTo(313, 217.5 - 91.5);
// context.bezierCurveTo(313 + (0.5522847498307936 * 172), 217.5 - 91.5,  313 + 172, 217.5 - (0.5522847498307936 * 91.5), 313 + 172, 217.5);
// context.bezierCurveTo(313 + 172, 217.5 + (0.5522847498307936 * 91.5), 313 + (0.5522847498307936 * 172), 217.5 + 91.5, 313, 217.5 + 91.5);
// context.bezierCurveTo(313 - (0.5522847498307936 * 172), 217.5 + 91.5, 313 - 172, 217.5 + (0.5522847498307936 * 91.5), 313 - 172, 217.5);
// context.bezierCurveTo(313 - 172, 217.5 - (0.5522847498307936 * 91.5), 313 - (0.5522847498307936 * 172), 217.5 - 91.5, 313, 217.5 - 91.5);
// context.moveTo(217.5, 166 - 87);
// context.bezierCurveTo(217.5 + (0.5522847498307936 * 81.5), 166 - 87,  217.5 + 81.5, 166 - (0.5522847498307936 * 87), 217.5 + 81.5, 166);
// context.bezierCurveTo(217.5 + 81.5, 166 + (0.5522847498307936 * 87), 217.5 + (0.5522847498307936 * 81.5), 166 + 87, 217.5, 166 + 87);
// context.bezierCurveTo(217.5 - (0.5522847498307936 * 81.5), 166 + 87, 217.5 - 81.5, 166 + (0.5522847498307936 * 87), 217.5 - 81.5, 166);
// context.bezierCurveTo(217.5 - 81.5, 166 - (0.5522847498307936 * 87), 217.5 - (0.5522847498307936 * 81.5), 166 - 87, 217.5, 166 - 87);
// context.rect(102, 57, 413, 271);
// context.stroke();


})
