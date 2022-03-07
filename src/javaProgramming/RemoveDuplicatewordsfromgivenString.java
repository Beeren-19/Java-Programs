package javaProgramming;

import java.util.LinkedHashSet;

public class RemoveDuplicatewordsfromgivenString {

	public static void main(String[] args) {
		String s="welcome to india welcome to tyss";
		String str[]=s.split(" ");
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
			
		}
		for(String word:set)
		{
			System.out.println(word);
		}
		
	}
}
