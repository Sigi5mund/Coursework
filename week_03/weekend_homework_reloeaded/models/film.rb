require_relative ('../db/sql_runner.sql')


class Film
  attr_reader :id, :title, :price

  def initialize(options)
    @id = options['id'] if options['id']
    @title = options['title']
    @price = options['price']
  end
