import java.util.Scanner;

public class jo2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = "id";
        String pw = "pw";
        int smy = 0;
        int carNum = 0;
        String juso = "juso";
        pd[] pdL = new pd[5];
        pd[] jangBa = new pd[5];
        {
            pdL[0] = new pd("유가원 유기농 구운 아몬드","식품",26000);
            pdL[1] = new pd("요기쏘 고양이 캣닢 케이크 인형","반려동물 용품",20000);
            pdL[2] = new pd("마켓비 책상","가구",57000);
            pdL[3] = new pd("쿠쿠 에어프라이어","주방 용품",70000);
            pdL[4] = new pd("아이깨끗해 핸드워시","생활 용품",17000);
        }

        System.out.println("안녕하세요! 신규 회원이신가요?");
        System.out.println("회원가입 후 사용 가능합니다!");
        System.out.println("회원가입을 하시려면 1번, 프로그램을 종료하시려면 2번을 입력하세요");
        int mnum = sc.nextInt();
        sc.nextLine();
        if(mnum==1) {
            System.out.println("아이디를 입력해주세요");
            id = sc.nextLine();

            System.out.println("비밀번호를 입력해 주세요");
            pw = sc.nextLine();
            System.out.println("회원가입 완료했습니다. 환영합니다.");

        }else if(mnum==2) {
            return;
        }
        while(true) {
            System.out.println("원하는 메뉴를 선택해 주세요.\r\n"
                    + "0번 : 로그아웃\r\n"
                    + "1번 : 마이페이지\r\n"
                    + "2번 : 카테고리\r\n"
                    + "3번 : 상품 검색\r\n"
                    + "4번 : 장바구니");
            mnum = sc.nextInt();
            sc.nextLine();
            for(;;) {
                // 로그 아웃
                if(mnum==0) {
                    return;
                }else if(mnum==1) {

                    // 마이페이지
                    System.out.println("고객님의 마이페이지 입니다.\r\n"
                            + "고객님의 아이디 : "+id+"\r\n"
                            + "고객님의 비밀번호 : "+pw+"\r\n"
                            + "고객님의 쇼핑머니 잔액 : "+smy);
                    if(juso=="juso") {
                        System.out.println("등록된 배송지가 없습니다. 배송지를 등록해 주세요.");
                    }else if(juso!="juso") {
                        System.out.println("현재배송지 : "+juso);
                    }

                    System.out.println("보유 쿠폰 목록 : [가입 축하 쿠폰]");
                    System.out.println("원하는 메뉴를 선택해 주세요\r\n"
                            + "0번 : 메인 메뉴로 가기\r\n"
                            + "1번 : 배송지 등록\r\n"
                            + "2번 : 쇼핑머니 충전");
                    mnum = sc.nextInt();
                    sc.nextLine();
                    if(mnum==0) {
                        break;
                    }else if(mnum==1) {
                        System.out.println("배송지를 입력하세요");
                        juso = sc.nextLine();


                    }else if(mnum==2) {
                        System.out.println("얼마를 충전할까요");
                        smy = smy+sc.nextInt();
                        sc.nextLine();
                        System.out.println("현재 보유액 : "+smy);

                    }

                }else if(mnum==2) {
                    // 카테고리
//                    for (;;){
                        System.out.println("카테고리를 선택해 주세요.\r\n"
                                + "0번 : 메인 메뉴로 가기\r\n"
                                + "1번 : 식품\r\n"
                                + "2번 : 가구\r\n"
                                + "3번 : 주방용품\r\n"
                                + "4번 : 생활용품\r\n"
                                + "5번 : 반려동물 용품");
                    carNum = sc.nextInt();
                        sc.nextLine();
                        if(carNum==0) {
                            break;
                        }else if(carNum==1) {

                            for(int i = 0; i < pdL.length; i++){
                                if(pdL[i].getS().contains("식품")){
                                    System.out.println(pdL[i]);
                                }

                            }
                        }else if(carNum==2) {

                            for(int i = 0; i < pdL.length; i++){
                                if(pdL[i].getS().contains("가구")){
                                    System.out.println(pdL[i]);
                                }

                            }
                        }else if(carNum==3) {

                            for(int i = 0; i < pdL.length; i++){
                                if(pdL[i].getS().contains("주방 용품")){
                                    System.out.println(pdL[i]);
                                }

                            }
                        }else if(carNum==4) {

                            for(int i = 0; i < pdL.length; i++){
                                if(pdL[i].getS().contains("생활 용품")){
                                    System.out.println(pdL[i]);
                                }

                            }
                        }else if(carNum==5) {

                            for(int i = 0; i < pdL.length; i++){
                                if(pdL[i].getS().contains("반려동물 용품")){
                                    System.out.println(pdL[i]);
                                }

                            }

                    }

//                    }


                }else if(mnum==3){
                    System.out.println("검색 키워드를 입력하세요 : ");
                    String str = sc.nextLine();
                    for(int i = 0; i < pdL.length; i++){
                        if(pdL[i].getS().contains(str)||pdL[i].getN().contains(str)){
                            System.out.println(pdL[i]);
                        }

                    }break;
                } else if (mnum==4) {
                    System.out.println("총 가격은 입니다 구매하시겠습니까?");
                    System.out.println("1. 예  2. 아니오");
                }


            }

        }
    }
}
