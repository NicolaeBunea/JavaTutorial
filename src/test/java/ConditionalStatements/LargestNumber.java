package ConditionalStatements;

import org.junit.Test;

public class LargestNumber {
    @Test
    public void Executa(){
    LargestNoExample();
    }
    public Integer a=15;
    public Integer b=20;
    public Integer c=10;
    public void LargestNoExample(){
        if ((a>b) && (a>c)){
            System.out.println("a is largest= "+a);
        }
        else if ((b>a) &&(b>c)){
            System.out.println("b is largest= "+b);
        }
        else {
            System.out.println("c is largest= "+c);
        }

    }
}
