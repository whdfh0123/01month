package com.ohgiraffers.section03.copy;

public class Application {
    public static void main(String[] args) {
        /*
        배열의 복사 종류
        1. 얕은 복사 (shallow copy) : stack의 주소값만 복사
        2. 깊은복사(deep copy) : heap의 배열에 저장된 값을 복사

        얕은 복사는 stack에 저장되어 있는 배열의 주소값만 복사한다는 것이다
        따라서 두새의 레퍼런스 변수는 동일한 배열의 주소값을 가지고 있다
        다른 레퍼런스 변수로 접근했을 때도 변경된 값이 반영되어 있다
         */
        int[] originArr = {95,96,97,98,99};

        int[] coptArr = originArr;

        System.out.println(originArr.hashCode());
        System.out.println(coptArr.hashCode());

        System.out.println("값 변경 전 : "+originArr[4]);
        System.out.println("값 변경 전 : "+coptArr[4]);

        coptArr[4]=90;

        System.out.println("값 변경 후 : "+originArr[4]);
        System.out.println("값 변경 후 : "+coptArr[4]);
        /*얕은 복사의 활영
        주로 메소드 호출 시 인자로 사용하는 경우와
        리턴값으로 동일한 배열울 반환하고 싶은경우 사용한다
         */
        String[] team = {"김동환", "짱구", "맹구", "유리"};
        System.out.println("team 배열 hashCode() : "+team.hashCode());

        printArr(team);
        getArr();
        String[] arrFromMethod = getArr();
        System.out.println("리턴으로 받은 해시코드 : "+arrFromMethod.hashCode());
    }

    public static void printArr(String[] arr){
        System.out.println("printArr() 매개변수 해시코드:"+arr.hashCode());
        for (int i = 0; i<arr.length; i++){
            arr[i]+="님";
            System.out.println(arr[i]+"");
        }
        /*인자와 매개변수로 활용

         */
    }
    /*인자와 매개변수로 활용

     */
    public static String[] getArr(){
        String[] lunch = new String[]{"순두부", "연어포케","떡만두국"};
        System.out.println("getArr()의 배열 hashCode() : "+lunch.hashCode());
        return lunch;
    }
    //2. 리턴값으로 활용

}
