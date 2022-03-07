package javaProgramming;

public class Demo {

	public static void main(String[] args) {
		String arr[]={"hi","hello","Range","mangoes"};
		String max_length = "";
		
		for(String a:arr)
		{
		
			if(max_length.length() < a.length()){
				max_length = a;
			}
//			System.out.println(a +"length"+ a.length());
		}
		
		String temp = max_length;
		max_length = "";
		for(String a:arr)
		{
			
			if(!temp.equalsIgnoreCase(a) && max_length.length() <= a.length()){
				max_length = a;
			}
//			System.out.println(a +"length"+ a.length());
			
		}
		System.out.println(max_length);
		
		
	}
}
