package com.chap01;

public class Application {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(System.identityHashCode(instance1));
        System.out.println(System.identityHashCode(instance2));
    }
}
