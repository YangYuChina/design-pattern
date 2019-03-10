package com.andy.factory.simpleFactory;

public class SimpleFactory {

    public Object create(String name) throws Exception {
        if (name.isEmpty()){
            return null;
        }
        return Class.forName(name).newInstance();
    }
}
