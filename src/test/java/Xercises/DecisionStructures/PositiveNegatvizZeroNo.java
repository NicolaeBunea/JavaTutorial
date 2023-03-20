package Xercises.DecisionStructures;

import java.util.Scanner;

public class PositiveNegatvizZeroNo {
    public static void main(String[] args){

        Integer number;
        Scanner console = new Scanner(System.in);

        System.out.println("Enter a number: ");
        number= console.nextInt();

        if (number>0){
            System.out.println("The number is pozitive. Your number: "+number);
        } else if (number<0) {
            System.out.println("The number is negativ. Your number: "+number);
        } else{
            System.out.println("The number is 0");
        }

    }
}
