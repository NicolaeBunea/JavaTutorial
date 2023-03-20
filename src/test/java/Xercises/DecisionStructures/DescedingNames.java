package Xercises.DecisionStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DescedingNames {
    public static void main(String[] args){
        String name1;
        String name2;
        String name3;

        Scanner console = new Scanner(System.in);
        System.out.println("Enter First name: ");
        name1=console.next();
        System.out.println("Enter Second name: ");
        name2=console.next();
        System.out.println("Enter Third name: ");
        name3=console.next();

        ArrayList<String> descrresc = new ArrayList<String>();
        descrresc.add(name1);
        descrresc.add(name2);
        descrresc.add(name3);

        Collections.sort(descrresc);

        for (String s:descrresc){
            System.out.println(s);
        }
    }
}
