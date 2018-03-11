require 'sinatra'
require 'sinatra/reloader'

get '/' do
  "Hello World"
end

get '/hello' do
  puts "Hello World 2"
end

get '/roll-die' do
  #  number = rand(1..6)
  # return "#{number}"
  return rand(1..6).to_s
end


# get '/name/:first/:last' do
#   return params.to_s
# end

get '/name/:first/:last' do
  return "Your name is #{params[:first]} #{params[:last]}."
end

get '/friends/:number' do
     friends = ["Joey", "Chandler", "Monica", "Ross"]
     if params[:number].to_i >= friends.count
       return "You don't have that many friends! :P"
     else
       return friends[params[:number].to_i ]
     end
end
