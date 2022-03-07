package XylemPrograms;

public class OccuranceofeachLetter {

	public static void main(String[] args) {
		String str="beerendra";
		char[] s = str.toCharArray();
		
				for(int i=0;i<s.length;i++)
				{
					int count=1;
					for (int j = i+1; j < s.length; j++)
					{
						
						if(s[i]==(s[j]))
						{
							count++;
							s[j]=0;
						}
						
					}
					if(s[i]!=0){
					System.out.println(s[i]+" "+count);
					}
				}
	}
}
