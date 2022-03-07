package Interviewprogram;

public class SecondMaxvalueWithoutSorting {

	public static void main(String[] args) {
		
		int[] arr={10,20,11,33,1};
		int max_val = 0;
		for(int a:arr)
		{
			
			if(max_val<a)
			{
				max_val=a;
			}
		}
		System.out.println(max_val);
		
		int temp=max_val;
		int secondMax = 0;
		for(int a:arr)
		{
			if(!(temp==a) && secondMax<=a)
			{
				secondMax=a;
			}
		}
		System.out.println(secondMax);
		
		
	}
}
