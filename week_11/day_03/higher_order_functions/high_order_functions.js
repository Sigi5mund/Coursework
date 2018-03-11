//
// setTimeout(function(){
// console.log("I waited for 1 second");
// }, 1000);
//
// const message = function(){
//   console.log("I waited for 2 seconds");
// }
//
// setTimeout(message, 2000);

const logRed = function(){
  console.log("It's red!");
}

const logNotRed = function(){
  console.log("It's NOT red!");
}

const redChecker = function(colour, isRed, isNotRed){
  if (colour === "red"){
    isRed();
  } else {
    isNotRed();
  }
}

redChecker("red", logRed, logNotRed);
