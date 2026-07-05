package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sex;
    private final boolean expectedHasMane;

    public LionParameterizedTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    // Тестовые данные для проверки гривы
    @Parameterized.Parameters
    public static Object[][] getLionSexData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    // Проверяет наличие гривы в зависимости от пола
    @Test
    public void doesHaveManeDependsOnSex() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion(sex, feline);

        Assert.assertEquals(expectedHasMane, lion.doesHaveMane());
    }
}