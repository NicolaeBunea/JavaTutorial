package Xercises.Constructor;

import java.util.ArrayList;
import java.util.List;

public class Masina {

    public String marca;
    public String model;
    public Integer an;
    public Integer usi;
    public Boolean lovit;
    public String transmisie;
    public Integer km;
    public Double consum;
    public List<String> dotariInterior;
    public List<String> dotariExterior;
    public List<Double> preturi;

    public Masina(String marca, String model, Integer an, Integer usi, Boolean lovit, String transmisie, Integer km, Double consum,
                  List<String> dotariInterior,List<String> dotariExterior) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.usi = usi;
        this.lovit = lovit;
        this.transmisie = transmisie;
        this.km = km;
        this.consum = consum;
        this.dotariInterior=dotariInterior;
        this.dotariExterior=dotariExterior;
    }

    public void displayMasina(){
        System.out.println("Marca masini este: "+marca);
        System.out.println("Modelul masini este: "+model);
        System.out.println("Anul masini este: "+an);
        System.out.println("Nr de usi: "+usi);
        System.out.println("Accidente: "+lovit);
        System.out.println("Transmisia masini este: "+transmisie);
        System.out.println("Nr de KM: "+km);
        System.out.println("Consum mixt: "+consum);
        /*System.out.println("Dotari Interior: "+dotariInterior);
        System.out.println("Dotari exterior: "+dotariExterior);*/
    }

    public void ListaDotari(String dotari){
        if (dotari.equals("interior") || dotari.equals("Interior")){
            System.out.println("Lista de dotari pentru interior este: ");
            printListaDotari(dotariInterior);
            printListaPreturiInterior();
        }
        if (dotari.equals("exterior") || dotari.equals("Exterior")){
            System.out.println("Lista de dotari pentru exterior este: ");
            printListaDotari(dotariExterior);
            printListaPreturiExterior();
        }
    }

    public void printListaDotari(List<String> dotari){
        for (Integer index=0; index< dotari.size();index++){
            System.out.println(dotari.get(index));
        }
    }
    public void printListaPreturiInterior(){
        List<Double> preturi=new ArrayList<>();
        preturi.add(150.99);
        preturi.add(200.00);
        preturi.add(550.50);
        System.out.println("Lista preturilor pe numarul de componente alese este: ");
        for (Integer i=0; i< preturi.size();i++){
            System.out.println(preturi.get(i));
        }
    }

    public void printListaPreturiExterior(){
        List<Double> preturi=new ArrayList<>();
        preturi.add(333.99);
        preturi.add(444.44);
        preturi.add(555.59);
        System.out.println("Lista preturilor pe numarul de componente alese este: ");
        for (Integer i=0; i< preturi.size();i++){
            System.out.println(preturi.get(i));
        }
    }


    public void calculPreturiDotari(String deCareDotari){
        List<Double> preturiInterior=new ArrayList<>();
        preturiInterior.add(150.99);
        preturiInterior.add(200.00);
        preturiInterior.add(550.50);
        if (deCareDotari.equals("interior") || deCareDotari.equals("Interior")){
            Double suma1=0.0;
            Integer nrElemente=dotariInterior.size();
            System.out.println("Numarul de dotari alese este: "+nrElemente);
            for (Integer i=0;i<=nrElemente && i<dotariInterior.size();i++){
                suma1+= preturiInterior.get(i);
            }
            System.out.println("Suma dotarilor Interioare este: "+suma1);
            }

        List<Double> preturiExterior=new ArrayList<>();
        preturiExterior.add(333.99);
        preturiExterior.add(444.44);
        preturiExterior.add(555.59);
        if (deCareDotari.equals("exterior") || deCareDotari.equals("Exterior")){
            Double suma2=0.0;
            Integer nrElemente=dotariExterior.size();
            System.out.println("Numarul de dotari alese este: "+nrElemente);
            for (Integer i=0;i<=nrElemente && i<dotariExterior.size();i++){
                suma2+= preturiExterior.get(i);
            }
            System.out.println("Suma dotarilor Exterior este: "+suma2);
        }
        }




        /*List<Double> preturi= new ArrayList<>();
        preturi.add(150.99);
        preturi.add(200.00);
        preturi.add(550.50);
        System.out.println("Lista de preturi in functie de numarul de dotari interioare: ");
        for (Integer v=0;v<preturi.size();v++){
            System.out.println(preturi.get(v));
        }*/

        /*for (Integer i=0;i<=dotariInterior.size();i++){
            switch (i=dotariInterior.size()){
                case 1:
                    System.out.println("Numarul de dotari este: "+ i);
                    System.out.println("Total suma pentru dotari= "+preturi.get(0));
                    break;
                case 2:
                    System.out.println("Numarul de dotari este: "+ i);
                    System.out.println("Total suma pentru dotari= "+preturi.get(1)+preturi.get(0));
                    break;
                case 3:
                    System.out.println("Numarul de dotari este: "+ i);
                    System.out.println("Total suma pentru dotari= "+preturi.get(2)+preturi.get(0)+preturi.get(1));
                    break;
        }

        }*/




    public void pretInterior(){
        for (Integer i=0;i<=dotariInterior.size();i++){
            if (i>=dotariInterior.size()){

            }
        }
    }

}
