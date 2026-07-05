package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    private final Feline feline = new Feline();

    // Проверяет список еды для хищника
    @Test
    public void eatMeatReturnsPredatorFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        Assert.assertEquals(expectedFood, feline.eatMeat());
    }

    // Проверяет семейство кошачьих
    @Test
    public void getFamilyReturnsFelineFamily() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    // Проверяет количество котят по умолчанию
    @Test
    public void getKittensWithoutArgumentReturnsOne() {
        Assert.assertEquals(1, feline.getKittens());
    }

    // Проверяет количество котят
    @Test
    public void getKittensWithArgumentReturnsKittensCount() {
        Assert.assertEquals(3, feline.getKittens(3));
    }
}