package Loops;

import org.junit.Test;

public class WhileLoop {
    @Test
    public void Execute(){
    WhileExemple();
    }
    public Integer i=2;
    public void WhileExemple(){
        while (i<=10){
            System.out.println(i);
            i++;
            //i+=2;

        }
        System.out.println("Program executed");
    }
}
