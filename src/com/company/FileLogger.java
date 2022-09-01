package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Convertible {
    private String filePath;
public FileLogger (String filePath) {
    this.filePath=filePath;
}

    @Override
    public void convert(String[][] data) {
        try {
            FileWriter fw = new FileWriter(this.filePath);
            for (String []arr: data) {
                for (String str: arr) {
                    fw.write(str+"\t");
                }
                fw.write("\n");
            }
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
