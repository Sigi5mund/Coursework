require('minitest/autorun')
require('minitest/rg')
require_relative('../bank_account.rb')

class TestBankAccount <
  MiniTest::Test


  def test_get_account_name
    bank_account = BankAccount.new("Upul", 500, "business")
    assert_equal("Upul", bank_account.holder_name)
  end

  def test_get_amount
    bank_account = BankAccount.new("Upul", 500, "business")
    assert_equal(500, bank_account.amount)
  end

  def test_get_type
    bank_account = BankAccount.new("Upul", 500, "business")
    assert_equal("business",   bank_account.type)
  end

  def test_set_account_name
    bank_account = BankAccount.new("Upul", 500, "business")
    bank_account.holder_name = "Sian"
    # bank_account.set_holder_name("Sian")
    assert_equal("Sian", bank_account.holder_name)
  end

  def test_set_account_amount
    bank_account = BankAccount.new("Upul", 500, "business")
    # bank_account.set_amount(200)
    bank_account.amount = 200
    assert_equal(200, bank_account.amount)
  end

  def test_set_account_type
    bank_account = BankAccount.new("Upul", 500, "business")
    # bank_account.set_type("Personal")
    bank_account.type = "Personal"
    assert_equal("Personal", bank_account.type)
  end


def test_pay_into_account
    bank_account = BankAccount.new("Upul", 500, "business")
    bank_account.pay_in(2)
    assert_equal(502,bank_account.amount)
  end

def test_monthly_fee
    bank_account = BankAccount.new("Upul", 500, "business")
    bank_account2 =BankAccount.new("Upul", 500, "personal")
    bank_account.pay_monthly_fee
    bank_account2.pay_monthly_fee
    assert_equal(450, bank_account.amount)
    assert_equal(490, bank_account2.amount)

  end



end
