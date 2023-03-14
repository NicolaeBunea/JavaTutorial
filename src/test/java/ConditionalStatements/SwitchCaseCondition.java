package ConditionalStatements;

import org.junit.Test;

public class SwitchCaseCondition {
    @Test
    public void Execute(){
    SwitchCase();
    }

    public Integer day=10;
    public void SwitchCase(){
        switch (day){
            case 1: System.out.println("Luni");
                break;
            case 2: System.out.println("Marti");
                break;
            case 3: System.out.println("Miercuri");
                break;
            case 4: System.out.println("Joi");
                break;
            case 5: System.out.println("Vineri");
                break;
            case 6: System.out.println("Sambata");
                break;
            case 7: System.out.println("Duminica");
                break;
            default: System.out.println("Nu exista o zi din saptamna");

        }
    }
}
