package UsefulCodes;

import java.util.HashMap;
import java.util.Map;

public class StringTests {

    public static void main(String arg[]){
        //Check the length of a list
        String []test={"a","b"};
        System.out.println(test.length);
        //Display the List
        System.out.println(test.toString());
        //You cant display it directly

        for (String var:test){
            System.out.println(var.toString());
        }

        Map<String,String> map = new HashMap<>();
        map.put("string1","a.b.c.d");
        System.out.println(map.toString());
        System.out.println(map.get("string1"));
        //Notice the slashes for .
        String[] val=map.get("string1").split("\\.");

        //How to display the last value
        String lastValue = val[val.length-1];
        System.out.println("lastValue is: "+lastValue );
    }
}
