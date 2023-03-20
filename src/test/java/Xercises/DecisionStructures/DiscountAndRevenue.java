package Xercises.DecisionStructures;

import java.util.Scanner;

public class DiscountAndRevenue {
    public static void main(String[] asrg){
        Integer price;
        Integer quantity;
        Integer revenue;
        Double discount;
        Double procent=0.1;
        Double procentNO;

        Scanner console = new Scanner(System.in);

        System.out.println("Enter the Price:");
        price=console.nextInt();
        System.out.println("Enter the Quantity");
        quantity=console.nextInt();

        revenue=price*quantity;

        if (revenue>5000){
            discount=revenue-(revenue*procent);
            procentNO=procent*100;
            System.out.println("Revenue is: "+revenue);
            System.out.println("You exceed 5000 credit revenue, for that we offer "+procentNO+"% discount");
            System.out.println("Net revenue with " +procentNO+"%  discount is: "+discount);

        } else {
            System.out.println("Revenue is: "+revenue);
        }
    }
}
