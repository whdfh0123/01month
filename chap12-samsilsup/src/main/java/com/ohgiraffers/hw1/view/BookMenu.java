package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.List;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm;
    public BookMenu(){}
    BookManager BM = new BookManager();
    public void mainMenu(){


        while (true) {
            System.out.println("====메뉴====");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 프로그램 종료하기");
            int mNum = sc.nextInt();
            sc.nextLine();
            if(mNum==6){
                return;
            }
            switch (mNum){
                case 1 : BM.addBook(inputBook());
                break;
                case 2 :
//                break;
                case 3 : BM.deleteBook(inputBookNo());
                break;
                case 4 : BM.searchBook(inputBooktitle());
                break;
                case 5 : BM.displayAll();
                break;

            }
        }
    }
    public BookDTO inputBook(){

        System.out.println("도서 번호 : ");
        int Bn1= sc.nextInt();
        sc.nextLine();
        System.out.println("도서 제목 : ");
        String Bt = sc.nextLine();
        System.out.println("도서 장르 (1. 인문 / 2.자연과학 / 3.의료 / 4.기타 : ");
        int Bn= sc.nextInt();
        sc.nextLine();
        System.out.println("도서 저자 : ");
        String Ba = sc.nextLine();
        BookDTO bookDTO = new BookDTO(Bn1, Bn,Bt, Ba);

        return bookDTO;
    }
    public int inputBookNo(){

        System.out.println("도서 번호 : ");
        int Bn= sc.nextInt();
        sc.nextLine();
        return Bn;
    }
    public String inputBooktitle(){
        System.out.println("도서 제목 : ");
        String Bt = sc.nextLine();
        return Bt;

    }
//    public List<BookDTO> selectSortedBook(){
//        System.out.println("정렬 방식 : ");
//        int sSB= sc.nextInt();
//        sc.nextLine();
//        return BM.sorteBookList(sSB);
//    }

}
