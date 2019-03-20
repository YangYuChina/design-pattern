package com.andy.singleton.lazy;

public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        System.out.println("Outer - Constructor");
        if (LazyHolder.INSTANCE != null){
            throw new RuntimeException("只能实例化一次");
        }
    }

    public static LazyInnerClassSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton INSTANCE;
        static {
            System.out.println("Inner - Static");
            INSTANCE = new LazyInnerClassSingleton();
        }
    }
}
