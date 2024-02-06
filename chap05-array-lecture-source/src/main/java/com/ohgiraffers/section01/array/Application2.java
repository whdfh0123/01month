package com.ohgiraffers.section01.array;

public class Application2 {
    public static void main(String[] args) {

//        int //qodufgkfekd
        int[] iarr1 = new int[5];
        int[] iarr3 = new int[]{11, 22, 33, 44, 55};
        for (int i = 0; i < iarr3.length; i++){
            System.out.println(iarr3[i]);
        }
        int[]iarr4 = {111,222,333,444,555};
        for (int i = 0; i<iarr4.length;i++){
            System.out.println(iarr4[i]);
        }
        String[] sarr = {"red", "orange", "yellow", "green","purple"};
        for (int i = 0; i<sarr.length;i++){
            System.out.println(sarr[i]);
        }
        System.out.println(iarr1);
        /*hashCode() : 일반적으로 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환

         */
        System.out.println("iarr의 hashCode : "+iarr1.hashCode());
        System.out.println("iarr의 길이 : "+iarr1.length);
        /*배열의 한계점 : 길이 변경이 불가함

         */
        double[]darr=new double[10];
        System.out.println("darr의 길이 : "+darr.length);
        System.out.println("해시코드 : " + darr.hashCode());
        darr=new double[100];
        System.out.println("darr의 길이 : "+darr.length);
        System.out.println("해시코드 : " + darr.hashCode());
        /*배열의 인덱스 공간에 갑 대입

        <값의 형태별 기본값>
        정수 : 0
        실수 0.0
        논리 : false
        문자형 : \u0000
        참조 : null
         */
        System.out.println(iarr1[0]);
        System.out.println(iarr1[1]);
        System.out.println(iarr1[2]);
        System.out.println(iarr1[3]);
        System.out.println(iarr1[4]);
        System.out.println("=======================");
        for (int i = 0; i < iarr1.length;i++){
            System.out.println(iarr1[i]);
        }
//        iarr1[0]=1;
//        iarr1[1]=2;
//        iarr1[2]=3;
//        iarr1[3]=4;
//        iarr1[4]=5;
        for (int i = 0; i < iarr1.length;i++){
            iarr1[i] = i+1;
            System.out.println(iarr1[i]);
        }
    }
}
    /*
    배열의 사용 방법 1.배열 선선
    2. 배열할당(new연산자 대응)
    3. 배열 인뎃스 공간에 값대입

    배열 선언
    자료형[] 배열명;
   자료형 배열명
   ㄴ

   staick 영역에 배열의 주소루 보관할 수 있는 공간

     */
//    int[] iarr1  = new int[5];
//    int[] iarr3 = new int[]{11,22,33,44,55};
//    for(int i = 0; i<iarr3.length; i++)
//    //선언과 동잇레 최기화}

