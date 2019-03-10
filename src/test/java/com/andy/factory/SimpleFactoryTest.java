package com.andy.factory;

import com.andy.domain.Cat;
import com.andy.domain.Dog;
import com.andy.factory.simpleFactory.SimpleFactory;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleFactoryTest {

    private static final String CLASS_NAME_OF_CAT = "com.andy.domain.Cat";
    private static final String CLASS_NAME_OF_DOG = "com.andy.domain.Dog";

    private static SimpleFactory simpleFactory;

    @BeforeClass
    public static void init(){
        simpleFactory = new SimpleFactory();
    }

    @Test
    public void testCreateCat() throws Exception {
        Object obj = simpleFactory.create(CLASS_NAME_OF_CAT);
        Assert.assertTrue(obj instanceof Cat);
        Cat cat = (Cat)obj;
        cat.eat();
        cat.sleep();
    }

    @Test
    public void testCreateDog() throws Exception {
        Object obj = simpleFactory.create(CLASS_NAME_OF_DOG);
        Assert.assertTrue(obj instanceof Dog);
        Dog dog = (Dog) obj;
        dog.eat();
        dog.sleep();
    }
}
