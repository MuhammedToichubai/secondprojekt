package com.company;

import java.util.Scanner;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner num = new Scanner(System.in);
        float first, second, third, result;
        System.out.println("Enter first num:");
        first = num.nextFloat();
        System.out.println("Enter second num:");
        second = num.nextFloat();
        System.out.println("Enter third num:");
        third = num.nextFloat();
        result = first+ second+ third;
        System.out.println("Result is - " + result);
        result = first* second* third;
        System.out.println("Result is - " + result);
        result = first+ second+ third;
        result = result / 3 ;
        System.out.println("Result is - " + result);


        /*System.out.println("Азамат ");
        System.out.println("\t\t ойногону ");
        System.out.println("\t\t\t\t кетти");*/

//        byte muhammed1 = -128;
//        byte muhammed2 = 127;
//
//        long longSan1 = -9223372036854775808l;
//        long longSan2 = 9223372036854775807l;
//        long longSan3 = longSan1;
//
//        System.out.println("%d %d,muhammed1,longSan1 ");
//
//
//        boolean bool1 =true;
//        boolean bool2 =false;
//        boolean bool3 =bool1;
//        bool1 = false;
//
//        System.out.println(muhammed1+muhammed2);

    }
}
