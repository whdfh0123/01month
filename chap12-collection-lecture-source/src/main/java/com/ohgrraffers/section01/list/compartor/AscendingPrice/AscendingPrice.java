//package com.ohgrraffers.section01.list.compartor.AscendingPrice;
//
//import com.ohgrraffers.section01.list.dto.BookDTO;
//
//import javax.swing.*;
//import java.util.Comparator;
//
//public class AscendingPrice implements Comparator<BookDTO> {
//    @Override
//    public int compare(BookDTO o1, BookDTO o2) {
//
//        int result = 0;
//
//        if(o1.getPrice() > o2.getPrice()) {
//            result = 1;
//        } else if(o1.getPrice() < o2.getPrice()) {
//            result = -1;
//        } else {
//            result = 0;
//        }
//        return result;  // 강제 오버라이딩 해야함(진도 놓쳐서 다시 보기
//
//}
