import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.*;

public class HashMapDemo{

	public static void main(String[] args) {
		

		HashMap<Integer,String> hmap = new HashMap<>();
		hmap.put(0, "hello");
		hmap.put(1, "Hii");
		hmap.put(2, "Hola");
		

		for(Map.Entry m:hmap.entrySet()){
			System.out.println("key : "+ m.getKey()+" Value: "+m.getValue());
		}

		// update vlue in hash map

		hmap.put(3,"Namaste");
		hmap.putIfAbsent(4,"RamRam");

		System.out.println("after update value");

		for(Map.Entry m:hmap.entrySet()){
			
			System.out.println("key : "+ m.getKey()+" Value: "+m.getValue());
		}

		// delete or remove data
		System.out.println("after remove data");
		hmap.remove(1);
		hmap.remove(3,"Namaste");

		for(Map.Entry m:hmap.entrySet()){
			System.out.println("key : "+ m.getKey()+" Value: "+m.getValue());
		}

		// replace data
		hmap.replace(4,"hhhhhh");

		for(Map.Entry m:hmap.entrySet()){
			System.out.println(m.getKey()+"  " +m.getValue());
		}

		// replace all data

		hmap.replaceAll((k,v)->"Hello");

		for(Map.Entry m:hmap.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}

		// search value
		if(hmap.containsKey(1)){
			
			
			System.out.println("data found: ");
		}
		else{
			System.out.println("data not found");
		}
	}


}
