package Xercises.Constructor;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MasinaTest {

    @Test
    public void test(){


        List<String> dotariInteriorMazda= new ArrayList<>();
        dotariInteriorMazda.add("Boxe");
        dotariInteriorMazda.add("Volan");
        dotariInteriorMazda.add("caruta");

        List<String> dotariExteriorMazda= new ArrayList<>();
        dotariExteriorMazda.add("Roti");
        dotariExteriorMazda.add("Vopsea");
        dotariExteriorMazda.add("Xenon");

        Masina mazda= new Masina("Mazda","CX-5",2019,4,false,"Automata",150_000,6.8,dotariInteriorMazda,dotariExteriorMazda);
        mazda.displayMasina();
        mazda.ListaDotari("interior");
        mazda.calculPreturiDotari("Exterior");

    }
}
