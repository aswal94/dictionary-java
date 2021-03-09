import java.util.*;

public class DictionaryDemo{
	
	public static void main(String[] args){
		
		HashMap<String, String> hmap = new HashMap<>();

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
		

		new DictionaryDemo().findWord(hmap);
	

	}

	public void findWord(HashMap<String,String> hashMap){

		for(Map.Entry m:hashMap.entrySet()){
		
			System.out.println(m.getKey()+":"+m.getValue());
		}

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your word : ");

		String str = sc.nextLine();

		if(hashMap.containsValue(str)){

			System.out.println("Word found");		

		}else{
		
			System.out.println("Word not found ");
		
			System.out.println("Do you want to add this word in dictionary than type YES else Type NO !");

			String add = sc.nextLine();

			if(add.equals("YES")){

				System.out.println("add this word");

				hashMap.put("name",str);

				for(Map.Entry m:hashMap.entrySet()){
		
					System.out.println(m.getKey()+":"+m.getValue());
				}

			}else{
				System.out.println("dont add this word");	
			}

		}

	}

}