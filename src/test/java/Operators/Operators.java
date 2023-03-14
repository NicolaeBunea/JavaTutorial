package Operators;

import org.junit.Test;

public class Operators {
    public Integer a=15;
    public Integer b=5;
    @Test
    public void RunMethods(){
        ArithOperators();
        RelaOperators();
        LogicOperators();
        AssignmentOperator();
    }
    //Arithmetic operators
    public void ArithOperators(){
        System.out.println("Arithmetic Operators");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
    //Relational operators
    //Return boolean values
    public void RelaOperators(){
        System.out.println("Relational operators");
        System.out.println("'a' este = "+a+" <> 'b' este = "+b);
        System.out.println(a<b);    //false
        System.out.println(a>b);    //true
        System.out.println(a<=b);   //false
        System.out.println(a>=b);   //true
        System.out.println(a==b);   //false
        System.out.println(a!=b);   //true
    }
    public Boolean x=true;
    public Boolean y=false;
    public void LogicOperators(){
        System.out.println("Logic Operators");
        System.out.println("'x' este = "+x+" <> 'y' este = "+y);
        System.out.println(x && y);     //false
        System.out.println(x || y);     //true
        System.out.println(!x);     //false
        System.out.println(!y);     //true
    }
    public Integer c;
    public void AssignmentOperator(){
        System.out.println("Operatori de atribuire");
        c=a;
        System.out.println(c);
        c=b;
        System.out.println(c);

        c=100;
        c/=10;
        //c-=15;
        //c+=5;
        //c++;
        //c--;
        System.out.println(c);
    }

}
