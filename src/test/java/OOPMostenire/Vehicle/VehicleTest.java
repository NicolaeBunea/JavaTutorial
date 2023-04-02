package OOPMostenire.Vehicle;

import org.junit.Test;

public class VehicleTest {
    @Test
    public void ExecuteVehicle(){
        Vehicle vobj=new Vehicle();
        vobj.run();

        Bike bobj=new Bike();
        bobj.run();
    }
}
