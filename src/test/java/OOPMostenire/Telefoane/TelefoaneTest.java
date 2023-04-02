package OOPMostenire.Telefoane;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TelefoaneTest {

    @Test
    public void initiate(){
        /*List<String> camera=new ArrayList<>();
        camera.add("Auto focus");
        camera.add("Panorama");
        camera.add("HDR");
        camera.add("Slow motion");
        camera.add("Time-lapse");
        Samsung teleSamsung=new Samsung("Samsung","S 22",2023,4999.99,512,true,camera);
        teleSamsung.infoTelefoane();
        teleSamsung.infoSamsung();*/

        List<String> cameraIph=new ArrayList<>();
        cameraIph.add("Auto focus");
        cameraIph.add("Panorama");
        cameraIph.add("HDR");
        Iphone teleIphone=new Iphone("Iphone","14 PRO",2020,6599.99,1024,false,cameraIph);
        teleIphone.infoTelefoane();
        teleIphone.infoIphone();
        teleIphone.preturiAccesoriiIphone();



    }
}
