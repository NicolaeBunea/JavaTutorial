package Loops;

import org.junit.Test;

public class BreakStatement {
    @Test
    public void Execute(){
    ForEachExample();
    }
    public Integer i=1;
    public void ForEachExample(){
        for (i=1;i<=10;i++){
            if (i==5){
                break;
            }
            System.out.println(i);
        }
    }

}
