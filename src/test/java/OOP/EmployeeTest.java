package OOP;

import org.junit.Test;

public class EmployeeTest {

    @Test
    public void OOPTest(){
   /* Employee emp1= new Employee(101,"Mircea",2000,10);
    emp1.printNumeAngajat();
    emp1.display();
    emp1.spatiuIntreAngajati();
    Employee emp2= new Employee(203,"George",3000,20);
    emp2.printNumeAngajat();
    emp2.display();
    emp2.spatiuIntreAngajati();*/

   /* Calculation cal=new Calculation();
    cal.a=100;
    cal.b=200;
    cal.sum();
    cal.sum1(200,300);
    Integer r=cal.sum3();
        System.out.println(r);*/



        /*Employee emp1=new Employee();
        emp1.setData(101,"Oana",3000,123);
        emp1.display();*/

       /* Employee emp1= new Employee();
        emp1.name="Virgil";
        emp1.empId=1011;
        emp1.display();*/

        /*//Metoda overloading
        MethodOverloading metoda=new MethodOverloading();
        metoda.sum();
        metoda.sum(100,200);
        metoda.sum(10,20,30);
        metoda.sum(100,20.5);*/

        //Constructor overloading
        /*ConstructorOverloading constructor=new ConstructorOverloading();
        ConstructorOverloading constructor=new ConstructorOverloading(10,20);
        ConstructorOverloading constructor=new ConstructorOverloading(100,200,200.5);*/
        ConstructorOverloading constructor=new ConstructorOverloading(150,1.5);
        constructor.display();
    }
}
