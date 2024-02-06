package com.ohgiraffers.section05.parameter;

public class ParamethorTest {
    public void prumaryTypeParamether(int num) {
        System.out.println("매개변수로 전달 받은 값 : " + num);
    }

    public void promaryTypeArrParramethor(int[] iarr) {
    /*베열의 주솨 전달된다
    즉 인자로 전닿하는 배열과 매개변수로 전달받은 배열은 서로 동일한 배열을 가프침 (얕은복사)

     */
        System.out.println("매개변수로 전달 받은 값" + iarr);
        System.out.println("배열의 값 : ");
        for (int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i]+" ");

        }
//        for(int i : iarr){
//            System.out.print(i+" "); //위의 방법과 동일
//        }
        System.out.println();
        iarr[0] = 99;
        System.out.println("변경 후 배열의 값");
        for(int i : iarr){
            System.out.print(i+" "); //얕은 복사라 값이 달라져버림
        }

    }
    public void classTypeParameter(RectAngle rectAngle){
        System.out.println("매개변수로 전달받은 값 : "+rectAngle);

        System.out.println("변경 전 사각형의 넓이와 둘레 ==========");
        rectAngle.calcArea();
        rectAngle.caleRound();

        rectAngle.setWidth(100);
        rectAngle.setHeight(100);
        System.out.println("변경 후 사각형의 넓이와 둘레 ==========");
        rectAngle.calcArea();
        rectAngle.caleRound();

    }
    // 가변인자 (몇개가 전달될지모른다) ... 찍어주기 이렇게 ...찍어준건 맨 뒤로 순서를 보내야함
    public void variableLengthArrayparameter(String name, String...hobby){
        System.out.println("이름 :"+name);
        System.out.println("취미의 갯수 : "+hobby.length);
        System.out.print("취미 : ");
        for (int i =0; i<hobby.length; i++){
            System.out.print(hobby[i]+" ");
        }
        System.out.println();
    }
//    public void variableLengthArrayparameter(String...hobby){ //이름이 같은 메소드 오버로딩은 가능 하지만 전에 입력한게 헷갈려짐
    // 오버로딩 시 주의 둘 중 어떤 메소드를 호출하는 것인지에 대한 모호성이 발생했기 떄문에 에러 발생
    //가변배열을 매개변수로 이용한 메소드는 모호성으로 인해 오버로딩 하지 않는것이 좋다
//        System.out.println("취미의 갯수 : "+hobby.length);
//        System.out.println("취미 : ");
//        for(int i = 0; i<hobby.length; i++){
//            System.out.println(hobby[i]+" ");
//        }



}
