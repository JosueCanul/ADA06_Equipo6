package ADA06_Equipo6.data;
import java.io.File;
import java.io.PrintWriter;
import java.util.LinkedList;

/**
 * Clase utilizada para imprimir los datos en archivos 
 * {@code .csv} con la finalidad de ser consultados mas 
 * adelante
 * @author Josue Canul
 */
public class DataWrite {

    private String direction;

    /**
     * 
     * @param direction direccion del archivo donde se va a escribir
     */
    public DataWrite(String direction){
        this.direction = direction;
    }

    /**
     * Metodo para la escritura del archivo
     * @param <E> Objeto generico
     * @param items Lista Ligada de objetos genericos con los datos
     * a escribir en el carchivo
     * @param datos String donde se encuentran los datos de ejecucion
     * del algoritmo
     * @see ADA06_Equipo6.model.Pokemon#compare(ADA06_Equipo6.model.Pokemon, int)
     * @see ADA06_Equipo6.ui.Block
     */
    public <E> void setDataCsv(LinkedList<E> items, String datos){
        try (PrintWriter printWriter = new PrintWriter(new File(direction))){
            printWriter.append(datos + "\n");
            printWriter.append("#,Name,Type_1,Type 2,Total,HP,Attack,Defense,Sp.Atk,Sp.Def,Speed,Generation,Legendary\n");
            
            for(E item: items){
                printWriter.append(item.toString() + "\n");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }



}