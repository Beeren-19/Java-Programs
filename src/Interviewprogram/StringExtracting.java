package Interviewprogram;

public class StringExtracting {

	public static void main(String[] args) {
		String str="abc123#$%ABC";
		
		//to extract only numbers
		for(int i=0;i<str.length();i++)
		{
			char num = str.charAt(i);
			if(num>='0' && num<='9')
			{
				System.out.print(num);
			}
		}
		
		//to extract only alphabets
		for(int i=0;i<str.length();i++)
		{
			char alpha = str.charAt(i);
			if(alpha>='a' && alpha<='z'||alpha>='A' && alpha<='Z')
			{
				System.out.print(alpha);
			}
		}
		System.out.println("\n");
		//to extract special character
		for(int i=0;i<str.length();i++)
		{
			char special = str.charAt(i);
			if(!(special>='0' && special<='9') && !(special>='a' && special<='z'||special>='A' && special<='Z'))
			{
				System.out.print(special);
			}
		}
		
	}
}
