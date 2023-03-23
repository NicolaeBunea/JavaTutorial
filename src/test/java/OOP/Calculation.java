package OOP;

public class Calculation {

    public Integer a;
    public Integer b;

    //Metoda nu ia parametrii
    public void sum(){
        System.out.println(a+b);
    }


    //Metoda ia parametrii
    public void sum1(Integer x, Integer y){
        a=x;
        b=y;
        System.out.println(a+b);
    }

    public Integer sum3(){

        return(a+b);
    }

    /*public Integer sum4(){

    }*/

}
