import java.util.Scanner;

public class samsilsup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int j = (int)(Math.random()*1+1);
            for(;;){
                System.out.print("정수를 입력하세요 : " );
                int i = sc.nextInt();

                if(i<j){
                    System.out.println("입력하신 정수보다 큽니다");

                }else if(i>j){
                    System.out.println("입력하신 정수보다 작습니다");

                }else {
                    System.out.println("정답입니다 "+count+"회만에 정답을 맞추셨습니다");
                    break;
                }
                count++;
            }



    }
}
