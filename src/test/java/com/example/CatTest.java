package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundReturnMeow() {
            Cat cat = new Cat(feline);
            String actual = cat.getSound();
            Assert.assertEquals("Мяу", actual);
    }

    @Test
    public void getFoodReturnCatRation() throws Exception {
            Feline feline = new Feline();
            Cat cat = new Cat(feline);
            List<String> actual = cat.getFood();
            List<String> expected = List.of("Животные", "Птицы", "Рыба");
            Assert.assertEquals(expected, actual);
   }
}