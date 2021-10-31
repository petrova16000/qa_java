package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionDoesHaveManeTest {

    private final String sex;
    private final Boolean expected;

    public LionDoesHaveManeTest(String sex, Boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Test
    public void doesHaveManeReturnBool() throws Exception {
         Feline feline = new Feline();
            Lion lion = new Lion(sex, feline);
            Boolean actual = lion.doesHaveMane();
            Assert.assertEquals(expected, actual);
    }

    @Parameterized.Parameters
    public static Object[] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
}
