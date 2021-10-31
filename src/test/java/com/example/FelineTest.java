package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class FelineTest {

    @Test
    public void eatMeatReturnFelineRation() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, food);
    }

    @Test
    public void getFamilyReturnFelineFamily() {
     Feline feline = new Feline();
     String actual =  feline.getFamily();
     Assert.assertEquals("Кошачьи", actual);
    }

    @Test
    public void getKittensReturn1() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        Assert.assertEquals(1, actual);
    }

    @Test
    public void getKittensReturnKittenCounts() {
        Feline feline = new Feline();
        int actual = feline.getKittens(10);
        Assert.assertEquals(10, actual);
    }
}