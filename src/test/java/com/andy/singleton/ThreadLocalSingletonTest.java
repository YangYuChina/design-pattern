package com.andy.singleton;

import com.andy.singleton.threadlocal.ThreadLocalSingleton;
import org.junit.Test;

public class ThreadLocalSingletonTest {
    @Test
    public void testGetInstance(){
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());
        t1.start();
        t2.start();

        System.out.println("---End---");
    }

    private class ExecutorThread implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": " + ThreadLocalSingleton.getInstance());
        }
    }
}
