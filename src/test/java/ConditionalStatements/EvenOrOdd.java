package ConditionalStatements;

import org.junit.Test;

public class EvenOrOdd {
    @Test
    public void Execute(){
    EvenOrOddExample();
    }
    public Integer number =11;
    public void EvenOrOddExample(){
        if (number%2==0){
            System.out.println("even no. Care este: "+number);
        }
        else {
            System.out.println("odd no. Care este: "+number);
        }
    }
}
