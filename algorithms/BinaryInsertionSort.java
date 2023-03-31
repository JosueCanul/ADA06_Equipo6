package algorithms;

import java.util.LinkedList;

import model.Pokemon;

public class BinaryInsertionSort<E> {

    private LinkedList<E> list;
    private long startTime;
    private long endTime;
    private long finalTime;
    private long comparations;
    private long swaps;
     
    //Metodo por el cual se calcula el tiempo total de la ejecución del algoritmo 
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

    //  este método busca la posición  en la cual el valor a poner se insertara a la lista
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

    /*
     * Implementación del algoritmo binarysort devuelve la lista ya ordenada que se la pasa como parametro
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
    
            // Hace un corrimiento a la derecha de los datos
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

    //Imprime los valores de cada elemento de la lista por medio del toString
    public void printArray() {
        for(E e: list){
            System.out.println(e.toString());
        }
    }

      /*
     * Imprime los atributos que el algoritmo 
     */

    @Override
    public String toString() {
        return "BinaryInsertionSort [finalTime=" + finalTime + ", comparations=" + comparations + ", swaps=" + swaps
                + "]";
    }

    
}