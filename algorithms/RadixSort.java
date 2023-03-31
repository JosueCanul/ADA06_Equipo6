// Radix sort Java implementation
package algorithms;

import java.util.*;

import model.Pokemon;
import model.PokemonInterfaceRadix;

public class RadixSort <E extends PokemonInterfaceRadix>{
    private LinkedList<E> theArray;          // ref to array theArray
    private int nElems;               // number of data items
	private long startTime;
    private long endTime;
    private long finalTime;
    private long comparations;
    private long swaps;
    //-----------------------------------------------------------
    public RadixSort(LinkedList<E> list)   {
        theArray = list;      // create array
        nElems = theArray.size();
		this.startTime = 0;
        this.endTime = 0;
        this.swaps = 0;
        this.comparations = 0;
    }
    
    //-----------------------------------------------------------
	private void setTime(){
        this.finalTime = this.endTime - this.startTime;
    }
	// A utility function to get maximum value in arr[]
	private E getMax(int forma){
		E mx = this.theArray.get(0);
		
		for (int i = 1; i < nElems; i++){
			Pokemon pokemon = (Pokemon) this.theArray.get(i);

			if (pokemon.compare((Pokemon) mx, forma) == -1){
				mx = this.theArray.get(i);
				this.comparations++;
			}

		}		
		return mx;
	}
	//----------------------------Hecho

	// A function to do counting sort of arr[] according to
	// the digit represented by exp.
	public void countSort(LinkedList<E> list, int exp, int forma){
		LinkedList<E> output = new LinkedList<>(list); // output array
		int i;
		long[] count = new long[10];
		Arrays.fill(count, 0);

		// Store count of occurrences in count[]
		for (i = 0; i < nElems; i++)
			count[(int) ((theArray.get(i).getValueForRadix(forma) / exp) % 10)]++;

		// Change count[i] so that count[i] now contains
		// actual position of this digit in output[]
		for (i = 1; i < 10; i++)
			count[i] += count[i - 1];

		// Build the output array
		for (i = nElems - 1; i >= 0; i--) {
			
			//output[(int) (count[(int) ((theArray.get(i).getValueForRadix() / exp) % 10)] - 1)] = theArray[i];
			output.set((int) (count[(int) ((theArray.get(i).getValueForRadix(forma) / exp) % 10)] - 1), theArray.get(i));
			this.swaps++;
			count[(int) ((theArray.get(i).getValueForRadix(forma) / exp) % 10)]--;
		}

		// Copy the output array to arr[], so that arr[] now
		// contains sorted numbers according to current digit
		theArray.clear();
        theArray.addAll(output);
		
	}

	// The main function to that sorts arr[] of size n using
	// Radix Sort
	public void sort(int forma){
		startTime = System.nanoTime();
		// Find the maximum number to know number of digits
		E m = getMax(forma);

		// Do counting sort for every digit. Note that
		// instead of passing digit number, exp is passed.
		// exp is 10^i where i is current digit number
		for (int exp = 1; m.getValueForRadix(forma) / exp > 0; exp *= 10){
			countSort(this.theArray, exp, forma);
		}
		finalTime = System.nanoTime();
		setTime();
	}

	public LinkedList<E> getList(){
		return theArray;
	}

	@Override
	public String toString() {
		return "RadixSort [finalTime=" + finalTime + ", comparations=" + comparations + ", swaps=" + swaps + "]";
	}

	
}
/* This code is contributed by Devesh Agrawal */

