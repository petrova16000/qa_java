package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSound() {
            Feline feline = new Feline();
            Cat cat = new Cat(feline);
            String actual = cat.getSound();
            Assert.assertEquals("Метод вернул не корректное значение","Мяу", actual);
    }

    @Test
    public void getFood() throws Exception {
            Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            Cat cat = new Cat(feline);
            List<String> actual = cat.getFood();
            List<String> expected = List.of("Животные", "Птицы", "Рыба");
            Assert.assertEquals("Метод вернул не корректное значение", expected, actual);
   }
}