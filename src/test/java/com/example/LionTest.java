package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {


    @Test
    public void getKittensReturnOneByDefault() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        int actual = lion.getKittens();
        Assert.assertEquals(1,actual);
    }

    @Test
    public void getFoodReturnLionRation() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        List<String> actual = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, actual);
    }
}