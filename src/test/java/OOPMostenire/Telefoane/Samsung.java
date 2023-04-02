package OOPMostenire.Telefoane;

import java.util.List;

public class Samsung extends Telefoane{
    public Integer memorie;
    public Boolean NFC;
    public List<String> caractCamera;

    public Samsung(String marca, String model, Integer an, Double pret, Integer memorie, Boolean NFC, List<String> caractCamera) {
        super(marca, model, an, pret);
        this.memorie=memorie;
        this.NFC=NFC;
        this.caractCamera=caractCamera;
    }

    public void infoSamsung(){
        System.out.println("Informatiile despre Samsung sunt:");
        System.out.println("Capacitate stocare: "+ memorie+ " GB");
        System.out.println("Are NFC?" + NFC);
        System.out.println("Caracteristiciile camerei sunt: ");
        for (Integer i=0; i<caractCamera.size();i++){
            System.out.println(caractCamera.get(i));
        }

    }


}
