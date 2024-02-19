package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application1 {
    public static void main(String[] args) {
        /*
        [ BufferdWriter / BufferedReader ]
        필터스트림은 외부 데이터에 직접 연결하는 것이 아니라 기본 스트림에 추가로 사용할 수 있는 스트림이다
        주로 성능을 향상시키는 목적으로 사용되며 생성자를 보면 구분이 가능하다
        생성자쪽에 매개변수로 다른 스트림을 이용하는 클래스는 필터스트림이라고 볼수있다
         */

        BufferedWriter bw = null;
        try {
        bw = new BufferedWriter(new FileWriter("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));
        bw.write("안녕하세요\n");
        bw.write("반갑습니다\n");
        bw.flush();  // 그냥 두면 버퍼가 다 차기 전에는 내보내지 않음(텍스트 파일에 작성X) 그래서 플래쉬 해주기
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (bw != null) {

                try {
                    bw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }

            }
        }
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));

            String temp;
            while ((temp = br.readLine())!=null){
                System.out.println(temp);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (br != null){
                try {
                    br.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
