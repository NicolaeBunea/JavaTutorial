package Xercises.DecisionStructures;

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args){
        Integer angle1;
        Integer angle2;
        Integer angle3;
        Integer sum;

        Scanner consola= new Scanner(System.in);
        System.out.println("Enter angle no 1: ");
        angle1= consola.nextInt();
        System.out.println("Enter angle no 2: ");
        angle2= consola.nextInt();
        System.out.println("Enter angle no 3: ");
        angle3= consola.nextInt();

        sum=angle1+angle2+angle3;
        if (sum==180){
            System.out.println("A triangle is valid when the sum of 3 angles is 180");
            System.out.println("Your sum is: "+sum);
            System.out.println("The triangle is valid");
        }else {
            System.out.println();
            System.out.println("A triangle is valid when the sum of 3 angles is 180");
            System.out.println("Your sum is: "+sum);
            System.out.println("The triangle is NOT valid");
        }

    }
}
