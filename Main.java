import java.util.Scanner;

import algorithms.BinaryInsertionSort;
import factories.BinaryInsertionSortData;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int algoritmo;
        int forma;
        while (true) {
            System.out.println("Escribe 1 2 3 4 para BinaryInsertSort, QuickSort, MergeSort, RadixSort respectivamente");
            System.out.println("Luego escribiras 1 o 2 para ordenar por ataque del más alto al más bajo o vicebersa repectivamente");
            System.out.println("O por sus nombres en orden alfabetico o vecebersa con 3 y 4 respectivamente");
            algoritmo = Integer.valueOf(scanner.nextInt());

            System.out.println("Escribe la forma de ordenar");
            if(algoritmo == 1){
                forma = Integer.valueOf(scanner.nextInt());
                Block.BinaryBlock(forma);
            }else if(algoritmo == 2){
                forma = Integer.valueOf(scanner.nextInt());
                Block.QuickBlock(forma);
            }else if(algoritmo == 3){
                forma = Integer.valueOf(scanner.nextInt());
                Block.MergeBlock(forma);
            }else if(algoritmo == 4){
                forma = Integer.valueOf(scanner.nextInt());
                Block.RadixBlock(forma);
            }else{
                System.out.println("opción no encontrada");
            }
        }
    }

    
    public static void QuickSortBlock(){

    }
}
