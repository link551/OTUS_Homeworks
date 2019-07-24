package ru.yandex;

import com.google.common.base.Joiner;

import java.util.List;

class HelloOtus {
    static String joinFunc(String[] data) {
        return Joiner.on(", ").skipNulls().join(data);
    }

    static String joinFunc(List<String> data) {
        return Joiner.on(", ").skipNulls().join(data);
    }


}