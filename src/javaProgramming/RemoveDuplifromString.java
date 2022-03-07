package javaProgramming;

import java.util.LinkedHashSet;

public class RemoveDuplifromString {

	public static void main(String[] args) {
		String s="beerendra";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			System.out.println(ch);
		}
	}
}
