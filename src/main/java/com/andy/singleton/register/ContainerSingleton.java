package com.andy.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
    private static final Map<String, Object> map = new ConcurrentHashMap<>();

    private ContainerSingleton() {
    }

    public static Object getBean(String className){
        synchronized (map) {
            if (!map.containsKey(className)) {
                Object obj = null;
                try {
                    obj =Class.forName(className).newInstance();
                    map.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            } else {
                return map.get(className);
            }
        }
    }
}
