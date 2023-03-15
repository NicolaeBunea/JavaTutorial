package Loops;

import org.junit.Test;

public class ContinueStatement {
    @Test
    public void Execute(){
    ContinueExample();
    }
    public Integer i=1;
    public void ContinueExample(){
        for (i=1;i<=10;i++){
            if (i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
