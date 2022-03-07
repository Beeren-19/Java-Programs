package XylemPrograms;

public class FirstLetterofStringCapital {

	public static void main(String[] args) {
		String str="my NaMe is bEErendra";
		str=str.toLowerCase();
		String[] s = str.split(" ");
		String newstr = "";
		for(int i=0;i<s.length;i++)
		{
			String s1 = s[i];
			for (int j = 0; j < s1.length(); j++) {
				if(j==0 && Character.isLowerCase(s1.charAt(j)))
				{
					newstr+=Character.toUpperCase(s1.charAt(j));
				}
				else{
					newstr+=s1.charAt(j);
				}
				
			}
			newstr=newstr+"  ";
		}
		System.out.println(newstr);
	}
}
