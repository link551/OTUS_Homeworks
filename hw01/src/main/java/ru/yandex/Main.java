package ru.yandex;

import java.util.Arrays;
import java.util.List;

class Main {
    public static void main (String [] args) {
        String[] data1 = new String[] {"1","2","3","4"};
        List<String> data2 = Arrays.asList("5", "6", "7");
        String test1 = HelloOtus.joinFunc(data1);
        String test2 = HelloOtus.joinFunc(data2);
        System.out.println(test1);
        System.out.println(test2);
    }
}