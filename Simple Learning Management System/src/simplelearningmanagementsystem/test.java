package simplelearningmanagementsystem;

import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.ArrayList;
 


public class test {
      public static void main(String[] args) {
                JSONObject jObject = new JSONObject();
                JSONArray array1 = new JSONArray();
                array1.add(1);
                array1.add(2);
                array1.add(3);
//                jObject.put("1,", array1);
                JSONArray array2 = new JSONArray();
                array2.add(2);
                array2.add(4);
                array2.add(5);
//                jObject.put("2,", array2);
                JSONArray array3 = new JSONArray();
                array3.add(6);
                array3.add(5);
                array3.add(7);
                 JSONArray arrayall;
        
                jObject.put(array1+"\n"+array2+"\n"+array3, args);
//                jObject.put("3,", array3);
//                System.out.println("\n"+jObject);
System.out.println(array1+"\n"+array2+"\n"+array3);
      }
          
}
