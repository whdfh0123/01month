package silsup1.jo0216;

import java.util.HashMap;

public class Application {
    public static void main(String[] args) {

        HashMap map1 = new HashMap();
        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");
        map1.put(4,"C");
        System.out.println(map1.size());
        int rm = (int)((Math.random()*4)+1);
        int r1 = (int)((Math.random()*3)+1);
        String s = (String) map1.get(rm);
        System.out.println(s);
        HashMap map2 = new HashMap();
        map2.put(s, r1);
//        map2.put()
    }

}
