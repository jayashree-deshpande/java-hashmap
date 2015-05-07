import java.util.HashMap;

public class BasicHashMap {
	public static void main(String[] args)
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("one", "first");
		hm.put("two", "second;");
		hm.put("three", "third");
		hm.put("four", "fourth");
		hm.put("five", "fifth");
		
		//getting value for the given key from hashmap
		System.out.println("value of key 'three' is: "+hm.get("three"));
		System.out.println("Is HashMap empty? "+hm.isEmpty());
		System.out.println("value before remove operation"+ hm);
		hm.remove("two");
		System.out.println("value after remove"+ hm);
	}
}
