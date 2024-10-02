package com.samsung;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        boolean res = a % 2 == 0;
        System.out.println(res);
/*        int i = sc.nextInt();

        int res = a & ((1 << i) - 1);

        System.out.println(res);*/
/*        int i = sc.nextInt();

        int mask = ~((1 << i) - 1);

        int res = a & mask;

        System.out.println(res);*/
    }
}
