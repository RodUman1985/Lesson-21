package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class CSVLogger implements Convertible {
    private String delimiter;
    private String filePath;
    public CSVLogger (String filePath){
        this.delimiter=";";
        this.filePath=filePath;
    }
   public CSVLogger (String filePath,String delimiter){
       this.delimiter=delimiter;
       this.filePath=filePath;
   }


    @Override
    public void convert(String[][] data) {
        try {
            FileWriter fw = new FileWriter(this.filePath);
            for (String []arr: data) {
                String s =String.join(this.delimiter,arr);
                fw.write(s+"\n");
                                            }
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

