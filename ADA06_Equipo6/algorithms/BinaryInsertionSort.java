package ADA06_Equipo6.algorithms;

import java.util.LinkedList;

import ADA06_Equipo6.model.Pokemon;
/**
 * Clase para el ordenamiento basada en el algoritmo "Binary Insertion"
 * @author Josue Canul
 */
public class BinaryInsertionSort<E> {

    private LinkedList<E> list;
    private long startTime;
    private long endTime;
    private long finalTime;
    private long comparations;
    private long swaps;
     
    /**
     * Metodo por el cual se calcula el tiempo total de la ejecución del algoritmo 
     */
    private void setTime(){
        this.finalTime = this.endTime - this.startTime;
    }

    public BinaryInsertionSort(LinkedList<E> list) {
            this.list = list;
            this.startTime = 0;
            this.endTime = 0;
            this.swaps = 0;
            this.comparations = 0;
    }

    /**
     * este método busca la posición  en la cual el valor a poner se insertara a la lista
     * @param item Objeto recibido de forma generica
     * @param low Posicion mas baja
     * @param high Posicion mas alta
     * @param forma La manera en la que se va a ordenar
     * @return posicion en la que se debe insertar en la lista
     * @see ADA06_Equipo6.ui.Block
     */
    private int binarySearch(E item, int low, int high, int forma){
        Pokemon pokemon = (Pokemon) item;
        this.startTime = System.nanoTime();
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (pokemon.compare((Pokemon)list.get(mid), forma) == 0){
                this.comparations++;
                return mid + 1;
            }else if (pokemon.compare((Pokemon)list.get(mid), forma) == 1){
                low = mid + 1;
                this.comparations++;
            }else{
                high = mid - 1;
                this.comparations++;
            }

        }
        this.endTime = System.nanoTime();
        setTime();
        return low;
    }

    /**
     *  Implementación del algoritmo binarysort devuelve la lista ya ordenada que se la pasa como parametro
     * @param forma parametro para referirse a la manera de ordenar
     * @return Lista ordenada
     */
    public LinkedList<E> binaryInsertionSort(int forma) {
        int length = list.size();
        int i, loc, j;
        E selected;
    
        for (i = 1; i < length; ++i) {
            j = i - 1;
            selected = list.get(i);
    
            // encuentra la posicion donde debe ser insertado el elemento
            loc = binarySearch(selected, 0, j, forma);
            while (j >= loc) {
                list.set(j+1, list.get(j));
                this.swaps++;
                j--;
            }
            list.set(j+1, selected);
            this.swaps++;
        }

        return this.list;
    }

    /**
     * Imprime los valores de cada elemento de la lista por medio del toString
     */
    public void printArray() {
        for(E e: list){
            System.out.println(e.toString());
        }
    }

    /**
     * Imprime los atributos que el algoritmo tiene
     */
    @Override
    public String toString() {
        return "BinaryInsertionSort [finalTime=" + finalTime + ", comparations=" + comparations + ", swaps=" + swaps
                + "]";
    }

    
}