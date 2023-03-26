package algorithms;

import java.util.LinkedList;

public class BinaryInsertionSort<E extends Comparable<E>> {
 
//  implementacion iterativa 
    public int binarySearch(LinkedList<E> list, E item, int low, int high){
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (item.compareTo(list.get(mid)) == 0)
                return mid + 1;
            else if (item.compareTo(list.get(mid)) == -1)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }

    public void binaryInsertionSort(LinkedList<E> list, int length) {
        int i, loc, j;
        E selected;
    
        for (i = 1; i < length; ++i) {
            j = i - 1;
            selected = list.get(i);
    
            // encuentra la posicion donde debe ser insertado el elemento
            loc = binarySearch(list, selected, 0, j);
    
            // Hace un corrimiento a la derecha de los datos
            while (j >= loc) {
                list.set(j+1, list.get(j));
                j--;
            }
            list.set(j+1, selected);
        }
    }

    public void printArray(LinkedList<E> list) {
        for(E e: list){
            System.out.println(e.toString());
        }
    }
}