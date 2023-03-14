package ConditionalStatements;

import org.junit.Test;

public class NestedIfCondition {

    public Integer day=9;

    @Test
    public void Execute(){
        IfConditon();
    }


    public void IfConditon(){
        if (day==1){
            System.out.println("Luni");
        }
        else if (day==2){
            System.out.println("Marti");
        }
        else if (day==3){
            System.out.println("Miercuri");
        }
        else if (day==4){
            System.out.println("Joi");
        }
        else if (day==5){
            System.out.println("Vineri");
        }
        else if (day==6){
            System.out.println("Sambata");
        }
        else if (day==7){
            System.out.println("Duminica");
        }
        else {
            System.out.println("Nu este o zi a saptamanii");
        }
    }
}
