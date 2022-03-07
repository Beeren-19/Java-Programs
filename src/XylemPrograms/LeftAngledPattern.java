package XylemPrograms;

public class LeftAngledPattern {

	public static void main(String[] args) {
		int space=3;
		int star=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<star;k++)
			{
				System.out.print("*");
			}
			space--;
			star++;
			System.out.println();
		}
		
	}
}
