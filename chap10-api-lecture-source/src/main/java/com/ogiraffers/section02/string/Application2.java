package com.ogiraffers.section02.string;

public class Application2 {
    public static void main(String[] args) {
    /* [문자열 객체를 만드는 방법 ]
    "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다
    new String("문자열") : 매번 새로운 인스턴스를 생성한다
     */

        //똑같은 값이면 그냥 같은 곳에 저장된 값을 불러온다
    String str1 = "java";
    String str2 = "java";
    // 하지만 이렇게 만들면 새로운 객체가 생성되어 다른 곳에 생성한다
    String str3 = new String("java");
    String str4 = new String("java");
    // 그래서 같은 값인지 비교하면 이렇게 나온다
        System.out.println("str1 == str2 : "+(str1==str2));
        System.out.println("str2 == str3 : "+(str2==str3));
        System.out.println("str3 == str4 : "+(str3==str4));

        // 하지만 동일한 문자열의 해시코드는 동일한 해시코드를 반환하게 되어있다
        System.out.println("str1의 hashCode : "+str1.hashCode());
        System.out.println("str2의 hashCode : "+str2.hashCode());
        System.out.println("str3의 hashCode : "+str3.hashCode());
        System.out.println("str4의 hashCode : "+str4.hashCode());

        /* 문자열 불변이라는 특징을 가진다
        기존 문자열에 + 연산을 수행하는 경우 문자열을 수정하는 것이 아니고 새로운 문자열을 할당하게 된다
         */
        str2 +="oracle";
        System.out.println("str1 == str2 : "+(str1==str2));

        /* equals() : String 클래스의 equals()메소드는 인스턴스 비교가 아닌 문자열값을 비교하여
        동일한 값을 가지는 경우 true 다른 값을 가지는 경우 false를 반환하도록 Object의
        equals() 메소드를 재정의 해 두었다
        따라서 문자열 인스턴스 생성 방식과 상관없이 동일한 문자열인지를 비교하기 위해 ==연산 대신
        equals()메소드를 사용해야 한다
         */
        System.out.println("str1.equals(str3) : "+str1.equals((str3)));
        System.out.println("str1.equals(str4) : "+str1.equals((str4)));

        /*참고로 new java.util.Scanner(System.in).nextLine();을 이용해 문자열을 입력받는경우
        substring으로 잘라내기 해서 새로운 문자여릉ㄹ 생성 후 반환하기 때문에
        new String()으로 인스턴스를 생성한것과 동일한 것으로 볼수있다
        따라서 Scanner로 입력ㄱ받은 문자열을 비교할 때에는 equals()를 써야한다
        구분하기 힘들면 그냥 문자열은 equals()로 비교하는 것이 가장 좋은 방법이다
         */
    }
}
