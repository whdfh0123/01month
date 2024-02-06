package com.ohgiraffers.section04.sort;

public class silsup0201 {
    public static void main(String[] args) {
        int[] r = new int[]{1,2,3,4,5,6,7,8,9,10};

        int t;
        for(int i = 0; i<r.length; i++){
            int random = (int)(Math.random()*r.length);
            t = r[i];
            r[i] = r[random];
            r[random]=t;

        }

        for (int i = 0;i<r.length;i++){
            System.out.print(r[i]);
        }
    }
}
