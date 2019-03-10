package com.andy.factory.factorymethod;

import com.andy.domain.Cat;
import com.andy.domain.Dog;

public class AnimalFactory {

    public Cat createCat(){
        return new Cat();
    }

    public Dog createDog(){
        return new Dog();
    }
}
