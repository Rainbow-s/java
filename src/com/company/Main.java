package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(ft.format(date));
        forFn();
    }

    public  static void forFn(){
        int i=10;
        do{
            System.out.println(i);
            i--;

        }
        while (i>=0);
    }

}
