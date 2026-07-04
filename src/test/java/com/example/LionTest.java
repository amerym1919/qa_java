package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class LionTest {

    // Проверяет, что лев получает еду
    @Test
    public void getFoodReturnsPredatorFood() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion("Самец", feline);

        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);

        Assert.assertEquals(expectedFood, lion.getFood());
        Mockito.verify(feline).eatMeat();
    }

    // Проверяет, что лев получает количество львят
    @Test
    public void getKittensReturnsFelineKittens() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion("Самка", feline);

        int expectedKittens = 1;
        Mockito.when(feline.getKittens()).thenReturn(expectedKittens);

        Assert.assertEquals(expectedKittens, lion.getKittens());
        Mockito.verify(feline).getKittens();
    }

    // Проверяет ошибку при неверном поле льва
    @Test
    public void constructorThrowsExceptionForWrongSex() {
        Feline feline = Mockito.mock(Feline.class);

        Exception exception = Assert.assertThrows(
                Exception.class,
                () -> new Lion("Неверное значение", feline)
        );

        Assert.assertEquals(
                "Используйте допустимые значения пола животного - самец или самка",
                exception.getMessage()
        );
    }
}