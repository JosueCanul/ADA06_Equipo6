package ui;
import algorithms.BinaryInsertionSort;
import algorithms.MergeSort;
import algorithms.QuickSort;
import algorithms.RadixSort;
import data.DataReader;
import data.DataWrite;

/**
 * Clase para la administracion de los distintos algoritmos de ordenamiento.
 * Esta clase sirve como "launcher" a los determinados algoritmos a traves
 * de metodos estaticos.
 * @author Josue Canul y Hector Cosgalla 
 */
public class Block {
    private static DataReader dataReader = new DataReader();
    
    /**
     * Metodo para lanzar el algoritmo de ordenamiento "Binary Insertion" para ordenar la tabla de 
     * pokemones segun su poder de ataque o su nombre.
     * @param forma Es la forma en la que se van a ordenar los datos
     * si es basados en el ataque, seria {@code 1} para ordenarlos de mayor a menor
     * y {@code 2} si es para ordenarlos de menor a mayor, si se desea ordenar por nombre
     * es {@code 3} y {@code 4} para ordenarlos alfabeticamente o al reves respectivamente.
     * @return  apesar de no tener un return formal, hace un llamado a la clase {@code DataWrite}
     * para imprimir el archivo ya ordenado.
     */
    public static void BinaryBlock(int forma){
        BinaryInsertionSort<?> binaryInsertionSort = new BinaryInsertionSort<>(dataReader.getRecords());
        DataWrite dataWrite = new DataWrite("files/resultados/BinaryInsertionSort_ordenado.csv");

        dataWrite.setDataCsv(binaryInsertionSort.binaryInsertionSort(forma), binaryInsertionSort.toString());
    }

    /**
     * Metodo para lanzar el algoritmo de ordenamiento "Quick Sort" para ordenar la tabla de 
     * pokemones segun su poder de ataque o su nombre.
     * @param forma Es la forma en la que se van a ordenar los datos
     * si es basados en el ataque, seria {@code 1} para ordenarlos de mayor a menor
     * y {@code 2} si es para ordenarlos de menor a mayor, si se desea ordenar por nombre
     * es {@code 3} y {@code 4} para ordenarlos alfabeticamente o al reves respectivamente.
     * @return  apesar de no tener un return formal, hace un llamado a la clase {@code DataWrite}
     * para imprimir el archivo ya ordenado.
     */
    public static void QuickBlock(int forma){
        QuickSort<?> quickSort = new QuickSort<>(dataReader.getRecords());
        DataWrite dataWrite = new DataWrite("files/resultados/QuickSort_ordenado.csv");

        quickSort.recQSort(0, quickSort.getSize()-1, forma);
        dataWrite.setDataCsv(quickSort.geList(), quickSort.toString());
    }

    /**
     * Metodo para lanzar el algoritmo de ordenamiento "Radix Sort" para ordenar la tabla de 
     * pokemones segun su poder de ataque o su nombre.
     * @param forma Es la forma en la que se van a ordenar los datos
     * si es basados en el ataque, seria {@code 1} para ordenarlos de mayor a menor
     * y {@code 2} si es para ordenarlos de menor a mayor, si se desea ordenar por nombre
     * es {@code 3} y {@code 4} para ordenarlos alfabeticamente o al reves respectivamente.
     * @return  apesar de no tener un return formal, hace un llamado a la clase {@code DataWrite}
     * para imprimir el archivo ya ordenado.
     */
    public static void RadixBlock(int forma){
        RadixSort<?> radixSort = new RadixSort<>(dataReader.getRecords());
        DataWrite dataWrite = new DataWrite("files/resultados/RadixSort_ordenado.csv");
        radixSort.sort(forma);
        dataWrite.setDataCsv(radixSort.getList(), radixSort.toString());
    }

    /**
     * Metodo para lanzar el algoritmo de ordenamiento "Merge Sort" para ordenar la tabla de 
     * pokemones segun su poder de ataque o su nombre.
     * @param forma Es la forma en la que se van a ordenar los datos
     * si es basados en el ataque, seria {@code 2} para ordenarlos de mayor a menor
     * y {@code 1} si es para ordenarlos de menor a mayor, si se desea ordenar por nombre
     * es {@code 3} y {@code 4} para ordenarlos alfabeticamente o al reves respectivamente.
     * @return  apesar de no tener un return formal, hace un llamado a la clase {@code DataWrite}
     * para imprimir el archivo ya ordenado.
     */
    public static void MergeBlock(int forma){
        MergeSort<?> mergeSort = new MergeSort<>(dataReader.getRecords());
        DataWrite dataWrite = new DataWrite("files/resultados/MergeSort_ordenado.csv");
        mergeSort.mergeSort(forma);
        dataWrite.setDataCsv(mergeSort.getList(), mergeSort.toString());
    }

    
}
