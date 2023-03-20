package Xercises.DecisionStructures;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args){
        Integer number;

        Scanner console = new Scanner(System.in);
        System.out.println("Enter an intiger no: ");
        number= console.nextInt();

        if (number<0){
            number=-number;
        }
        System.out.println("Absolute value: "+number);
    }
}
