var app = function(){
  changeTagline();
  quoteOfDayOff();
  quotesArray();
  colourChange();
}


var changeTagline = function(){
  const tagline = document.getElementById('tagline');
  tagline.innerHTML = "Your quotes app!";
};

var quoteOfDayOff = function(){
  const quote = document.getElementById("quote-of-the-day");
  quote.style.visibility = "hidden";
};

var colourChange = function(){
  const items = document.getElementsByTagName("article");
  for (item of items){
    item.style.backgroundColor = "Dodgerblue";
  }
};


var QUOTES_ARRAY = [
  { quote: "Now is the summer of our discontent ", author: "Shakespeare" },
  { quote: "Go away! ", author: "Matt Healy" },
  { quote: "Classic Steve... ", author: "Cohort 9" }
];

function addElement (quote, author) {
  var newDiv = document.createElement("div");
  var newContent = document.createTextNode(quote);
  var newContent2 = document.createTextNode(author);
  newDiv.appendChild(newContent);
  newDiv.appendChild(newContent2);
  newDiv.style.backgroundColor = "Dodgerblue";
  var currentDiv = document.getElementById("quotes");
  currentDiv.appendChild(newDiv);
}

const quotesArray = function(){
for (quote of QUOTES_ARRAY){
  addElement(quote.quote, quote.author)
  }
}


document.addEventListener("DOMContentLoaded", app)
