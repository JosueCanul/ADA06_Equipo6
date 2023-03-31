package factories;

import algorithms.MergeSort;
import data.Converter;
import data.DataReader;
import model.comparators.AttackInverse;
import model.comparators.NameInverse;
import model.comparators.PokemonAttack;
import model.comparators.PokemonName;

public class MergeSortData {
    private DataReader dataReader = new DataReader();
    private Converter converter = new Converter();

    public MergeSort<PokemonAttack> mergeAttackList(){
        return new MergeSort<>(converter.convertAttack(dataReader.getRecords()));
    }

    public MergeSort<AttackInverse> mergeAttackInverses(){
        return new MergeSort<>(converter.convertAttackInverse(dataReader.getRecords()));
    }

    public MergeSort<PokemonName> mergePokemonName(){
        return new MergeSort<>(converter.convertName(dataReader.getRecords()));
    }

    public MergeSort<NameInverse> mergeNameInverses(){
        return new MergeSort<>(converter.convertNameInverse(dataReader.getRecords()));
    }
    
}
