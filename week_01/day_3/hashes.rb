
# countries = {:united_kingdom =>
#             {
#             :scotland => {:population => 5, :capital => "Edinburgh"},
#             :england => {:population => 40, :capital => "London"},
#             :wales => {:population => 3, :capital => "Cardiff"}
#             }
#             }
#
#
# p countries

countries = {united_kingdom:
{scotland: {population: 5, capital: "Edinburgh"},
england: {population: 40, capital: "London"},
ireland: {population: 7, capital: "Dublin"}},
europe:
{hungary: {population: 30, capital: "Budapest"},
greece: {population: 30, capital: "Athens"},
france: {population: 40, capital: "Paris"}}
}

p countries[:united_kingdom][:scotland][:capital]


#
# countries = {
# scotland: {population: 5, capital: "Edinburgh"},
# england: {population: 40, capital: "London"},
# ireland: {population: 7, capital: "Dublin"}
# }
#
#
#
# avengers = {
# iron_man: {:name => "Tony Stark", moves: {kick: 100, punch: 10}},
# hulk: {name: "Bruce Banner", moves: {roll: 500, smash: 1000}},
# }
#
# p avengers[:hulk][:moves][:smash]



populationsAndCapitals = {united_kingdom:
{scotland: {population: 5, capital: "Edinburgh"},
england: {population: 40, capital: "London"},
ireland: {population: 7, capital: "Dublin"}},
europe:
{hungary: {population: 30, capital: "Budapest"},
greece: {population: 30, capital: "Athens"},
france: {population: 40, capital: "Paris"}}
}

p countries[:united_kingdom][:scotland][:capital]
