require 'sinatra'
require 'sinatra/reloader'
require_relative 'models/game.rb'


get '/play/:hand1/:hand2' do
  result = Game.new(params[:hand1],params[:hand2])
  @playing = result.play
  erb ( :play )
end

get '/play' do
  erb (:play)
end
get '/' do
erb ( :home )
end
get '/home' do
erb ( :home )
end


get '/about' do
erb( :about )

end
