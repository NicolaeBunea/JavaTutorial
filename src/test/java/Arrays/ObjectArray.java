package Arrays;

import org.junit.Test;

public class ObjectArray {
    @Test
    public void Excute(){
    ObjectExample();
    }

    public void ObjectExample(){
        Object a[]= new Object[5];
        a[0]=10;
        a[1]=20.5;
        a[2]="Welcome";
        a[3]='G';
        a[4]=true;

        Object a[]={100,234.453,"Welcome",'A',false,'B'};

        for (Object i:a){
            System.out.println(i);
        }


    }


}
