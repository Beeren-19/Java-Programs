package PlayGamesPrograms;

public class SortStringelementsusingCompareOperator {

	public static void main(String[] args) {
		String[] str={"apple","custurdApple","banana","orange","mango"};
		for(int i=0;i<str.length;i++)
		{
			for (int j = i+1; j < str.length; j++) {
				if(str[i].compareTo(str[j])>0)
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
					
				}
				
			}
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
			
		}
		
	}
}
