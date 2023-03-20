package Xercises.DecisionStructures;

import java.util.Scanner;

public class MeaningOfGrade {
    public static void main(String[] args){

        Character grade;

        Scanner console = new Scanner(System.in);

        System.out.println("Enter a grade between (A,B,C,D,E,F): ");
        grade=console.next().charAt(0);

        switch (grade){
            case 'A': System.out.println("Excelent");
                break;
            case 'B': System.out.println("Good");
            break;
            case 'C': System.out.println("Average");
            break;
            case 'E': System.out.println("Deficent");
                break;
            case 'F': System.out.println("Failing");
                break;
            default:
                System.out.println("This is not a grade");
        }


    }
}
