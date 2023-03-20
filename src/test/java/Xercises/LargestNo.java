package Xercises;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LargestNo {

    public static void main(String[] args){
        Integer a;
        Integer b;
        Integer c;
        Integer largestNo = 0;

        Scanner console = new Scanner(System.in);

        System.out.println("Enter first number: ");
        a=console.nextInt();
        System.out.println("Enter Second number: ");
        b=console.nextInt();
        System.out.println("Enter Third number: ");
        c=console.nextInt();



        if ((a>b) && (a>c)){
            System.out.println(a);
            largestNo=a;
        } else if ((b>a) && (b>c)) {
            System.out.println(b);
            largestNo=b;
        } else {
            System.out.println(c);
            largestNo=c;
        }

        ArrayList<Integer> crescator= new ArrayList<Integer>();
        crescator.add(a);
        crescator.add(b);
        crescator.add(c);

        Collections.sort(crescator, Collections.reverseOrder());
        System.out.println("Cel mai mare numar este: "+largestNo);
        System.out.println("Numerele in ordine desc: "+crescator);

    }

}
