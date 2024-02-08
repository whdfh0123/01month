package com.ogiraffers.section02.string;

public class Application1 {
    public static void main(String[] args) {
    /*charAt() : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환한다
    인덱스를 벗어난 정수를 인자로 전달하는 경우 IndexOutOfBoundsExeception이 발생한다

     */
    String str1 = "apple";

    for(int i = 0; i<str1.length();i++){
        System.out.println("chaAt("+i+") : "+str1.charAt(i));
    }
//     compareTo() : 인자로 전달된 문자열과 사전 순으로 비교를 하여
//        두 문자열이 같다면 0을 반환, 인자로 전달된 문자열버다 작으면 음수를 크면 양수를 반환한다
//        단 이 메소드는 대소문잘 구분하여 비교한다
        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";
        System.out.println("compareTO() : "+(str2.compareTo(str3)));
        // 대문자와 소문자는 32만큼 차이가 난다
        System.out.println("compareTO() : "+(str2.compareTo(str4)));
        System.out.println("compareTO() : "+(str4.compareTo(str2)));

        System.out.println("compareTO() : "+(str2.compareTo(str5)));
        System.out.println("compareTO() : "+(str4.compareTo(str5)));

        // compareToIgnareCase() : 대소문자를 구분하지 않고 비교한다
        System.out.println("compareToIgnareCase() : "+str3.compareToIgnoreCase(str4));

        // concat():문자열에 인자로 전달된 문자열을 합치기해서 새로운 문자열을 반환한다
        // 원본 문자열에는 영향을 주지 않는다
        System.out.println("concat() : "+str2.concat(str5));
        System.out.println("str2 : "+str2);

        // indexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인뎃 위치를 정수형으로 반환한다
        // 단 일치하지 않는 문자는 -1을 반환한다
        String indexof = "java oracle";
        System.out.println("indexof('a') : "+indexof.indexOf('a'));
        System.out.println("indexof('b') : "+indexof.indexOf('b'));
        //trim() : 문자열의 앞 듸에 공백을 제거한 문자여을 반환하다
        String trimStr = "  java  ";
        System.out.println("trimSte : #"+trimStr+"#");
        System.out.println("trimSte : #"+trimStr+"#");

        // toLowerCase() :모든 문자를 대문자로 변환시틴다
        // toUpwerCase() :모든 문자를 대문자로 변환시틴다
        String caseStr = "javaOracle";
        System.out.println("toLowerCase() :"+caseStr.toLowerCase());
        System.out.println("toLowerCase() :"+caseStr.toUpperCase());

        //substring() : 문자열의 일부분을 잘라내어 새로운 문자열을 반환한다

        String javamusql = "javamysql";
        System.out.println("substring(3,6) : "+javamusql.substring(3,6));
        System.out.println("substring(3) : "+javamusql.substring(3));

        //replace() : 문장열에서 대체할 문자열려 기존 문자열을 변경해서 반환한다
        System.out.println("replace() : "  +javamusql.replace("java","python"));

//        iength() : 믄지열의 길이를 정수형으로 반환한다
        System.out.println("length() : "+javamusql.length());
        System.out.println("빈 문자열의 길이 : "+ ("".length()));

        //isEmpty() : 문자열의 길이가 0이면  true를 반환 아니면 faulse 반환
        // 길이가 0인 문자열은 null과 다르다
        System.out.println("isEmpth() : "+"".isEmpty());
        System.out.println("isEmpty() : "+"abc".isEmpty());

        String s = ""; // 그냥 빈거 가능
//        char c = ''; // 빈거 불가능 (스페이스바도 안한상태)
    }
}
