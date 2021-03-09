import java.util.*;

public class DictionaryDemo{
	
	private HashMap<String, String> hmap;

	public DictionaryDemo(){
		hmap = new HashMap<>();
		populateDictionary();
	}

	public static void main(String[] args){
		new DictionaryDemo().test();
	}

	public void test(){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your word : ");

		String word = sc.nextLine();


		if(findWord(word)){

			System.out.println("Word found");
			
		}else{

			System.out.println("Word not found ");

			System.out.println("Do you want to add this word in dictionary than type YES else Type NO !");

			String add = sc.nextLine();
			if(add.equals("YES")){
				System.out.println("add this word");
	
				hmap.put("name",word);
	
				for(Map.Entry m:hashMap.entrySet()){
		
					System.out.println(m.getKey()+":"+m.getValue());
				}
		}
	}

	public void printDictionary(){
		for(Map.Entry m:hashMap.entrySet()){
		
			System.out.println(m.getKey()+":"+m.getValue());
		}
	}

	public boolean findWord(String word){
		return hmap.containsValue(word);

	}

	public void populateDictionary(){
		hmap.put("Name1","Aman");
		hmap.put("Name2","Ayush");
		hmap.put("Name3","Amit");
		hmap.put("Name4","Rahul");
		hmap.put("Name5","Param");
		hmap.put("Name6","akhilesh");
		hmap.put("Name7","Chirag");
		hmap.put("Name8","Diya");		
		hmap.put("Name9","Rani");
		hmap.put("Name10","Pooja");
		hmap.put("Name11","Shiva");	
	}

}