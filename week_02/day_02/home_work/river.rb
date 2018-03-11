


class River

  attr_accessor :name, :fishes, :fish, :fish_name, :fish_remove

     def initialize(name, fishes)
       @name = name
       @fishes = fishes
     end

     def name
       return @name
     end

     def stock_count
      return @fishes.count
     end

end
