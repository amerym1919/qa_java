package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class CatTest {

    // Проверяет голос кошки
    @Test
    public void getSoundReturnsMeow() {
        Predator predator = Mockito.mock(Predator.class);
        Cat cat = new Cat(predator);

        Assert.assertEquals("Мяу", cat.getSound());
    }

    // Проверяет, что кошка возвращает еду от хищника
    @Test
    public void getFoodReturnsPredatorFood() throws Exception {
        Predator predator = Mockito.mock(Predator.class);
        Cat cat = new Cat(predator);

        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(predator.eatMeat()).thenReturn(expectedFood);

        Assert.assertEquals(expectedFood, cat.getFood());
    }

    // Проверяет, что кошка вызывает метод получения мяса
    @Test
    public void getFoodCallsEatMeat() throws Exception {
        Predator predator = Mockito.mock(Predator.class);
        Cat cat = new Cat(predator);

        cat.getFood();

        Mockito.verify(predator).eatMeat();
    }
}