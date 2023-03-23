package model;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class DataReader {

    private String direction = "cancer.csv";

    public DataReader(){
    }

    public boolean readFile(String path) {
        File file = new File(path);
        if(file.canRead() != false )
            this.direction = path;
        return file.canRead();
    }

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
    
    public LinkedList<CancerChernobyl>  getData(){
        Scanner dataRead = openFile();
        LinkedList<CancerChernobyl> listCancer = new LinkedList<>();
        while (dataRead.hasNextLine()) {
            String[] dataCsv = dataRead.nextLine().split(",");
            listCancer.add(new CancerChernobyl(
                Integer.valueOf(dataCsv[0]), dataCsv[1], dataCsv[2],
                dataCsv[3], Float.valueOf(dataCsv[4])
            ));
        }
        return listCancer;

        
    }

    
}
