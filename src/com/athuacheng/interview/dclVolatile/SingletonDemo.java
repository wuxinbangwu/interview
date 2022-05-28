package com.athuacheng.interview.dclVolatile;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SingletonDemo {

    //
    public static volatile SingletonDemo singletonDemo = null;

    private SingletonDemo(){
        System.out.println("对象初始化");
    }

    //DCL 双端检锁机制
    public static SingletonDemo getSingletonDemo() {
        if (singletonDemo == null){
            synchronized (SingletonDemo.class){
                if (singletonDemo == null){
                    singletonDemo = new SingletonDemo();
                }
            }
        }
        return singletonDemo;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                    SingletonDemo.getSingletonDemo();
            }).start();
        }
        Lock lock = new ReentrantLock();
        lock.lock();
    }
}
