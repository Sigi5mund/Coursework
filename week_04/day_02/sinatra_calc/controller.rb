require 'sinatra'
require 'sinatra/reloader'
require_relative './sinatra_calc_start/models/calculator.rb'




get '/add/:num1/:num2' do
  result = Calculator.new(params[:num1].to_f, params[:num2].to_f)
  @calculation = result.add
  erb( :result )
end

get '/subtract/:num1/:num2' do
  result = Calculator.new(params[:num1].to_f, params[:num2].to_f)
  @calculation = result.subtract
  erb( :result )
end

get '/multiply/:num1/:num2' do
  result = Calculator.new(params[:num1].to_f, params[:num2].to_f)
  @calculation = result.multiply
  erb( :result )
end

get '/divide/:num1/:num2' do
  result = Calculator.new(params[:num1].to_f, params[:num2].to_f)
  @calculation = result.divide
  erb( :result )
end

get '/about' do
    erb( :about )
end

get '/' do
    erb( :home )
end
