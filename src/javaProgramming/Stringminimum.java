package javaProgramming;

public class Stringminimum {

	public static void main(String[] args) {
		
		String str[]={"Bye","hi","two","road","Mangoes","Range"};
		String min="str[0]";
		for(String s:str)
		{
			if(min.length()>s.length())
			{
				min=s;
			}
//			if(min.length()==s.length())
//			{
////				System.out.println(s);
//			}
		}
	  System.out.println(min);
	}
}
