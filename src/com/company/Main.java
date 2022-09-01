package com.company;

public class Main {

    public static void main(String[] args) {
	PrintSirvece ps = new PrintSirvece();
	String [] [] data={
            {"Hi"},
            {"Hi"," java"},
            {"Hi","Java","forever"}
    };
        ps.convert(data,new Logger());
        ps.convert(data,new FileLogger("1.txt"));
String [] [] data2 ={
        {"1","2","=A1+B1","=A2+B2+C2"},
        {"2","5", "17","72", "=СУММ (B1:B3)"},
                };
        ps.convert(data2,new CSVLogger("1.csv"));
    }
}
