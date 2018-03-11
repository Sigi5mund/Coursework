

const functionCaller = function(myCallBack, number) {
  return myCallBack(number);
};

const increment = function(number){
  return number +1;
}

const square = function(number){
  return number * number;
}

const doSomeMathsForMe = function(callback, n){
  return callback(n);
}

console.log(doSomeMathsForMe(increment, 1));
console.log(doSomeMathsForMe(square, 2));
