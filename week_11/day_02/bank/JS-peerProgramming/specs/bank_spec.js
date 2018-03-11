const assert = require('assert');
const Bank = require('../Bank.js');
const Account = require('../Account.js');

describe(`Bank`, function(){

  let bank;
  let account;

  beforeEach(function(){
    bank = new Bank();
    account = new Account("Andrew", 3000, "personal");
  })

  it('account added', function(){
    assert.strictEqual(bank.accounts.length, 0);
    bank.addAccount("Andrew", 3000, "personal");
    assert.strictEqual(bank.accounts.length, 1);
  })

  it('biggest account is', function(){
    bank.addAccount("Andrew", 3000, "personal");
    bank.addAccount("Lenia", 5000, "personal");
    bank.addAccount("CodeClan", 7000, "business");
    assert.strictEqual( bank.findBiggestAccount().name ,"CodeClan");
  })

  it('total value', function(){
    bank.addAccount("Andrew", 3000, "personal");
    bank.addAccount("Lenia", 5000, "personal");
    bank.addAccount("CodeClan", 7000, "business");
    assert.strictEqual( bank.findTotal(), 15000);
  })

  it('total value', function(){
    bank.addAccount("Andrew", 3000, "personal");
    bank.addAccount("Lenia", 5000, "personal");
    bank.addAccount("CodeClan", 7000, "business");
    assert.strictEqual( bank.findAverage(), 5000);
  })

  it('total value', function(){
    bank.addAccount("Andrew", 3000, "personal");
    bank.addAccount("Lenia", 5000, "personal");
    bank.addAccount("CodeClan", 7000, "business");
    assert.strictEqual( bank.findTotalByType("personal"), 8000);
  })


})
