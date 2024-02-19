package com.ohgiraffers.section01.file;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        /* JDK1.0 부터 지원하는 API로 파일 처리를 수행하는 대표적인 클래스이다
        대상 파일에 대한 정보로 인스턴스를 생성하고
        파일의 생성 삭제 등등의처리를 수행하는 기능을 제공하고 있다
         */
        // 지금 경로를 써준다
        File file = new File("src/main/java/com/ohgiraffers/section01/file/text.txt");  // 키워드 '파일'
        // text.txt가 생성되고

        try {
            boolean creatSuccess = file.createNewFile();  //뉴파일을 쓰려면 반드시 예외처릴 해야함
            System.out.println("creatSuccess" +creatSuccess);  // 잘 생성 된건지 확인해봄 true
            // 하지만 최초 1회 이후 돌릴 경우 false를 주는데 처음만 생성하고 나중엔 생성하지 않기 때문
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("파일의 크키 : "+file.length() + "byte"); // 아무것도 작성하지 않은 파일은
        System.out.println("파일의 경로 : "+file.getPath());
        System.out.println("파일의 절대 경로 : "+file.getAbsolutePath());  // 상위 파일부터 다 보여준다
        System.out.println("현재 파일의 상위 경로"+file.getParent());
        boolean deleteSuccess = file.delete();
        System.out.println("deleteSuccess"); //삭제
        System.out.println(deleteSuccess);

    }
}
