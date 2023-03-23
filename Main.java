import java.util.LinkedList;
import java.util.prefs.BackingStoreException;

import algorithms.BinaryInsertionSort;
import model.CancerChernobyl;
import model.DataReader;

public class Main{
    public static void main(String[] args) {
        DataReader dataReader = new DataReader();
        LinkedList<CancerChernobyl> list = dataReader.getData();

        for(CancerChernobyl cancerChernobyl: list){
            System.out.println(cancerChernobyl.toString());
        }

        System.out.println();

        BinaryInsertionSort binaryInsertionSort = new BinaryInsertionSort(list);
        list = binaryInsertionSort.binaryInsertionSort();
        for(CancerChernobyl cancerChernobyl: list){
            System.out.println(cancerChernobyl.toString());
        }
    }
}