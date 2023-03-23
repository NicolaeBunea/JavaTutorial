package OOP;

public class Employee {


    public Integer empId;
    public String name;
    public Integer salary;
    public Integer departNo;

    public void display(){
        System.out.println("ID-ul este: "+empId);
        System.out.println("Numele este: "+name);
        System.out.println("Salariul este "+salary);
        System.out.println("No depart este: "+departNo);
    }

   /* public void setData(Integer id,String nume,Integer salar, Integer dep){
        empId = id;
        name = nume;
        salary = salar;
        departNo = dep;
    }*/
    public void printNumeAngajat(){
        System.out.println("Datele despre angajataul "+ name+ " sunt:");
    }
    public void spatiuIntreAngajati(){
        System.out.println();
    }

    public Employee(Integer empId, String name, Integer salary, Integer departNo) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.departNo = departNo;
    }
}
