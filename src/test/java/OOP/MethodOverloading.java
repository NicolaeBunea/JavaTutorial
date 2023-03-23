package OOP;

import org.junit.Test;

import java.security.PublicKey;

public class MethodOverloading {

    public Integer a;
    public Integer b;

    public void sum(){
        a=10;
        b=20;
        System.out.println(a+b);
    }

    public void sum(Integer x, Integer y){
        Integer a=x;
        Integer b=y;
        System.out.println(x+y);
    }

    public void sum(Integer x, Integer y, Integer z){
        System.out.println(x+y+z);
    }

    public void sum(Integer x, Double y){
        System.out.println(x+y);
    }


}
