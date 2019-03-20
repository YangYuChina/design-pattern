package com.andy.singleton.lazy;

public class LazySimpleSingleton {
    private static LazySimpleSingleton instance;
    private LazySimpleSingleton(){ }

    public synchronized static LazySimpleSingleton getInstance(){
        if (instance == null){
            instance = new LazySimpleSingleton();
        }
        return instance;
    }
}
