package OOPMostenire.Telefoane;

import org.junit.Test;

import java.util.List;

public class Telefoane {

    public String marca;
    public String model;
    public Integer an;
    public Double pret;


    public Telefoane(String marca, String model, Integer an, Double pret) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.pret = pret;
    }

    public void infoTelefoane (){
        System.out.println("Numele telefonului este: " +marca);
        System.out.println("Modelul telefonului este: " +model);
        System.out.println("Anul telefonului este: " +an);
        System.out.println("Pretul telefonului este: " +pret+" lei");
    }
}
