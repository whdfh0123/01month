package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        /*깊은복사는 heap에 생성된 배열이 가진 값을 또 다른 배열에 복사하는 것이다
        서로 같은 값을 가지고 있지만 heap영역에 각각 다르게 생성된 배열이므로
        하나의 배열 값을 변경하더라도 다른 배열에 영향을 주지 않는다

        깊은 복사를 하는ㄴ 방법 4가지
        1. for문을 이용하여 동일한 인덱스의 값 복사
        2. Object의 clone()을 이용한 복사
        3. system의 arraycapy를 이용한 복사
        4. Arrays의 copyOf를 이용한 복사

         */
        int[] originArr = new int[]{2, 3, 5, 4};
        int[] copyFor = new int[originArr.length];
        for (int i = 0; i < originArr.length; i++) {
            copyFor[i] = originArr[i];
        }
        print("copyFor", copyFor);
        print("origing", originArr);

        int[] copyClone = originArr.clone();
        print("copy", copyClone);

        //system의 arraycopy를 이용한 복사
        int[] copyArraycopy = new int[4];
        //system.arraycopy ( 원본배열, 복사를 시작할 인덱스, 복사본배열, 복사를 시작할 인덱스, 복사할길이)
        System.arraycopy(originArr, 0, copyArraycopy, 0, originArr.length);
        print("sarrycopy", copyArraycopy);

        // 4. Arrays의 copyOf()를 이용한 복사
//        원본배열의 시작 인덱스부터 원하는 길이만큼 복사해서 사용가능
        int[] copyCopyof = Arrays.copyOf(originArr, 4);
        print("cCof=", copyCopyof);



//        향상돤 for문
//        for(자료형 변수명b:반복가능한 객체 A) {
//    }
//        A에 들어있는 값을 b로 순서대로 받아옴
    }
//    int[] tempArr = {3,1,2,3};
//    for(int value : tempArr){
//        copyClone[value]=5;
//    }
    /*
    위의 경우
    copyClone[3] = 5;
    copyClone[1] = 5;
    copyClone[2] = 5;
    copyClone[3] = 5;
     */



    public static void print(String name, int[] arr){
        System.out.println(name + "의 hashCode() : "+arr.hashCode());

        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }
}
