package com.chap01.creation.singleton;

public class Application {
    public static void main(String[] args) {

        // 싱글톤 패턴 X
        // 매번 객체를 생성하여 메모리 낭비
        /* 1. 사용자가 기능을 사용 (버튼 클릭)
        * 2. 메소드 호출
        * 3. 객체 생성
        * 4. 반복
        * 5. 가정 : 티케팅 프로그램
        * -> 동시에 많은 사용자가 버튼을 눌러 트래픽이 몰린다.
        * -> 여러 객체를 동시에 생성한다.
        * -> 메모리 초과로 인한 서버 과부하
        * */
        NonSingleton instance1 = NonSingleton.getInstance();
        System.out.println(System.identityHashCode(instance1));
        NonSingleton instance2 = NonSingleton.getInstance();
        System.out.println(System.identityHashCode(instance2));
        NonSingleton instance3 = NonSingleton.getInstance();
        System.out.println(System.identityHashCode(instance3));
        NonSingleton instance4 = NonSingleton.getInstance();
        System.out.println(System.identityHashCode(instance4));
        NonSingleton instance5 = NonSingleton.getInstance();
        System.out.println(System.identityHashCode(instance5));


        // private 생성자(에러 발생)
        // private 생성자로 자식 클래스를 만들기 어렵다.
        // Singleton singleton = new Singleton();
        Singleton instance6 = Singleton.getInstance();
        System.out.println(System.identityHashCode(instance6));
        Singleton instance7 = Singleton.getInstance();
        System.out.println(System.identityHashCode(instance7));
    }
}
