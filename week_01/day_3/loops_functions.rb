chicken_hashes = [
  { name: "Margaret", age: 2, eggs: 0 },
  { name: "Hetty", age: 1, eggs: 2 },
  { name: "Henrietta", age: 3, eggs: 1 },
  { name: "Audrey", age: 2, eggs: 0 },
  { name: "Mabel", age: 5, eggs: 1 },
]

chicken_hashes1 = [
  { name: "adam", age: 2, eggs: 0 },
  { name: "alex", age: 1, eggs: 2 },
  { name: "andrew", age: 3, eggs: 1 },
]

def find_chicken_by_name(hash, name)
  bird =name.downcase
  for chicken in hash
    if bird== chicken[:name].downcase
      return "Found her! #{name} is here!"
    end
  end
    return "Nope #{name} wasnt here! She must have escaped!"
end


p find_chicken_by_name(chicken_hashes, "Mabel")
p find_chicken_by_name(chicken_hashes1, "Andrew")
