package model.comparators;

import model.Pokemon;

public class PokemonName extends Pokemon implements Comparable<PokemonName> {
    
     public PokemonName(Integer number, String name, String typeOne, String typeTwo, Integer total, Integer hp,
            Integer attack, Integer defense, Integer spAttack, Integer spDefense, Integer speed, Integer generation,
            Boolean legendary) {
        super(number, name, typeOne, typeTwo, total, hp, attack, defense, spAttack, spDefense, speed, generation,
                legendary);
    }
    @Override
    public int compareTo(PokemonName pokemon){
        if(this.name.compareToIgnoreCase(pokemon.getName()) > 0){
            return 1;
        }else if(this.name.compareToIgnoreCase(pokemon.getName()) < 0){
            return -1;
        }else{
            return 0;
        }
    }
}
