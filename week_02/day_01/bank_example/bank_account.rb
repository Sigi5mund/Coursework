
class BankAccount
  # attr_reader :holder_name, :amount, :type
  # attr_writer :holder_name, :amount, :type
  attr_accessor :holder_name, :amount, :type

  def initialize(input_holder_name, input_amount, input_type)
    @holder_name = input_holder_name
    @amount = input_amount
    @type = input_type
  end

  # def get_holder_name()
  #   return @holder_name
  # end
  #
  # def get_amount()
  #   return @amount
  # end
  #
  # def get_type()
  #   return @type
  # end
  #
  # def set_holder_name(name)
  #   @holder_name = name
  # end
  #
  # def set_amount(amount)
  #   @amount = amount
  # end
  #
  # def set_type(type)
  #   @type = type
  # end
  #

  def pay_in(value)
    @amount += value
  end

  # def pay_in(value)
  #   self.amount += value
  # end
# self can be used too 

  def pay_monthly_fee #This is hardwiring the amount into the fee implicitly.
    @amount -= 50 if @type == "business"
    @amount -= 10 if @type == "personal"
  end



end
