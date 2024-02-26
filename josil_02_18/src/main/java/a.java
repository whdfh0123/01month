import java.util.HashMap;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        HashMap map1 = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");
        map1.put(4,"D");
        map2.put(1,"E");
        map2.put(2,"F");
        map2.put(3,"G");
        map2.put(4,"H");


        int rm1 = (int)((Math.random()*4)+1);
        int rm2 = (int)((Math.random()*4)+1);
        int r1 = (int)((Math.random()*3)+1);
        int r2 = (int)((Math.random()*3)+1);
        String m1 = (String) map1.get(rm1);
        String m2 = (String) map2.get(rm2);


        map3.put(m1, r1);
        map3.put(m2, r2);
        int gbb1 = (int)map3.get(m1);
        int gbb2 = (int)map3.get(m2);


        System.out.println("대결할 선수는 "+m1+"와 "+m2+"입니다");
        if(gbb1 == gbb2) {
            System.out.println("둘은 비겼습니다");
            // 1 == 가위
            // 2 == 바위
            // 3 == 보
        }else if(gbb1 == 1 && gbb2 == 2) {
            System.out.println(m2+"가 이겼습니다");
        }else if(gbb1 == 2 && gbb2 == 3) {
            System.out.println(m2+"가 이겼습니다");
        }else if(gbb1 == 3 && gbb2 == 1) {
            System.out.println(m2+"가 이겼습니다");
        }else {
            System.out.println(m1+"가 이겼습니다");
        }
    }
}
