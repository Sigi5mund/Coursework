require('pry-byebug')
require_relative( './models/album' )
require_relative( './models/artist' )



artist1 = Artist.new( { 'name' => 'Oasis' } )
artist1.save();
album1 = Album.new( { 'name' => 'Roll With It', 'artist_id' => artist1.id } )
album1.save()
album2 = Album.new( { 'name' => 'Another album', 'artist_id' => artist1.id } )
album2.save()


binding.pry
nil
