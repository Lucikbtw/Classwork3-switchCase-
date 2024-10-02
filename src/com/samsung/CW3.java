package com.samsung;

import java.util.Scanner;

public class CW3 {

    public static void main(String[] args) {

    /*int age =16;
    boolean isTicket = false;
    boolean isVIP = true;
    if(age > 18 && (isTicket || isVIP){
        System.out.println("Проходите");
    }
    else System.out.println("Разворот");
*/
        /*int age = 16;
        System.out.println(age >= 18 ? "СВ" : "НС");
        boolean isAdult = age >= 18 ? true : false;*/

        Scanner sc = new Scanner(System.in);


        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Некоректно");
        }

    }

}
