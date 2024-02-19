package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FilterReader;
import java.io.IOException;

public class Application4 {
    public static void main(String[] args) {
        /* [ FileWriter ]
        프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림으로
        1글자 단위로 데이터를 처리한다
         */
        // FileWriter 기본적으로 버퍼를 사용하기 떄문에 버퍼에 임시저장해서 그 값을 작성해준다
        FileWriter fw = null;
        try {
        fw = new FileWriter("src/main/java/com/ohgiraffers/section02/stream/testWriter.txt");
            fw.write(97);
            fw.write(System.lineSeparator()); // 줄바꿈
            // 문자 기반 스트림은 직접 char 자료형으로 내보내기도 가능하다
            fw.write(new char[]{'a','p','p','l','e'});
            fw.write("우리나라 대한민국");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fw != null){
                try {
                    fw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
