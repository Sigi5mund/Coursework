var numbers = [1,2,3,4,5];

numbers.forEach(function(element) {
  console.log(`this number is: ${element}`)
})




var ourForEach = function(array, callbackForItem){
for (number of array) {
  callbackForItem(number);
}

}



var numbers = [1,2,3,4,5]

ourForEach(numbers, function(number){
  console.log(`this number is ${number}`)
})
