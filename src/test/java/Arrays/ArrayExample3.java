package Arrays;

import org.junit.Test;

public class ArrayExample3 {
    @Test
    public void Excute(){
        SingleDimensionArray();
    }


    public void SingleDimensionArray() {
        Integer[] a = {100, 200, 300, 400, 500};

        Integer sum=0;
        for (Integer i : a) {
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
