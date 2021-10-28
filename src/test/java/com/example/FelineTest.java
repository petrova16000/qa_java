package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


public class FelineTest {

    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals("Метод вернул не корректное значение", expected, food);
    }

    @Test
    public void getFamily() {
     Feline feline = new Feline();
     String actual =  feline.getFamily();
     Assert.assertEquals("Метод вернул не корректное значение","Кошачьи", actual);
    }

    @Test
    public void getKittensReturn1() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        Assert.assertEquals("Метод вернул не корректное значение",1, actual);
    }

    @Test
    public void getKittensReturnKittenCounts() {
        Feline feline = new Feline();
        int actual = feline.getKittens(10);
        Assert.assertEquals("Метод вернул не корректное значение",10, actual);
    }
}