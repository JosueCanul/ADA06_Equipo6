import algorithms.BinaryInsertionSort;
import algorithms.QuickSort;
import data.DataWrite;
import factories.BinaryInsertionSortData;
import factories.QuickSortData;

public class Block {
    
    public static void BinaryBlock(int forma){
        BinaryInsertionSortData bidata = new BinaryInsertionSortData();
        BinaryInsertionSort<?> binaryInsertionSort;
        DataWrite dataWrite = new DataWrite("resultado.csv");

        switch (forma) {
            case 1:
                binaryInsertionSort = bidata.BinaryAttackList();
                dataWrite.setDataCsv(binaryInsertionSort.binaryInsertionSort(), binaryInsertionSort.toString());
                break;
            case 2:
                binaryInsertionSort = bidata.BinaryAttackInverses();
                dataWrite.setDataCsv(binaryInsertionSort.binaryInsertionSort(), binaryInsertionSort.toString());
                break;
            case 3:
                binaryInsertionSort = bidata.BinaryPokemonName();
                dataWrite.setDataCsv(binaryInsertionSort.binaryInsertionSort(), binaryInsertionSort.toString());
                break;
            
            case 4:
                binaryInsertionSort = bidata.BinaryNameInverses();
                dataWrite.setDataCsv(binaryInsertionSort.binaryInsertionSort(), binaryInsertionSort.toString());
                break;
            default:
                break;
        }
    }

    public static void QuickBlock(int forma){
        QuickSortData quickdata =  new QuickSortData();
        QuickSort<?> quickSort;
        DataWrite dataWrite = new DataWrite("resultado.csv");

        switch (forma) {
            case 1:
                quickSort = quickdata.quickAttackList();
                quickSort.recQSort(0, quickSort.getSize()-1);
                dataWrite.setDataCsv(quickSort.geList(), quickSort.toString());
                break;
            case 2:
            quickSort = quickdata.quickAttackInverse();
            quickSort.recQSort(0, quickSort.getSize()-1);
            dataWrite.setDataCsv(quickSort.geList(), quickSort.toString());
                break;
            case 3:
            quickSort = quickdata.quickNameInverseList();
            quickSort.recQSort(0, quickSort.getSize()-1);
            dataWrite.setDataCsv(quickSort.geList(), quickSort.toString());
                break;
            
            case 4:
            quickSort = quickdata.quickNameList();
            quickSort.recQSort(0, quickSort.getSize()-1);
            dataWrite.setDataCsv(quickSort.geList(), quickSort.toString());
                break;
            default:
                break;
        }
    }

    
}
