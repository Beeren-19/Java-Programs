package Interviewprogram;

public class CountsubStringingivenString {
	public static void main(String[] args) {
		String str="dogcatcatdogdogcat";
		int count=0;
		for(int i=0;i<str.length()-2	;i++)
		{
			String s = str.substring(i, i+3);
			if(s.equals("dog"))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
