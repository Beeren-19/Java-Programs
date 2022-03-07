package javaProgramming;

public class Stringmaximum {

	public static void main(String[] args) {
		
	
	String str[]={"hi","two","road","Mangoes","Range"};
	String max="";
	for(String s:str)
	{
		if(max.length()<s.length())
		{
			max=s;
		}
	}
  System.out.println(max);
}
}