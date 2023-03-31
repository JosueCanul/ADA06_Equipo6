package algorithms;

import java.util.LinkedList;

import model.Pokemon;

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
      this.list = list;      // create array
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
    
    /* toma el ultimo elemento como pivote, 
    coloca el pivote en su posicion correcta del arreglo ordenado,
    coloca todos los valores mas pequeños (menores a los pivotes)
    a la izquierda del pivote y coloca todos los valores mas grandes 
    (mayores a los pivotes) a la derecha del pivote 
    */
    int partition(int low, int high, int forma){
        
        Pokemon pivot = (Pokemon) list.get(high);
        
        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);
    
        for(int j = low; j <= high - 1; j++){
            // If current element is smaller
            // than the pivot
            Pokemon pokemon = (Pokemon) list.get(j);
            if (pokemon.compare(pivot,forma) == 1){
                this.comparations++;
                // Increment index of
                // smaller element
                i++;
                swap(i, j);
                this.swaps++;
            }
        }
        swap(i + 1, high);
        this.swaps++;
        return (i + 1);
    }
    
    /* The main function that implements QuickSort
            arr[] --> Array to be sorted,
            low --> Starting index,
            high --> Ending index
    */
    //Primera vuelta va a ser 0 y list.sice
    public void recQSort(int low, int high, int forma){
        this.startTime = System.nanoTime();
        if (low < high){
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(low, high, forma);
    
            // Separately sort elements before
            // partition and after partition
            recQSort(low, pi - 1, forma);
            recQSort(pi + 1, high, forma);
        }
        this.endTime = System.nanoTime();
        setTime();
    }

    public LinkedList<E> geList(){
        return this.list;
    }

    @Override
    public String toString() {
        return "QuickSort [finalTime=" + finalTime + ", comparations=" + comparations + ", swaps=" + swaps + "]";
    }
    
}