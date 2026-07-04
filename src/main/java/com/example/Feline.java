package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

    // Возвращает пищу хищника
    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    // Возвращает семейство кошачьих
    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    // Возвращает одного котёнка по умолчанию
    public int getKittens() {
        return getKittens(1);
    }

    // Возвращает переданное количество котят
    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
