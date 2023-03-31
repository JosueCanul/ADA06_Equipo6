package algorithms;

import java.lang.reflect.Array;
import java.util.LinkedList;

import model.Pokemon;

public class MergeSort<E>{
   private LinkedList<E> theArray;          // ref to array theArray
   private int nElems;               // number of data items

   private long startTime;
   private long endTime;
   private long finalTime;
   private long comparations;
   private long swaps;

   public MergeSort(LinkedList<E> list)   {
      theArray = list;      // create array
      nElems = this.theArray.size();
      this.startTime = 0;
      this.endTime = 0;
      this.swaps = 0;
      this.comparations = 0;
   }

   /*
    * Metodo que establece el tiempo final que le tomo al algoritmo ordenar la lista enlazada
    */
   private void setTime(){
      this.finalTime = this.endTime - this.startTime;
   }

   /*
    * Metodo que implementa el ordenamiento MergeSort
    */
   public void mergeSort(int forma) {
      startTime = System.nanoTime();
      Pokemon[] workSpace = new Pokemon[nElems];
      recMergeSort(workSpace, 0, nElems-1, forma);
      finalTime = System.nanoTime();
      setTime();
   }

   /*
    * Implementa de manera recursiva el ordenamiento merge, cortando el arreglo a la mitad y 
    llamandose de manera recursiva, fucionandolas en el proceso.
    */
   private void recMergeSort(Pokemon[] workSpace, int lowerBound, int upperBound, int forma){
      if(lowerBound == upperBound)            // if range is 1,
         return;                              // no use sorting
      else {                                    
         int mid = (lowerBound+upperBound) / 2; // find midpoint        
         recMergeSort(workSpace, lowerBound, mid, forma); // sort low half
         recMergeSort(workSpace, mid+1, upperBound, forma); // sort high half
         merge(workSpace, lowerBound, mid+1, upperBound, forma); // merge them
      }  // end else
   }  // end recMergeSort()

   /*
    * Este metodo compara dos subarreglos que anteriormente han sido ordenados
    coiandose sus elementos a un arreglo temporal, posteriormente copia los elementos del arreglo temparal
    al arreglo original. 
    */
   private void merge(Pokemon[] workSpace, int lowPtr, int highPtr, int upperBound, int forma) {
      int j = 0;                             // workspace index
      int lowerBound = lowPtr;
      int mid = highPtr-1;
      int n = upperBound-lowerBound+1;       // # of items

      while(lowPtr <= mid && highPtr <= upperBound){
         Pokemon pokemon = (Pokemon) theArray.get(lowPtr);
         if(pokemon.compare((Pokemon)theArray.get(highPtr), forma) == 1){
            workSpace[j++] = (Pokemon) theArray.get(lowPtr++);
            this.swaps++;
            this.comparations++;
         }else{
            workSpace[j++] = (Pokemon) theArray.get(highPtr++);
            this.swaps++;
            this.comparations++;
         }
            
      }
      while(lowPtr <= mid){
         workSpace[j++] = (Pokemon) theArray.get(lowPtr++);
         this.swaps++;
      }
         

      while(highPtr <= upperBound){
         workSpace[j++] = (Pokemon) theArray.get(highPtr++);
         this.swaps++;
      }
         

      for(j=0; j<n; j++){
         theArray.set(lowerBound+j, (E) workSpace[j]);
         this.swaps++;
      }
      
   }

   /*
    * Retorna la lista ordenada
    */
   public LinkedList<E> getList(){
      return theArray;
   }
     /*
     * Imprime los atributos que el algoritmo 
     */


   @Override
   public String toString() {
      return "MergeSort [finalTime=" + finalTime + ", comparations=" + comparations + ", swaps=" + swaps + "]";
   }
   
}