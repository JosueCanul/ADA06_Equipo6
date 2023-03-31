package algorithms;

import java.util.LinkedList;

public class MergeSort<E extends Comparable<E>>{
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

   private void setTime(){
      this.finalTime = this.endTime - this.startTime;
   }
   public void mergeSort() {
      startTime = System.nanoTime();
      E[] workSpace = (E[]) new Comparable[nElems];
      recMergeSort(workSpace, 0, nElems-1);
      finalTime = System.nanoTime();
      setTime();
   }

   private void recMergeSort(E[] workSpace, int lowerBound, int upperBound){
      if(lowerBound == upperBound)            // if range is 1,
         return;                              // no use sorting
      else {                                    
         int mid = (lowerBound+upperBound) / 2; // find midpoint        
         recMergeSort(workSpace, lowerBound, mid); // sort low half
         recMergeSort(workSpace, mid+1, upperBound); // sort high half
         merge(workSpace, lowerBound, mid+1, upperBound); // merge them
      }  // end else
   }  // end recMergeSort()

   private void merge(E[] workSpace, int lowPtr, int highPtr, int upperBound) {
      int j = 0;                             // workspace index
      int lowerBound = lowPtr;
      int mid = highPtr-1;
      int n = upperBound-lowerBound+1;       // # of items

      while(lowPtr <= mid && highPtr <= upperBound)
         if(theArray.get(lowPtr).compareTo(theArray.get(highPtr)) == 1){
            workSpace[j++] = theArray.get(lowPtr++);
            this.swaps++;
            this.comparations++;
         }else{
            workSpace[j++] = theArray.get(highPtr++);
            this.swaps++;
            this.comparations++;
         }
            

      while(lowPtr <= mid){
         workSpace[j++] = theArray.get(lowPtr++);
         this.swaps++;
      }
         

      while(highPtr <= upperBound){
         workSpace[j++] = theArray.get(highPtr++);
         this.swaps++;
      }
         

      for(j=0; j<n; j++){
         theArray.set(lowerBound+j, workSpace[j]);
         this.swaps++;
      }
      
   }

   public LinkedList<E> getList(){
      return theArray;
   }

   @Override
   public String toString() {
      return "MergeSort [finalTime=" + finalTime + ", comparations=" + comparations + ", swaps=" + swaps + "]";
   }
   
}