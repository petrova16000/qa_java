package com.example;


import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

public class LionDoesHaveManeExceptionTest {

    @Mock
    Feline feline;

    @Test
    public void doesHaveManeReturnException() {
        try {
            Lion lion = new Lion("ExceptionTest", feline);
            lion.doesHaveMane();
        } catch (Exception exception) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка",
                    exception.getMessage());
        }
    }
}
