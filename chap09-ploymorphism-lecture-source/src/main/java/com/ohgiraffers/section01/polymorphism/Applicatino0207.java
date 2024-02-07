package com.ohgiraffers.section01.polymorphism;

public class Applicatino0207 {
    public static void main(String[] args) {

        //기본으로 하는 객체 생성 후 호출
        Animal22 animal221 = new Animal22();
        animal221.zzz();
        Cat22 cat22 = new Cat22();
        cat22.zzz();
        Tiger22 tiger22 = new Tiger22();
        tiger22.zzz();

        //애니멀형 객체 생성 (클래스를 사정자 정의 '형'으로 본다)
        Animal22 animal222 = new Cat22();
        animal222.zzz();
        Animal22 animal223 = new Tiger22();
        animal223.zzz();

        // 이렇게 형변환을 시켜주면
        // 애니멀 형이 고양이형으로 바뀌면서 가능
        ((Cat22)animal222).jr();

        //어떤 타입인지 확인하기 (boolean형으로 출력해줌)
        System.out.println(cat22 instanceof Animal22);
        System.out.println(animal221 instanceof Cat22);
        System.out.println(animal221 instanceof Tiger22);

        //새로 추가한 매소드에 넣어보기
        Applicatino0207 app07 = new Applicatino0207(); // 클래스 객체 생성하고 호출하기
        app07.zzzing(animal222);  //매개변수로 애니멀형이지만 Cat객체인걸 넣어주면 출력 그리고 고양이식으로 출력됨
    }

    public void zzzing(Animal22 animal22){ //새로 추가한 메소드
        animal22.zzz();  // 메소드 실행하면 원래 있던 메소드에 가도록
    }
}
