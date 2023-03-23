package OOP;

public class ConstructorOverloading {

    public Integer a=0;
    public Integer b=0;
    public Double c=0.0;

    public ConstructorOverloading() {
        a=10;
        b=20;
        c=20.5;
    }

    public ConstructorOverloading(Integer a, Integer b) {
        this.a=a;
        this.b=b;
    }

    public ConstructorOverloading(Integer a, Double c) {
        this.a=a;
        this.c=c;
    }

    public ConstructorOverloading(Integer a, Integer b, Double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
