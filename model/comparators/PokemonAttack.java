package model.comparators;

import model.Pokemon;
import model.PokemonInterfaceRadix;

public class PokemonAttack extends Pokemon implements Comparable<PokemonAttack>, PokemonInterfaceRadix{
    
    public PokemonAttack(Integer number, String name, String typeOne, String typeTwo, Integer total, Integer hp,
            Integer attack, Integer defense, Integer spAttack, Integer spDefense, Integer speed, Integer generation,
            Boolean legendary) {
        super(number, name, typeOne, typeTwo, total, hp, attack, defense, spAttack, spDefense, speed, generation,
                legendary);
    }
    
    

    @Override
    public int compareTo(PokemonAttack pokemon) {
        if(this.getAttack() < pokemon.getAttack()){
            return 1;
        }else if(this.getAttack() > pokemon.getAttack()){
            return -1;
        }else{
            return 0;
        }
    }



    @Override
    public Integer getValueForRadix() {
        return attack;
    }



    
}
