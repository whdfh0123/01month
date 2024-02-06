package com.ohgiraffers.section05.parameter.samsilsup2;

public class Application {
    public static void main(String[] args) {
        StudentVO studentVO = new StudentVO();
        studentVO.setGrade(1);
        studentVO.setClassroom(5);
        studentVO.setName("hong");
        studentVO.setHeight(175.5);
        studentVO.setGender('남');


        System.out.println("학년 : "+studentVO.getGrade());
        System.out.println("반 : "+studentVO.getClassroom());
        System.out.println("이름 : "+studentVO.getName());
        System.out.println("키 : "+studentVO.getHeight());
        System.out.println("성별 : "+studentVO.getGender());
        System.out.println("\n");
        StudentVO studentVO1 = new StudentVO(2,1,"Lee",167.1, '여');
        studentVO1.printlnformation();


    }
}
