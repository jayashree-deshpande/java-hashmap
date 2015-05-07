import java.util.HashMap;
import java.util.Set;

public class HashMapIterate {
	public static void main(String[] args)
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("one", "first");
		hm.put("two", "second;");
		hm.put("three", "third");
		hm.put("four", "fourth");
		hm.put("five", "fifth");
		
		Set<String> keys = hm.keySet();
		for(String key : keys)
		{
			 System.out.println("Value of "+key+" is: "+hm.get(key)); 
		}
	}
}
