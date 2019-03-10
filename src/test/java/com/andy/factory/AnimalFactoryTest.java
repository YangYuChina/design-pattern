package com.andy.factory;

import com.andy.domain.Animal;
import com.andy.domain.Cat;
import com.andy.domain.Dog;
import com.andy.factory.factorymethod.AnimalFactory;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AnimalFactoryTest {

    private static AnimalFactory animalFactory;

    @BeforeClass
    public static void init(){
        animalFactory = new AnimalFactory();
    }

    @Test
    public void testCreateCat(){
        Cat cat = animalFactory.createCat();
        Dog dog = animalFactory.createDog();
        List<Animal> list = new ArrayList<Animal>();
        list.add(cat);
        list.add(dog);
        for (Animal animal : list){
            animal.eat();
            animal.sleep();
        }
    }
}
