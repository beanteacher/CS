package com.chap01.creation.singleton;

public class Singleton {

    // 단일 객체 저장을 위한 변수 singleton 선언
    private static final Singleton singleton = new Singleton();

    // 기본 생성자를 new 로 객체를 생성하지 못하게 private 로 선언
    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
