package factories;

import algorithms.BinaryInsertionSort;
import data.Converter;
import data.DataReader;
import model.comparators.AttackInverse;
import model.comparators.NameInverse;
import model.comparators.PokemonAttack;
import model.comparators.PokemonName;


public class BinaryInsertionSortData {
    private DataReader dataReader = new DataReader();
    private Converter converter = new Converter();

    public BinaryInsertionSort<PokemonAttack> BinaryAttackList(){
        return new BinaryInsertionSort<>(converter.convertAttack(dataReader.getRecords()));
    }

    public BinaryInsertionSort<AttackInverse> BinaryAttackInverses(){
        return new BinaryInsertionSort<>(converter.convertAttackInverse(dataReader.getRecords()));
    }

    public BinaryInsertionSort<PokemonName> BinaryPokemonName(){
        return new BinaryInsertionSort<>(converter.convertName(dataReader.getRecords()));
    }

    public BinaryInsertionSort<NameInverse> BinaryNameInverses(){
        return new BinaryInsertionSort<>(converter.convertNameInverse(dataReader.getRecords()));
    }
}
