package com.chap01.creation.abstract_factory;

public class Application {

    public static void main(String[] args) {

        test("테슬라", 10000000);
        test("제네시스", 8000000);
        test("K9", 50000000);
        test("K7", 30000000);
        test("K5", 20000000);
        test("K3", 15000000);
        test("펠리셰이드", 60000000);
    }

    public static void test(String name, int price) {
        /* 추상 팩토리 메소드를 적용하지 않은 상황
        * 이름, 가격으로 판매 완료
        * 판매가 계속 될 때마다 코드가 늘어나 복잡해질 것으로 예상
        * */
        NonAbstractFactory nonAbstractFactory = new NonAbstractFactory(name, price);

        System.out.println("판매완료 ** " + name + "상품가격 : " + price + "원");
    }
}
