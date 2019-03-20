package com.andy.singleton;

import com.andy.singleton.lazy.LazyInnerClassSingleton;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionAttackTest {

    @Test
    public void testReflectionAttack() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = LazyInnerClassSingleton.class;
        Constructor c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        Object o1 = c.newInstance();
        Object o2 = c.newInstance();
        Assert.assertNotEquals(o1, o2);
    }

}
