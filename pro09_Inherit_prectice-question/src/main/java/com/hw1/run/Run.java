package com.hw1.run;

import com.hw1.model.dto.Employee;
import com.hw1.model.dto.Person;
import com.hw1.model.dto.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] st = new Person[3];
        st[0]=new Student("홍길동",20,178.2,70,1,"정보시스템공학과");
        st[1]=new Student("김말똥",21,187.3,80,2,"경영학과");
        st[2]=new Student("강개순", 23,167,45,4,"정보통신공학과");

        for(Person i : st){
            System.out.println(i.getInformation());
        }


        Person[] em = new Person[10];
        int count = 0;
        while (true){
            System.out.print("사원 정보를 추가할까요?(y/n) : ");
            char yn = sc.next().charAt(0);
            if(yn=='y'||yn=='Y'){
                System.out.println("사원을 추가합니다");
                sc.nextLine();
                System.out.println("사원의 이름을 입력하세요 : ");
                String n = sc.nextLine();
                System.out.println("사원의 나이를 입력하세요 : ");
                int a = sc.nextInt();
                System.out.println("사원의 신장을 입력하세요 " );
                double h = sc.nextDouble();
                System.out.println("사원의 몸무게을 입력하세요 " );
                double w = sc.nextDouble();
                System.out.println("사원의 급여를 입력하세요 " );
                int s = sc.nextInt();
                sc.nextLine();
                System.out.println("사원의 부서를 입력하세요 " );
                String d = sc.nextLine();
                em[count] = new Employee(n,a,h,w,s,d);
                count++;
//                if(c>=9){
//                    break;
//                }

            }else if(yn=='n'||yn=='N'){
                System.out.println("그만");
                for(int i2 = 0; i2 < count; i2++){
                    System.out.println(em[i2].getInformation());
                }
                break;

            }

        }



    }

}
