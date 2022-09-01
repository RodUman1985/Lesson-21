package com.company;

public class PrintSirvece {
    public <T extends Convertible> void convert(String[][]data, T type){
        type.convert(data);
    }
}
