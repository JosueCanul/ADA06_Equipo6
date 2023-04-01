// Radix sort Java implementation
package ADA06_Equipo6.algorithms;

import java.util.*;

import ADA06_Equipo6.model.Pokemon;
import ADA06_Equipo6.model.PokemonInterfaceRadix;

/**
 * Clase para el ordenamiento basada en el algoritmo "Radix Sort"
 * @author Josue Canul y Devesh Agrawal
 */
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
	// Función que devuelve el valor maximo de la lista enlazada
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

	/**
	 *Este metodo toma como parametros una lista enlazada, un valor exp y un int forma 
	 para poder obtener el digito de correspondiente a la posición de exp, esto se logra
	 realizando un recuento de ocurrencias, utilizando la matríz count para determinar la pocisión de cada
	 elemento, posteriormente se recorre el array count de manera inversa para obtener 
	 la pocisión correcta de cada elemento, este agrega cada elemento a la lsita output. Por ultimo se remplaza la 
	 lista original con la output.
	  @param list lista a ordenar
	 * @param exp Exponente calculado en el metodo {@code sort}
	 * @param forma manera de ordenamiento
	 * @see ADA06_Equipo6.ui.Block
	*/
	public void countSort(LinkedList<E> list, int exp, int forma){
		LinkedList<E> output = new LinkedList<>(list);
		int i;
		long[] count = new long[10];
		Arrays.fill(count, 0);

		for (i = 0; i < nElems; i++)
			count[(int) ((theArray.get(i).getValueForRadix(forma) / exp) % 10)]++;

		for (i = 1; i < 10; i++)
			count[i] += count[i - 1];

		for (i = nElems - 1; i >= 0; i--) {
			
			output.set((int) (count[(int) ((theArray.get(i).getValueForRadix(forma) / exp) % 10)] - 1), theArray.get(i));
			this.swaps++;
			count[(int) ((theArray.get(i).getValueForRadix(forma) / exp) % 10)]--;
		}

		theArray.clear();
        theArray.addAll(output);
		
	}

	/**
	 * Implementación del metodo de ordenamiento de RadixSort
	 * @param forma manera de ordenar
	 * @see ADA06_Equipo6.ui.Block
	 */
	public void sort(int forma){
		startTime = System.nanoTime();

		E m = getMax(forma);

		for (int exp = 1; m.getValueForRadix(forma) / exp > 0; exp *= 10){
			countSort(this.theArray, exp, forma);
		}
		finalTime = System.nanoTime();
		setTime();
	}

	/**
    * Retorna la lista ordenada
    */
	public LinkedList<E> getList(){
		return theArray;
	}

	  /**
     * Imprime los atributos que el algoritmo 
     */
	@Override
	public String toString() {
		return "RadixSort [finalTime=" + finalTime + ", comparations=" + comparations + ", swaps=" + swaps + "]";
	}

	
}

