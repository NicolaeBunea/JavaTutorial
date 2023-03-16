package ConditionalStatements;

import org.junit.Test;

public class Swapping {
    @Test
    public void Execute(){
    SwappingExample();
    }

    public Integer a=10;
    public Integer b=20;
    public Integer c;

    public void SwappingExample(){
        System.out.println("value of a is before swapping: "+a);
        System.out.println("value of b is before swapping: "+b);

        c=a;
        a=b;
        b=c;

        System.out.println("value of a is after swapping: "+a);
        System.out.println("value of b is after swapping: "+b);
    }
}
