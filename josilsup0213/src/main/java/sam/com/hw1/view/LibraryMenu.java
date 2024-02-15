package sam.com.hw1.view;

import sam.com.hw1.model.dto.Book;
import sam.com.hw1.controller.LibraryManager;
import sam.com.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu{
//    LibraryMenu menu = new LibraryMenu();
    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        String n;
        int a;
        char g;
        System.out.print("이름을 입력해주세요 :" );
        n = sc.nextLine();
        System.out.print("나이를 입력해주세요 :" );
        a= sc.nextInt();
        sc.nextLine();
        System.out.print("성별을 입력해주세요 :" );
        g = sc.next().charAt(0);

        Member member1 = new Member(n, a, g);
        lm.insertMember(member1);
        while (true){
            System.out.println("====메뉴====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");
//            System.out.println(member1.getName());
//            System.out.println(member1.getAge());
//            System.out.println(member1.getGender());
            int num1 = sc.nextInt();
            sc.nextLine();

            if(num1==0){
                return; // 브레이크랑 같다 (매소드를 끝내고 호출한 곳으로 돌아가기 때문)
//                break;
            }

            switch (num1){  // ->를 사용하면 break;를 안써도 똑같다
                case 1 -> System.out.println(lm.myInfo());
                case 2 -> selectAll();
                case 3 -> searchBook();
                case 4 -> rentBook();
                default -> System.out.println("다시 입력하세요");

            }
        }

    }
    public void selectAll(){
        Book[] bList = lm.selectAll();
        for(int i = 0; i<bList.length;i++){
            System.out.println(i+""+bList[i]);
        }
    }
    public void searchBook(){
        System.out.println("검색할 제목 키워드 입력 : ");
        Book[] searchList = lm.searchBook(sc.nextLine());
        for (Book book : searchList){
            if (book!=null){
                System.out.println(book);
            }

        }

    }
    public void rentBook(){
        System.out.println("대여할 도서 번호 선택 : ");
        int rnum = sc.nextInt() - 1;
        System.out.println("인덱스에 접근할 번호 "+ rnum);
        int i = lm.rentBook(rnum);
        System.out.println("리턴 받은 result : "+i);
        if(i==0){
            System.out.println("성공적으로 대여되었습니다");
        }else if (i==1){
            System.out.println("나이 제한으로 대여 불가능입니다");
        }else if (i==2){
            System.out.println("성공적으로 대여되었습니다 요리학원 쿠폰이 발급됩니다 마이페이지를 확인하세요");
        }

    }
}
