package Arrays;

import org.junit.Test;

public class ArrayExample2 {
    @Test
    public void Execute(){
    StringArray();
    }

    public void StringArray() {
        String a[] = new String[4];
        a[0] = "Bine";
        a[1] = " ai ";
        a[2] = " venit";
        a[3] = ".";

        //Lungime array
        System.out.println(a.length);

        for (String i:a){
            System.out.print(i);
        }
    }
}
