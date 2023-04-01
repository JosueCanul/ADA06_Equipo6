package ADA06_Equipo6.algorithms;

import java.util.LinkedList;

import ADA06_Equipo6.model.Pokemon;

/**
 * Clase para el ordenamiento basada en el algoritmo "Quick Sort"
 * @author Josue Canul
 */
public class QuickSort <E>{
    private LinkedList<E> list; 
    private long startTime;
    private long endTime;
    private long finalTime;
    private long comparations;
    private long swaps;   
    private int size;

    private void setTime(){
        this.finalTime = this.endTime - this.startTime;
    }      

    public QuickSort(LinkedList<E> list)   {
      this.list = list;     
      this.startTime = 0;
      this.endTime = 0;
      this.comparations = 0;
      this.swaps = 0;
      this.size = list.size();
    }
    public int getSize(){
        return this.size;
    }


    void swap(int i, int j){
        E temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
    
    /** toma el ultimo elemento como pivote, 
    coloca el pivote en su posicion correcta del arreglo ordenado,
    coloca todos los valores mas pequeños (menores a los pivotes)
    a la izquierda del pivote y coloca todos los valores mas grandes 
    (mayores a los pivotes) a la derecha del pivote 
    @param low elemento menor
     * @param high elemento mayor
     * @param forma manera de ordenar
     * @see ADA06_Equipo6.ui.Block
    */
    private int partition(int low, int high, int forma){
        
        Pokemon pivot = (Pokemon) list.get(high);
        
        int i = (low - 1);
    
        for(int j = low; j <= high - 1; j++){
            
            Pokemon pokemon = (Pokemon) list.get(j);
            if (pokemon.compare(pivot,forma) == 1){
                this.comparations++;
                i++;
                swap(i, j);
                this.swaps++;
            }
        }
        swap(i + 1, high);
        this.swaps++;
        return (i + 1);
    }
    
    /** Función principal que implementa QuickSort
     *  @param low elemento menor
     * @param high elemento mayor
     * @param forma manera de ordenar
     * @see ADA06_Equipo6.ui.Block
     */
    public void recQSort(int low, int high, int forma){
        this.startTime = System.nanoTime();
        if (low < high){
            int pi = partition(low, high, forma);
            recQSort(low, pi - 1, forma);
            recQSort(pi + 1, high, forma);
        }
        this.endTime = System.nanoTime();
        setTime();
    }

    /** Devuelve la lista ya ordenada que se le paso como parametro */
    public LinkedList<E> geList(){
        return this.list;
    }

    /**
     * Imprime los atributos que el algoritmo 
     */

    @Override
    public String toString() {
        return "QuickSort [finalTime=" + finalTime + ", comparations=" + comparations + ", swaps=" + swaps + "]";
    }
    
}