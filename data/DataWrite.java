package data;
import java.io.File;
import java.io.PrintWriter;
import java.util.LinkedList;

public class DataWrite {

    private String direction;


    public DataWrite(String direction){
        this.direction = direction;
    }


    public <E extends Comparable<E>> void setDataCsv(LinkedList<E> items, String datos){
        try (PrintWriter printWriter = new PrintWriter(new File(direction))){
            printWriter.append(datos + "\n");
            printWriter.append("#,Name,Type_1,Type 2,Total,HP,Attack,Defense,Sp.Atk,Sp.Def,Speed,Generation,Legendary");
            
            for(E item: items){
                printWriter.append(item.toString() + "\n");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }



}