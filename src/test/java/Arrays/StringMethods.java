package Arrays;

import Base.BaseTest;
import org.junit.Test;

public class StringMethods{

    public String s="Welcome";
    public void StringExample(){

        //lungime string
        System.out.println(s.length());

        //Concatenation
        String s1="welcome to";
        String s2=" world";
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));

        //Equals
        String s3="WELCOME";
        String s4="welcome";

        System.out.println(s3.equals(s4));//false

        System.out.println(s3.equalsIgnoreCase(s4));//true

        //Contains

        System.out.println(s3.contains("LC")); //true

        //Substring
        //substring(starting index, ending index)
        //0 1 2 3 4 5 6 --->starting index
        //W E L C O M E
        //1 2 3 4 5 6 7 --->ending index

        System.out.println(s3.substring(0,3));
        System.out.println(s3.substring(4,7));

        //Replace
        System.out.println(s3.replace('e','A'));

    }
}
