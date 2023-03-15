package Loops;

import org.junit.Test;

public class DoWhileLoop {
    @Test
    public void Execute(){
    DoWhileExample();
    }
    public Integer i=0;


    public void DoWhileExample(){
        /*do {
            System.out.println(i);
            i++;
        }while (i<=10);*/

        do {
            System.out.println(i);
            i+=2;
        }while (i<=10);
    }

}
