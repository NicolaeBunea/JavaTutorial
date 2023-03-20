package Xercises.DecisionStructures;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Double matematica;
        Double engleza;
        Double romana;
        Double average;
        DecimalFormat df= new DecimalFormat("#.##");
        Character grade=0;

        Scanner consola= new Scanner(System.in);
        System.out.println("Introdu nota la Matematica: ");
        matematica=consola.nextDouble();
        System.out.println("Introdu nota la Engleza: ");
        engleza=consola.nextDouble();
        System.out.println("Introdu nota la Romana: ");
        romana=consola.nextDouble();

        average=(matematica+engleza+romana)/3;

        if ((average>=90) && (average<=100)){
            grade='A';
        } else if ((average>=80) && (average<=89)){
            grade='B';
        }else if ((average>=70) && (average<=79)){
            grade='C';
        }else if ((average>=60) && (average<=69)){
            grade='D';
        }else {
            grade='F';
        }
        System.out.println("Your average grade is: "+df.format(average));
        System.out.println("Your final grade is: "+grade);

        switch (grade){
            case 'A': System.out.println("This grade is between 90-100 ");
                break;
            case 'B': System.out.println("This grade is between 80-89 ");
                break;
            case 'C': System.out.println("This grade is between 70-79 ");
                break;
            case 'D': System.out.println("This grade is between 60-69 ");
                break;
            case 'F': System.out.println("This grade is between 0-59 ");
                break;
            default: System.out.println("Invalid value");
        }
    }


}
