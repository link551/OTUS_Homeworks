package ru.yandex;

import com.google.common.base.Joiner;

import java.util.List;

class HelloOtus {
    static void joinFunc(String[] data) {
        System.out.println(Joiner.on(", ").skipNulls().join(data));
//        for (String i : data) {
//            System.out.println(i);
//        }
    }

    static void joinFunc(List<String> data) {
        System.out.println(Joiner.on(", ").skipNulls().join(data));
    }

}