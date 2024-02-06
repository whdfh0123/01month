package silsup2;

public class joplant {
    private int pHp = 50;
    private boolean wAndee;
    private boolean sAndee;
    int showHp;

    public void water() {
        if(wAndee) {
            System.out.println("물을 너무 많이 줘서 감소");
            this.pHp = pHp-10;
            System.out.println("현재 HP : "+pHp);
        }else {
            System.out.println("물을 좋아합니다");
            this.pHp = pHp+10;
            System.out.println("현재 HP : "+pHp);
            wAndee = true;
            sAndee = false;
        }

    }
    public void sunPl() {
        if(sAndee) {
            System.out.println("햇빛을 너무 많이 줘서 감소");
            this.pHp = pHp-10;
            System.out.println("현재 HP : "+pHp);
        }else {
            System.out.println("햇빛을 좋아합니다");
            this.pHp = pHp+10;
            System.out.println("현재 HP : "+pHp);
            sAndee = true;
            wAndee = false;
        }

    }
    public int shmePhp(){
        return pHp;
    }
}
