package com.ohgiraffers.section05.parameter;

public class Application {
    public static void main(String[] args) {
        /*
        매개변수(parameter)로 사용 가능한 자료형
        1. 기번자료형
        2. 기본자료형 배열
        3.클래스 자료형(사용자 정의 자료형)
        4 클래스 자료형 배열(= 객체 배열)
        5 .가변인자
         */
        ParamethorTest pt = new ParamethorTest();
        int num = 20;
        pt.prumaryTypeParamether(num);
        int[] iarr = new int[]{1,2,3,4,5};
            System.out.println("기본자료형 배열 전달인자로 전달하는 값 : "+iarr);
        pt.promaryTypeArrParramethor(iarr);

        System.out.println("변경후 원본 배열의 값 출렷 : ");
        for (int i : iarr){
            System.out.print(i+" ");
        }
        System.out.println();
        RectAngle r1 = new RectAngle(10, 10);
        System.out.println("클래스 자료형 전달인자로 전달하는 값 : "+r1);
        pt.classTypeParameter(r1);
        System.out.println("변경 후 사각형의 넓이와 둘레 ====22");
        r1.calcArea();
        r1.caleRound();

        //가변인자 메소드 호출
        //이름은 가변인자가 아니라서 써줘야함 에러뜸
        //가변인자는 아예 입력하지 않아도 가능
        pt.variableLengthArrayparameter("홍","야구", "축", "농","배");
        pt.variableLengthArrayparameter("22","야구");
        pt.variableLengthArrayparameter("33",new String[]{"테니스", "서예", "탁수"}); //배열도 가능
    }

}
