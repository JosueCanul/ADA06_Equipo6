import algorithms.BinaryInsertionSort;
import algorithms.MergeSort;
import algorithms.QuickSort;
import algorithms.RadixSort;
import data.DataWrite;
import factories.BinaryInsertionSortData;
import factories.MergeSortData;
import factories.QuickSortData;
import factories.RadixSortData;

public class Block {
    
    public static void BinaryBlock(int forma){
        BinaryInsertionSortData bidata = new BinaryInsertionSortData();
        BinaryInsertionSort<?> binaryInsertionSort;
        DataWrite dataWrite = new DataWrite("resultados/BinaryInsertionSort_ordenado.csv");

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
        DataWrite dataWrite = new DataWrite("resultados/QuickSort_ordenado.csv");

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

    public static void RadixBlock(int forma){
        RadixSortData radixSortData = new RadixSortData();
        RadixSort<?> radixSort;
        DataWrite dataWrite = new DataWrite("resultados/RadixSort_ordenado.csv");
        switch (forma) {
            case 1:
                radixSort = radixSortData.quickAttackList();
                radixSort.sort();
                dataWrite.setDataCsv(radixSort.getList(), radixSort.toString());
                break;
            case 3:
            radixSort = radixSortData.quickNameInverseList();
            radixSort.sort();
            dataWrite.setDataCsv(radixSort.getList(), radixSort.toString());
            break;
            default:
                break;
        }
    }

    public static void MergeBlock(int forma){
        MergeSortData mergeSortData = new MergeSortData();
        MergeSort<?> mergeSort;
        DataWrite dataWrite = new DataWrite("resultados/MergeSort_ordenado.csv");

        switch (forma) {
            case 1:
                mergeSort = mergeSortData.mergeAttackList();
                mergeSort.mergeSort();
                dataWrite.setDataCsv(mergeSort.getList(), mergeSort.toString());
                break;
            case 2:
            mergeSort = mergeSortData.mergeAttackInverses();
            mergeSort.mergeSort();
            dataWrite.setDataCsv(mergeSort.getList(), mergeSort.toString());
            break;
            case 3:
            mergeSort = mergeSortData.mergePokemonName();
            mergeSort.mergeSort();
            dataWrite.setDataCsv(mergeSort.getList(), mergeSort.toString());
            break;
            
            case 4:
            mergeSort = mergeSortData.mergeNameInverses();
            mergeSort.mergeSort();
            dataWrite.setDataCsv(mergeSort.getList(), mergeSort.toString());
            break;
            default:
                break;
        }
    }

    
}
