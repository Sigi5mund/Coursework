


class Coven
  attr_accessor :coven

  def initialize(wizards)
    @wizards = wizards
  end

  def cast_coven_spell(spell_name)
    coven_spell = []
    for person in @wizards
      coven_spell << person.cast_spell(spell_name)
    end
    return coven_spell
  end




end
