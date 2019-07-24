package ru.yandex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main (String [] args) {
        String[] data1 = new String[] {"1","2","3","4"};
        //List<String> data2 = new ArrayList<String>();
        //data2.add("5");
        //data2.add("6");
        List<String> data2 = Arrays.asList("5", "6", "7");
        HelloOtus.joinFunc(data1);
        HelloOtus.joinFunc(data2);
        //System.out.println(123);
    }
}

