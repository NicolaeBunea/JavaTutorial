package Loops;

import org.junit.Test;

public class NameOfMonth {
    @Test
    public void Execute(){
    NameOfMonthExample();
    MeniuPage();
    }
    public Integer day=13;
    public Integer pageNo=3;
    public void NameOfMonthExample(){
    switch (day){
        case 1: System.out.println("Ian");
            break;
        case 2: System.out.println("Feb");
            break;
        case 3: System.out.println("Mar");
            break;
        case 4: System.out.println("Apr");
            break;
        case 5: System.out.println("Mai");
            break;
        case 6: System.out.println("Iunie");
            break;
        case 7: System.out.println("Iul");
            break;
        case 8: System.out.println("Aug");
            break;
        case 9: System.out.println("Sep");
            break;
        case 10: System.out.println("Oct");
            break;
        case 11: System.out.println("Nov");
            break;
        case 12: System.out.println("Dec");
            break;
        default:
            System.out.println("Ianuarie");
    }
    }
    public void MeniuPage(){
        switch (pageNo){
            case 1:
                System.out.println("Snitel de pui");
                break;
            case 2:
                System.out.println("Pizza");
                break;
            case 3:
                System.out.println("Tocana");
                break;
            case 4:
                System.out.println("Desert");
                break;
        }
    }
}
