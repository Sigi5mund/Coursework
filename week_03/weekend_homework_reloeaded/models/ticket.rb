require_relative ('../db/sql_runner.sql')


class Ticket
  attr_reader :id, :film_id, :ticket_id

  def initialize(options)
    @id = options['id'] if options['id']
    @film_id = options['film_id'].to_i
    @ticket_id = options['ticket_id'].to_i
  end
