package ru.yandex;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class HelloOtusTest {

    @Test
    public void joinFuncConstructor1() {
        String[] data1 = new String[] {"1","2","3","4"};
        String test1 = HelloOtus.joinFunc(data1);

        Assert.assertEquals(test1, "1, 2, 3, 4");
    }

    @Test
    public void joinFuncConstructor2() {
        List<String> data2 = Arrays.asList("5", "6", "7");
        String test2 = HelloOtus.joinFunc(data2);
        Assert.assertEquals(test2, "5, 6, 7");
    }
}