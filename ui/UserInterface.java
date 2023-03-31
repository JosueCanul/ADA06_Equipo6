package ui;

import java.util.Scanner;
/**
 * Clase utilizada para las interfacez del usuario permitiendole el acceso a los distintos
 * algoritmos de ordenamiento.
 * @author Josue Canul y Hector Cosgalla
 */
public class UserInterface {
    /**
     * Metodo para iniciar la interfaz del usuario, este metodo
     * hace un llamado a la clase {@code Block} que sirve como
     * administradora para los algoritmos de ordenamientos.
     */
    public void start(){
        Scanner scanner = new Scanner(System.in);
        int algoritmo = 0;
        int forma;

        while (algoritmo != 5) {
            System.out.println("Escribe 1 2 3 4 para BinaryInsertSort, QuickSort, MergeSort, RadixSort respectivamente, o bien 5 para salir");
            System.out.println("Luego escribiras 1 o 2 para ordenar por ataque del más alto al más bajo o vicebersa repectivamente");
            System.out.println("O por sus nombres en orden alfabetico o vecebersa con 3 y 4 respectivamente");
            algoritmo = Integer.valueOf(scanner.nextInt());

            if (algoritmo > 0 && algoritmo < 5) {
                System.out.println("Escribe la forma de ordenar");
                forma = Integer.valueOf(scanner.nextInt());
                switch (algoritmo) {
                    case 1:
                        Block.BinaryBlock(forma);
                        break;
                    case 2:
                        Block.QuickBlock(forma);
                        break;
                    case 3:
                        Block.MergeBlock(forma);
                        break;
                    case 4:
                        Block.RadixBlock(forma);
                        break;
                }
            } else if(algoritmo == 5){
                break;
            } else{
                System.out.println("opción no encontrada");
            }
        }

        scanner.close();
    }
}
