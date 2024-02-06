package silsup2;

public class samsilsup22 {
    public static void main(String[] args) {
        // 3번
        int[] loto = new int[6];
        int trme = 0;
        for(int i = 0; i < loto.length; i++) {
            int rdNum = (int)(Math.random()*45+1);
                loto[i] = rdNum;
                for (int j = 0; j <i; j++){
                    if(loto[i]==loto[j]){
                        i--;
                    }
                }
        }
        for(int i = 1; i<loto.length; i++) {
            for(int j = 0; j <i; j++) {
                if(loto[i] < loto[j]) {
                    trme = loto[i];
                    loto[i] = loto[j];
                    loto[j] = trme;
                }

            }
        }

        for(int i = 0; i < loto.length; i++) {
            System.out.print(loto[i]+"\t");
        }
    }
}
