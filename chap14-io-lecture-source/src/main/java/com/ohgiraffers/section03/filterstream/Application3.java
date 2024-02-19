package com.ohgiraffers.section03.filterstream;

import javax.imageio.IIOException;
import java.io.*;

public class Application3 {
    public static void main(String[] args) {
        /*
        [ 데이터 입출력 보조 스트림 ]
        DataInputStream / DataOutputStream
        -외부 데이터로부터 읽어오는 데이터를 바이트형 정수, 문자, 문자열로만 읽어오면
        여러 데이터 타입을 취급하는 경우 별도로 처리를 해주어야 한다
        - 따라서 데이터 자료형 별로 처리하는 기능을 추가한 보조스트림을 제공하고 있다
         */
        DataOutputStream dout = null;
        try {
        dout = new DataOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/score.txt"));

        // 파일에 자료형별로 기록
            dout.writeUTF("홍길동");
            dout.writeInt(95);
            dout.writeChar('A');
            dout.writeUTF("이순신");
            dout.writeInt(87);
            dout.writeChar('B');
            dout.writeUTF("ssg");
            dout.writeInt(75);
            dout.writeChar('C');

        }catch (IOException e){
            e.printStackTrace();
        } finally {
            if (dout != null){
                try {
                    dout.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        DataInputStream din = null;
        try {
            din = new DataInputStream(new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/score.txt"));
            while (true){
                System.out.println(din.readUTF()+", "+din.readInt()+", "+ din.readChar());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (EOFException e){
            System.out.println("파일 읽기 완료");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (din != null){
                try {
                    din.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
