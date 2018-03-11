var Bank = function() {
  this.accounts = [];
}

Bank.prototype.addAccount = function (account) {
  this.accounts.push(account);
}



Bank.prototype.accountByName = function (name) {
  var account;
  this.accounts.forEach(function(element){
    if (element.name == name){
      account =element
    }
  })
  return account;
}

Bank.prototype.largestAccount = function () {
  var highestAccount = this.accounts[0];
  this.accounts.forEach(function(element){
    if (element.value > highestAccount.value){
      highestAccount = element
    }
})
return highestAccount;
}

Bank.prototype.tenPercentInterest = function () {
  this.accounts.forEach(function(element){
    element.value = (element.value * 1.1);
  })
}

Bank.prototype.businessAccounts = function () {
  //  var businessAccounts = [];
  // this.accounts.forEach(function(element){
  //   if (element.type == 'business') {
  //     businessAccounts.push(element);
  //   }
  // })
  // return businessAccounts;

 return this.accounts.filter(account => account.type === 'business');

};

Bank.prototype.totalValue = function () {
  var totalValue = 0;
  this.accounts.forEach(function(element){
    totalValue += element.value;
  })
  return totalValue;
};

Bank.prototype.averageValue = function () {
  let reducer =function(curr, next){
    return curr + next.value;
  }

  total = this.accounts.reduce(reducer, 0);

  return (total/ this.accounts.length);
};



module.exports = Bank;
