package factories;

import algorithms.QuickSort;
import data.Converter;
import data.DataReader;
import model.comparators.AttackInverse;
import model.comparators.NameInverse;
import model.comparators.PokemonAttack;
import model.comparators.PokemonName;

public class QuickSortData {
    private DataReader dataReader = new DataReader();
    private Converter converter = new Converter();

    public QuickSort<PokemonAttack> quickAttackList(){
        return new QuickSort<PokemonAttack>(converter.convertAttack(dataReader.getRecords()));
    }
    public QuickSort<AttackInverse> quickAttackInverse(){
        return new QuickSort<AttackInverse>(converter.convertAttackInverse(dataReader.getRecords()));
    }


    public QuickSort<PokemonName> quickNameList(){
        return new QuickSort<PokemonName>(converter.convertName(dataReader.getRecords()));
    }

    public QuickSort<NameInverse> quickNameInverseList(){
        return new QuickSort<NameInverse>(converter.convertNameInverse(dataReader.getRecords()));
    }


}
