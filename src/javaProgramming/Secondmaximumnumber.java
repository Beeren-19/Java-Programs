package javaProgramming;

public class Secondmaximumnumber {

	public static void main(String[] args) {
		int a[]={10,30,20,50,40};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println("second maximum number " + a[1]);
		System.out.println("second minimum number " + a[a.length-2]);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
