package OOPMostenire.Banca;

import org.junit.Test;

public class BankTest {

    @Test
    public void ExecuteBank(){
        Bank banca=new BT();
        System.out.println(banca.getRateOfInterest()); //10

    }
}
