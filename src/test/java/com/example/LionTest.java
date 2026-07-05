package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class LionTest {

    // Проверяет, что лев возвращает еду от кошачьих
    @Test
    public void getFoodReturnsFelineFood() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion("Самец", feline);

        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);

        Assert.assertEquals(expectedFood, lion.getFood());
    }

    // Проверяет, что лев вызывает метод получения мяса
    @Test
    public void getFoodCallsEatMeat() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion("Самец", feline);

        lion.getFood();

        Mockito.verify(feline).eatMeat();
    }

    // Проверяет, что лев возвращает количество львят от кошачьих
    @Test
    public void getKittensReturnsFelineKittens() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion("Самка", feline);

        int expectedKittens = 1;
        Mockito.when(feline.getKittens()).thenReturn(expectedKittens);

        Assert.assertEquals(expectedKittens, lion.getKittens());
    }

    // Проверяет, что лев вызывает метод получения котят
    @Test
    public void getKittensCallsFelineMethod() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion("Самка", feline);

        lion.getKittens();

        Mockito.verify(feline).getKittens();
    }

    // Проверяет ошибку при неверном поле льва
    @Test
    public void constructorThrowsExceptionForWrongSex() {
        Feline feline = Mockito.mock(Feline.class);

        Assert.assertThrows(
                Exception.class,
                () -> new Lion("Неверное значение", feline)
        );
    }
}