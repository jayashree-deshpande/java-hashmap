import java.util.HashMap;
import java.util.Set;
 
public class GetHashMapKeys {
     
    public static void main(String a[]){
        HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "one");
        hm.put("second", "two");
        hm.put("third","three");
        hm.put("fourth","four");
        hm.put("fifth","five");
        System.out.println("the hash map is "+hm);
        Set<String> keys = hm.keySet();
        for(String key: keys){
            System.out.println(key);
        }
    }
}
