import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
 
public class EntrySetFromHashMap{
 
    public static void main(String a[]){
        HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "one");
        hm.put("second", "two");
        hm.put("third","three");
        hm.put("fourth","four");
        hm.put("fifth","five");
        
        System.out.println(hm);
        //getting value for the given key from hashmap
        Set<Entry<String, String>> entires = hm.entrySet();
        for(Entry<String,String> ent:entires){
            System.out.println(ent.getKey()+" ==> "+ent.getValue());
        }
    }
}
