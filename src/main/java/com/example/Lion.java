package com.example;

import java.util.List;

public class Lion {

    private final boolean hasMane;
    private final Feline feline;

    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;

        // Определяем наличие гривы по полу льва
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    // Возвращает количество львят
    public int getKittens() {
        return feline.getKittens();
    }

    // Возвращает наличие гривы
    public boolean doesHaveMane() {
        return hasMane;
    }

    // Возвращает пищу льва
    public List<String> getFood() throws Exception {
        return feline.eatMeat();
    }
}
