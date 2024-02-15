package com.ohgrraffers.section3.map.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {
        // [ Properties ]
        // 일단 다음에 더 배울 부분 한번 해보고 넘어간다고 하셨음
        // HashMap 을 구현하여 사용 용법이 거의 유사하지만 key와 value 모두 문자열만 사용할 수 있는 자료구이다
        // 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용한다

        Properties prop = new Properties();
        prop.setProperty("driver", "com.mysql.cj.jdbc.Driver");
        prop.setProperty("url", "jdbc:mysql://localhost/menudb");
        prop.setProperty("user", "ohgiraffest");
        prop.setProperty("password", "oaafs");
        System.out.println(prop);

        // 알트엔터 단축키써서 일단 만든다 다음에 자세하게 하신다고 함
        try {
            prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
            prop.store(new FileWriter("driver.txt"),"jdbc driver");
            prop.storeToXML(new FileOutputStream("driver.xml"),"jdbc driver");
        } catch (IOException e) {
            e.printStackTrace();
//            throw new RuntimeException(e); // 자동 생성된 키워드 일단 넘어감
        }
        Properties prop2 = new Properties();

//        prop2.load(new FileInputStream("driver.dat"));  // 이걸 try/catch 알트엔터로 만들면 밑에 결과
        try {
            prop2.load(new FileInputStream("driver.dat"));
            prop2.load(new FileInputStream("driver.txt"));
            prop2.load(new FileInputStream("driver.xml"));
            prop2.list(System.out);
            System.out.println(prop2.getProperty("driver"));
            System.out.println(prop2.getProperty("url"));
            System.out.println(prop2.getProperty("user"));
            System.out.println(prop2.getProperty("password"));
        } catch (IOException e) {
            e.printStackTrace();
//            throw new RuntimeException(e);
        }

    }
}
