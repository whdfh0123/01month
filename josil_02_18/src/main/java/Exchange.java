import java.util.Scanner;

public class Exchange {
    Scanner sc = new Scanner(System.in);
    public Money[] mon = new Money[3];


        int wode; // 이벤트 참여 저장
        int chNum; // 환전 여부 저장
        int randomNum;
        int hM; // 얼마 환전할지
        int total; // 총 환전 금액
        double exrate;

    public void mainPage(){
        System.out.println("오늘의 환율 공시");
        mon[0] = new USD();
        mon[1] = new EUR();
        mon[2] = new AUD();

        for (Money i : mon){
            System.out.println(i);
        }
        while (true){
            System.out.println("랜덤 추가 환율우대 이벤트를 진행 중입니다 참여하시겠습니까");
            System.out.println("1.예 2.아니오");
            wode = sc.nextInt();
            sc.nextLine();
            if(wode==1){
                randomNum = (int)(Math.random()*5+1);
                System.out.println(randomNum);
                System.out.println("축하합니다 환율우대 "+randomNum+"% 더 받고 환전 가능합니다");
                System.out.println("환전 진행할까요?");
                System.out.println("1.예 2.아니오");
                chNum = sc.nextInt();
                sc.nextLine();
                if(chNum==1){
                    changeW();
                    break;
                }else if (chNum==2){
                    return;
                }

            }else if(wode==2){
                break;
            }else {
                System.out.println("다시 선택하세요");
            }
        }




    }
    public void changeW(){
        System.out.println("환전 종류를 선택해주세요");
        System.out.println("1.미국달라 / 2.유로 / 3.호주달라");
        int util = sc.nextInt();
        sc.nextLine();
        if(util>=1 || 3>=util){
            changego(util);
        }else {
            System.out.println("다시 선택");
        }

    }
    public void changego(int g){
        switch (g){
            case 1 :
                System.out.println("얼마를 환전할까요 : ");
                hM = sc.nextInt();
                sc.nextLine();
                if(hM<=((USD)mon[0]).getLimit() && hM>=5){
                    exrate = (((USD)mon[0]).getNotified()+
                            (((USD)mon[0]).getBuy()-((USD)mon[0]).getNotified())*(1-(((USD)mon[0]).rate)*0.01));
                    total = (int)(hM/exrate);
                    System.out.println(hM+"만원을 "+((((USD)mon[0]).rate)+randomNum)+"%우대받아 "+total+((USD)mon[0]).getUnit()+"로 환전했습니다");
                }else if(hM<5){
                    System.out.println("최소 금액은 5만원 입니다 자동 입력합니다");
                    hM = 5;
                    total = (int)(hM/(((USD)mon[0]).getNotified()+
                            (((USD)mon[0]).getBuy()-((USD)mon[0]).getNotified())*(1-(((USD)mon[0]).rate)*0.1)));
                    System.out.println(hM+"만원을 "+((((USD)mon[0]).rate)+randomNum)+"%우대받아 "+total+((USD)mon[0]).getUnit()+"로 환전했습니다");
                }else if(hM>((USD)mon[0]).getLimit()){
                    System.out.println("미국 달러의 한도는 "+((USD)mon[0]).getLimit()+"만원 입니다");
                    System.out.println("한도를 넘어 최대 금액으로 자동입력");
                    hM = ((USD)mon[0]).getLimit();
                    total = (int)(hM/(((USD)mon[0]).getNotified()+
                            (((USD)mon[0]).getBuy()-((USD)mon[0]).getNotified())*(1-(((USD)mon[0]).rate)*0.1)));
                    System.out.println(hM+"만원을 "+((((USD)mon[0]).rate)+randomNum)+"%우대받아 "+total+((USD)mon[0]).getUnit()+"로 환전했습니다");
                }
                break;
            case 2 : System.out.println("얼마를 환전할까요 : ");
                hM = sc.nextInt();
                sc.nextLine();
                if(hM<=((EUR)mon[1]).getLimit() && hM>=5){
                    total = (int)(hM/(((EUR)mon[1]).getNotified()+
                            (((EUR)mon[1]).getBuy()-((EUR)mon[1]).getNotified())*(1-(((EUR)mon[1]).rate)*0.1)));
                    System.out.println(hM+"만원을 "+((((EUR)mon[1]).rate)+randomNum)+"%우대받아 "+total+((EUR)mon[1]).getUnit()+"로 환전했습니다");
                }else if(hM<5){
                    System.out.println("최소 금액은 5만원 입니다 자동 입력합니다");
                    hM = 5;
                    total = (int)(hM/(((EUR)mon[1]).getNotified()+
                            (((EUR)mon[1]).getBuy()-((EUR)mon[1]).getNotified())*(1-(((EUR)mon[1]).rate)*0.1)));
                    System.out.println(hM+"만원을 "+((((EUR)mon[1]).rate)+randomNum)+"%우대받아 "+total+((EUR)mon[1]).getUnit()+"로 환전했습니다");
                }else if(hM>((EUR)mon[1]).getLimit()){
                    System.out.println("유로의 한도는 "+((EUR)mon[1]).getLimit()+"만원 입니다");
                    System.out.println("한도를 넘어 최대 금액으로 자동입력");
                    hM = ((EUR)mon[1]).getLimit();
                    total = (int)(hM/(((EUR)mon[1]).getNotified()+
                            (((EUR)mon[1]).getBuy()-((EUR)mon[1]).getNotified())*(1-(((EUR)mon[1]).rate)*0.1)));
                    System.out.println(hM+"만원을 "+((((EUR)mon[1]).rate)+randomNum)+"%우대받아 "+total+((EUR)mon[1]).getUnit()+"로 환전했습니다");
                }
                break;
            case 3 : System.out.println("얼마를 환전할까요 : ");
                hM = sc.nextInt();
                sc.nextLine();
                if(hM<=((AUD)mon[2]).getLimit() && hM>=5){
                    exrate = (((AUD)mon[2]).getNotified()+
                            (((AUD)mon[2]).getBuy()-((AUD)mon[2]).getNotified())*(1-(((AUD)mon[2]).rate)*0.01));
                    total = (int)(hM/exrate);
                    System.out.println(hM+"만원을 "+((((AUD)mon[2]).rate)+randomNum)+"%우대받아 "+total+((AUD)mon[2]).getUnit()+"로 환전했습니다");
                }else if(hM<5){
                    System.out.println("최소 금액은 5만원 입니다 자동 입력합니다");
                    hM = 5;
                    exrate = (((AUD)mon[2]).getNotified()+
                            (((AUD)mon[2]).getBuy()-((AUD)mon[2]).getNotified())*(1-(((AUD)mon[2]).rate)*0.01));
                    total = (int)(hM/exrate);
                    System.out.println(hM+"만원을 "+((((AUD)mon[2]).rate)+randomNum)+"%우대받아 "+total+((AUD)mon[2]).getUnit()+"로 환전했습니다");
                }else if(hM>((AUD)mon[2]).getLimit()){
                    System.out.println("호주 달러의 한도는 "+((AUD)mon[2]).getLimit()+"만원 입니다");
                    System.out.println("한도를 넘어 최대 금액으로 자동입력");
                    hM = ((AUD)mon[2]).getLimit();
                    System.out.println((((AUD)mon[2]).rate)*0.01);
                    exrate = (((AUD)mon[2]).getNotified()+
                            (((AUD)mon[2]).getBuy()-((AUD)mon[2]).getNotified())*(1-(((AUD)mon[2]).rate)*0.01));
                    total = (int)(hM/exrate);
                    System.out.println(hM+"만원을 "+((((AUD)mon[2]).rate)+randomNum)+"%우대받아 "+total+((AUD)mon[2]).getUnit()+"로 환전했습니다");
                }
                break;


        }
    }
    public int to(){
        this.total = (int)(hM/(((AUD)mon[2]).getNotified()+
                (((AUD)mon[2]).getBuy()-((AUD)mon[2]).getNotified())*(1-(((AUD)mon[2]).rate)*0.1)));
        return this.total;
    }
}
