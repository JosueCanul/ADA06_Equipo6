package data;

import java.util.LinkedList;

import model.Pokemon;
import model.comparators.PokemonAttack;

public class Converter {

    public LinkedList<? extends Pokemon> convertAttack(LinkedList<Pokemon> list){
        LinkedList<PokemonAttack> listPokemonSpecific = new LinkedList<PokemonAttack>();
        
        PokemonAttack pokemonAttack;
        
        for(Pokemon pokemon: list){
            pokemonAttack = ((PokemonAttack)pokemon);
            listPokemonSpecific.add(pokemonAttack); 
        }

        return listPokemonSpecific;
    }
}
