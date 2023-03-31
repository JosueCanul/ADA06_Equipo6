package data;

import java.util.LinkedList;

import model.Pokemon;
import model.comparators.AttackInverse;
import model.comparators.NameInverse;
import model.comparators.PokemonAttack;
import model.comparators.PokemonName;

public class Converter {

    public LinkedList<PokemonAttack> convertAttack(LinkedList<Pokemon> list){
        LinkedList<PokemonAttack> listPokemonSpecific = new LinkedList<>();
        
        PokemonAttack pokemonAttack;
        
        for(Pokemon pokemon: list){
            pokemonAttack = new PokemonAttack(pokemon.getNumber(), pokemon.getName(), pokemon.getTypeOne(), 
            pokemon.getTypeTwo(), pokemon.getTotal(), pokemon.getHp(), pokemon.getSpAttack(),
            pokemon.getDefense(), pokemon.getSpAttack(), pokemon.getSpDefense(), pokemon.getSpeed(),
            pokemon.getGeneration(), pokemon.getLegendary());
            listPokemonSpecific.add(pokemonAttack); 
        }

        return listPokemonSpecific;
    }

    public LinkedList<AttackInverse> convertAttackInverse(LinkedList<Pokemon> list){
        LinkedList<AttackInverse> listPokemonSpecific = new LinkedList<>();
        
        AttackInverse pokemonAttack;
        
        for(Pokemon pokemon: list){
            pokemonAttack = new AttackInverse(pokemon.getNumber(), pokemon.getName(), pokemon.getTypeOne(), 
            pokemon.getTypeTwo(), pokemon.getTotal(), pokemon.getHp(), pokemon.getSpAttack(),
            pokemon.getDefense(), pokemon.getSpAttack(), pokemon.getSpDefense(), pokemon.getSpeed(),
            pokemon.getGeneration(), pokemon.getLegendary());
            listPokemonSpecific.add(pokemonAttack); 
        }

        return listPokemonSpecific;
    }

    public LinkedList<PokemonName> convertName(LinkedList<Pokemon> list){
        LinkedList<PokemonName> listPokemonSpecific = new LinkedList<>();
        
        PokemonName pokemonAttack;
        
        for(Pokemon pokemon: list){
            pokemonAttack = new PokemonName(pokemon.getNumber(), pokemon.getName(), pokemon.getTypeOne(), 
            pokemon.getTypeTwo(), pokemon.getTotal(), pokemon.getHp(), pokemon.getSpAttack(),
            pokemon.getDefense(), pokemon.getSpAttack(), pokemon.getSpDefense(), pokemon.getSpeed(),
            pokemon.getGeneration(), pokemon.getLegendary());
            listPokemonSpecific.add(pokemonAttack); 
        }

        return listPokemonSpecific;
    }

    public LinkedList<NameInverse> convertNameInverse(LinkedList<Pokemon> list){
        LinkedList<NameInverse> listPokemonSpecific = new LinkedList<>();
        
        NameInverse pokemonAttack;
        
        for(Pokemon pokemon: list){
            pokemonAttack = new NameInverse(pokemon.getNumber(), pokemon.getName(), pokemon.getTypeOne(), 
            pokemon.getTypeTwo(), pokemon.getTotal(), pokemon.getHp(), pokemon.getSpAttack(),
            pokemon.getDefense(), pokemon.getSpAttack(), pokemon.getSpDefense(), pokemon.getSpeed(),
            pokemon.getGeneration(), pokemon.getLegendary());
            listPokemonSpecific.add(pokemonAttack); 
        }

        return listPokemonSpecific;
    }
}
