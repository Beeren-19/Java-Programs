package Interviewprogram;

public class NumbersfromAlphanumericPrintSum {

	public static void main(String[] args) {
		String str="abc123";
		//output: 1+2+3=6
		//String num="";
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				int add = Integer.parseInt(String.valueOf(str.charAt(i)));
				sum=sum+add;
			}
		}
		System.out.println(sum);
	}
}
