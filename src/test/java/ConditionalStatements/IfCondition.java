package ConditionalStatements;

import org.junit.Test;

public class IfCondition {
    @Test
    public void Execute(){
        SimpleCondition();
        NestedIfCondition();

    }
    public Integer age=19;
    public void SimpleCondition(){
        if (age>=18){
            System.out.println("Are drept de vot");
        }
        else {
            System.out.println("Nu are drept de vot");
        }
        System.out.println("A iesit din IF");
    }
    public Boolean permis=true;
    public Double inaltime=1.80;
    public void NestedIfCondition(){
        System.out.println("Neste Condition");
        if (age>=18){
            System.out.println("Are drept de vot");
        }
        else if(permis=true && age>=20){
            System.out.println("Poate sa conduca si masina");
        }
        else if (inaltime>=1.80){
            System.out.println("Are voie si motor");
        }
        else {
            System.out.println("!!Pieton!!");
        }
    }
}
