package Arrays;

import org.junit.Test;

public class ArrayExample1 {
    @Test
    public void Excute(){
        SingleDimensionArray();
    }


    public void SingleDimensionArray(){
        Integer[] a= new Integer[10];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;

       /* for (Integer i=0;i<=4;i++){
            System.out.println(a[i]);
        }*/
        //for each loop
        for (Integer i:a){
            System.out.println(i);
        }
    }
}
