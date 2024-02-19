package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    private Scanner sc = new Scanner(System.in);

    private ArrayList<BookDTO> booklist;
    public BookManager() {
        booklist = new ArrayList<>();
        booklist.add(new BookDTO(1, 1, "가", "허균"));
        booklist.add(new BookDTO(2, 3, "나", "허군"));
        booklist.add(new BookDTO(3, 2, "다", "허군"));
    }

    public void addBook(BookDTO book) {
        booklist.add(book);
    }

    public void deleteBook(int index) {
        System.out.println(index+"번 넘버의 책을 삭제합니다");
        System.out.println("지우기 전" + booklist.size());

        int deleteIndex = -1;
        for (BookDTO i : booklist) {
            if (i.getbNo() == index) {
//                booklist.remove(i);
//                break;
//                return;

                deleteIndex = booklist.indexOf(i);

            }
        }
        booklist.remove(deleteIndex);

        System.out.println("지운 후" + booklist.size());
    }

    // 검색
    public void searchBook(String title) {
        for (BookDTO i : booklist) {
            if (i.getTitle().contains(title)) {
                System.out.println(i);

            }
        }
    }


    public void displayAll() {
        for (BookDTO i : booklist) {
            System.out.println(i);

        }

    }

//        public List<BookDTO> sorteBookList(int type){
//        switch (type){
//            case 1 : for (BookDTO bookDTO : booklist){
//                System.out.println(bookDTO);
//
//
//            }
//        }
//
//    }
    public void printBookList(List<BookDTO> printList) {

    }
}
