package Xercises.DecisionStructures;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args){

        Integer number;
        Scanner console = new Scanner(System.in);
        System.out.println("Insert an integer no: ");
        number=console.nextInt();

        if (number % 2==0){
            System.out.println("Your number is: "+number);
            System.out.println("The number is even");
        }else {
            System.out.println("Your number is: "+number);
            System.out.println("The number is odd");
        }
    }
}
