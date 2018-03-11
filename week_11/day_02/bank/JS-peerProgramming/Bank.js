const Account = require('./Account.js');


const Bank = function(){
    this.accounts = [];
};

Bank.prototype.addAccount = function(name, amount, type){
  var account = new Account(name, amount, type);
      this.accounts.push(account);
}

Bank.prototype.findBiggestAccount = function(){
  var biggestAccount = this.accounts[0];
  for (account of this.accounts){
       if (account.amount >= biggestAccount.amount) {
          biggestAccount = account;
       }
  }
  return biggestAccount;
}

Bank.prototype.findTotal = function(){
  var sum = 0;
  for (account of this.accounts){
      sum = (sum + account.amount);
  }
  return sum;
}

Bank.prototype.findAverage = function(){
  var sum = 0;
  for (account of this.accounts){
      sum = (sum + account.amount);
  }
  return sum = (sum / this.accounts.length);
}

Bank.prototype.findTotalByType = function(type){
  var sum = 0;
  for (account of this.accounts){
       if (account.type == type) {
          sum = (sum + account.amount);
       }
  }
  return sum;
}



module.exports = Bank;
