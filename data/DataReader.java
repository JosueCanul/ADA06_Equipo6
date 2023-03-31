package data;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

import model.Pokemon;


public class DataReader {

    private String direction = "files/csvs/pokemon.csv";

    private boolean readFile(String path) {
        File file = new File(path);
        if(file.canRead() != false )
            this.direction = path;
        return file.canRead();
    }
    /**
     * Habré el archivo csv siendo que maneja la exepción del que no se pueda abrir,
     * solo se utiliza para el metodo getRecords
     * @return
     */
    
    private Scanner openFile(){
        Scanner scanner = null;

        if (readFile(direction) != false){
            try {
                scanner = new Scanner(new File(direction));
            }catch (Exception e){
                System.out.println(e);
            }

        }
        return scanner;
    }
    /***
     * En este metodo se recuperan los datos del csv mediante un scanner
     * @return LinkedList de los datos del csv
    */
    public LinkedList<Pokemon> getRecords(){
        
        

        Scanner scannerCycleDimensions = openFile();
        
        LinkedList<Pokemon> listPokemons = new LinkedList<>();

        while(scannerCycleDimensions.hasNext()){
            String[] data = scannerCycleDimensions.nextLine().split(",");

            Pokemon pokemon = new Pokemon(Integer.valueOf(data[0]), data[1], data[2], data[3],
            Integer.valueOf(data[4]), Integer.valueOf(data[5]), Integer.valueOf(data[6]),
            Integer.valueOf(data[7]), Integer.valueOf(data[8]), Integer.valueOf(data[9]), 
            Integer.valueOf(data[10]), Integer.valueOf(data[11]), Boolean.valueOf(data[12]));

            listPokemons.add(pokemon);
        }
        scannerCycleDimensions.close();
        
        return listPokemons;
    }
    
    
}
