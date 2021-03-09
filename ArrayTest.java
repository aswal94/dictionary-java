import java.util.*;

class ArrayTest{

	public static void main(String[] args){
		
 		int array[]= {3,5,4,7};
		list(array);

   		ArrayList<String> a = new ArrayList<String>();

		a.add("a");
		a.add("b");
		a.add("hello");
		a.add(1,"lll");
		a.add("jdgfdh");
		a.add(3,"hfh");
		System.out.println(a);


	}
	
	static void list(int arr[]){
	
		for(int i=0; i< arr.length; i++){
			System.out.println("value of "+ i +" is : "+arr[i]);
			
		}		
		
	}
}