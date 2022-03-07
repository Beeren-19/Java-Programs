package javaProgramming;

import java.util.HashSet;

public class Duplicatewordsingivenstring {

	public static void main(String[] args) {
		String s="welcome to india welcome to tyss";
		String[] str = s.split(" ");
		
		//step1
		HashSet<String> set=new HashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		
		//step2 : compare each character of set with all the character of given string
		for(String word:set)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(word.equals(str[i]))
				{
					//step3: if the given character is matching increment the count
					count++;
				}
			}
			//step4: print the char and its respective count
			if(count>1)
			{
				System.out.println(word+" "+count);
			}
		}
	}
}
