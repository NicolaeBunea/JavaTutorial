package Arrays;

import org.junit.Test;

public class TwoDimensionalArray {
    @Test
    public void execute(){
        twoDimArray();
    }


    public void twoDimArray(){

        Integer a[][]= new Integer[3][2];
        a[0][0]=10;
        a[0][1]=20;

        a[1][0]=30;
        a[1][1]=40;

        a[2][0]=50;
        a[2][1]=60;

        //classic for loop

        // for incrementing the rows
        /*for (Integer i=0;i<=2;i++){
            // for increment columns of each raw
            for (Integer j=0;j<=1;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }*/

        //for..each loop

        for (Integer i[]:a){
            for (Integer j:i){
                System.out.print(j+"|");
            }
            System.out.println();
        }

    }
}
