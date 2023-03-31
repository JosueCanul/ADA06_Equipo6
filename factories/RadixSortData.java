package factories;

import algorithms.RadixSort;
import data.Converter;
import data.DataReader;
import model.comparators.*;

public class RadixSortData {
    private DataReader dataReader = new DataReader();
    private Converter converter = new Converter();

    public RadixSort<PokemonAttack> quickAttackList(){
        return new RadixSort<PokemonAttack>(converter.convertAttack(dataReader.getRecords()));
    }
    public RadixSort<AttackInverse> quickAttackInverse(){
        return new RadixSort<AttackInverse>(converter.convertAttackInverse(dataReader.getRecords()));
    }

    public RadixSort<PokemonName> quickNameList(){
        return new RadixSort<PokemonName>(converter.convertName(dataReader.getRecords()));
    }

    public RadixSort<NameInverse> quickNameInverseList(){
        return new RadixSort<NameInverse>(converter.convertNameInverse(dataReader.getRecords()));
    }

}
