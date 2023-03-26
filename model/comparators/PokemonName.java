package model.comparators;

import model.Pokemon;

public class PokemonName extends Pokemon implements Comparable<Pokemon> {
    @Override
    public int compareTo(Pokemon pokemon){
        char[] ownName = this.name.toCharArray(); 
        char[] comparateName = pokemon.getName().toCharArray();
        
        for(int letter = 0; Character.getNumericValue(ownName[letter]) != Character.getNumericValue(comparateName[letter]); letter++ );

        return 0;
    }
}
