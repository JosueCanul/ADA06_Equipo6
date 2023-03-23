package algorithms;

import java.util.LinkedList;

import model.CancerChernobyl;

public class BinaryInsertionSort {

    private LinkedList<CancerChernobyl> listCancer;
    
    public BinaryInsertionSort(LinkedList<CancerChernobyl> list){
        this.listCancer = list;
    }
//  implementacion iterativa 
    private int binarySearch(LinkedList<CancerChernobyl> list, CancerChernobyl item, int low, int high){
        while (low <= high) {
            int mid = low + (high - low) / 2;
            CancerChernobyl comparableData = list.get(mid);
            
            if (item.getYear() == comparableData.getYear()){
                return mid + 1;
            }else if (item.getYear() < comparableData.getYear()){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
                
        }
        return low;
    }

    public LinkedList<CancerChernobyl> binaryInsertionSort() {
        //Cantidad de elementos de la lista
        int n = this.listCancer.size();

        CancerChernobyl selected;
        
        int i, loc, j;
    
        for (i = 1; i < n; ++i) {
            j = i - 1;
            selected = this.listCancer.get(i);
    
            // encuentra la posicion donde debe ser insertado el elemento
            loc = binarySearch(this.listCancer, selected, 0, j);
    
            // Hace un corrimiento a la derecha de los datos
            while (j >= loc) {
                this.listCancer.set(j+1, this.listCancer.get(j));
                j--;
            }
            this.listCancer.set(j+1, selected);
            //a[j + 1] = selected;
        }

        return this.listCancer;
    }

    public void printArray() {
        for(CancerChernobyl cancerChernobyl: this.listCancer){
            System.out.println(cancerChernobyl.toString());
        }
    }
}