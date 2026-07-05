package com.example;

import java.util.List;

public class Cat {

    private final Predator predator;

    public Cat(Predator predator) {
        this.predator = predator;
    }

    // Возвращает голос кошки
    public String getSound() {
        return "Мяу";
    }

    // Возвращает пищу кошки
    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }
}