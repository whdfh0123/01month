package silsup1;

import java.util.Scanner;

public class jo0129slsup {
    public static void main(String[] args) {
            jo0129med meso = new jo0129med();
//            meso.ran();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.print("숫자를 입력하세요 : ");
            int a = sc.nextInt();
            sum+=a;
            if (a==0){
                break;
            }
        }
        System.out.println(sum);



    }
}
