import java.util.HashMap;
 
public class HashMapClear {
    public static void main(String a[]){
        HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "one");
        hm.put("second", "two");
        hm.put("third","three");
        
        System.out.println("My HashMap content:");
        System.out.println(hm);
        
        System.out.println("Clearing HashMap:");
        hm.clear();
        
        System.out.println("Content After clear:");
        System.out.println(hm);
    }
}
