require_relative ('../db/sql_runner.sql')


class Customer
  attr_reader :id, :name, :funds

  def initialize(options)
    @id = options['id'] if options['id']
    @name = options['name']
    @funds = options['funds']
  end





end
