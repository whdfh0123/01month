package com.ohgiraffers.section02.extendsilsup22;

import com.ohgiraffers.section02.extend.Rabbit;

public class RFF <T extends Rabbit> {
    private T animal;
    public RFF(){

    }

    public RFF(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
