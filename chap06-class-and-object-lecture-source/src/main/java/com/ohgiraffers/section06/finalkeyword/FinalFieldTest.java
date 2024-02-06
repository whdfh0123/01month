package com.ohgiraffers.section06.finalkeyword;

public class FinalFieldTest {
    /* final
    final은 종단의 의미를 가지는 키워드이다
    final 키워드를 사용할 수 있는 위치는 다양한 편이며, 의미가 약간은 다르지만 결국 변경 불가의 의미이다
    1. 지역변수 : 초기화 이후 값 변경 불가
    2. 매개변수 : 호출시 전달한 인자 변경 불가
    3. 전역변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가
    4. 클래스(static) 변수 : 프로그램 start이후 값 변경 불가
    5. non-static 메소드 : 메소드 재작성(overriding) 불가
    6. static 메소드 : 메소드 재작성 불가
    7.클래스 : 상속 불가

     */

    //non-static field에 final사용하기
//    private final int nonStaticNum; // 0 으로 초기화 이후 변경 불가능하기 때문에 에러
    private final int NNO_STATIC_NUM = 1; //생성과 같이 초기화 시키기

    //생성자로 초기화하면 가능
    //생성 후 생성자를 이용해서 초기화
    private final String NON_STATIC_NAME;
    public FinalFieldTest(String nonStaticName){
        this.NON_STATIC_NAME = nonStaticName;
    }




    //static field에 final 사용
//    private final int STATIC_NUM; // 0으로 초기화 되고 이후 변경 불가라 에러남
    private static final int STATIC_NUM = 1;  // 그냥 바로 초기화

    /* 생성자로 이용한 초기화 불가능
    생성자는 인스턴스가 생생되는 시점에 호출이 되기 떄문에 그 전에는 초기화가 일어나지 못한다
    하지만 static은 프로그램이 start될때 할당되기 때문에 초기화 되지 않은 상태로 선언된 것과 동일하여
   기봄값으로 초기화 된 후 값을 변경하지 못하기 때문에 에러 발생
     */
//    private static final doubleSTATIC_DOUBLE;
//    public FinalFieldTest(double staticDouble){
//        final FinalFieldTest.STATIC_DOUBLE=staticDouble;
//    })

    // 설명


}
