package com.andy.singleton;

import com.andy.singleton.lazy.LazySimpleSingleton;
import org.junit.Test;

public class LazySimpleSingletonTest {
    @Test
    public void testGetInstance() throws InterruptedException {
        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

    private class ExecutorThread implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": " + LazySimpleSingleton.getInstance());
        }
    }
}
