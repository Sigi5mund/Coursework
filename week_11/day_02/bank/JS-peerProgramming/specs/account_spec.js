const assert = require('assert');
const Account = require('../Account.js');

describe(`Account`, function(){

  let account;

  beforeEach(function(){
    account = new Account("Andrew", 3000, "personal");
  })

  it('account amount', function(){
    // let bottle = new WaterBottle();   we declare it
    assert.strictEqual(account.amount, 3000);
  })

  it('account type', function(){
    // let bottle = new WaterBottle();   we declare it
    assert.strictEqual(account.type, "personal");
  })

})
