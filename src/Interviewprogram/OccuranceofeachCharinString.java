package Interviewprogram;

import java.util.LinkedHashSet;

public class OccuranceofeachCharinString {

	public static void main(String[] args) {
		
		String str="occurance";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		for(Character c:set)
		{
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(c==str.charAt(i))
				{
					count++;
				}
			}
			System.out.println(c+" "+count);
		}
		
	}
}
