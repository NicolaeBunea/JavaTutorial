package OOPMostenire.Telefoane;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Iphone extends Telefoane{

    public Integer memorie;
    public Boolean NFC;
    public List<String> caractCamera;

    public Iphone(String marca, String model, Integer an, Double pret, Integer memorie, Boolean NFC, List<String> caractCamera) {
        super(marca, model, an, pret);
        this.memorie=memorie;
        this.NFC=NFC;
        this.caractCamera=caractCamera;
    }

    public void infoIphone(){
        System.out.println("Informatiile despre Iphone sunt: ");
        System.out.println("Memoria telefonuluieste de: "+memorie+" GB");
        System.out.println("Caracteristiciile camerei sunt: ");
        for (Integer i=0; i< caractCamera.size();i++){
            System.out.println(caractCamera.get(i));
        }
    }

    public void preturiAccesoriiIphone(){
        List<Double> pretIncarcator= new ArrayList<>();
        pretIncarcator.add(199.99);
        pretIncarcator.add(259.99);
        pretIncarcator.add(559.99);

        List<Double> pretCasti= new ArrayList<>();
        pretCasti.add(2999.99);
        pretCasti.add(3599.99);
        pretCasti.add(6599.99);

        List<Double> pretHusa= new ArrayList<>();
        pretHusa.add(19.99);
        pretHusa.add(69.99);
        pretHusa.add(129.99);

        HashMap<String,List<Double>> accesoriiPreturi = new HashMap<>();
        accesoriiPreturi.put("Incarcator",pretIncarcator);
        accesoriiPreturi.put("Casti", pretCasti);
        accesoriiPreturi.put("Husa",pretHusa);

        for (String key: accesoriiPreturi.keySet()){
            System.out.println("Accesoriile sunt: "+key);
            System.out.println("Preturile sunt: " +accesoriiPreturi.get(key));
        }
    }
}
