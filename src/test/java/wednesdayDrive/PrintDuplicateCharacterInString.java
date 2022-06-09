package wednesdayDrive;

import java.util.LinkedHashSet;

public class PrintDuplicateCharacterInString {

	public static void main(String[] args) {

		String s="testyantra";
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			lhs.add(s.charAt(i));
		}
		for(char ch:lhs) {
			int count=0;
			
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
				
			}
			if(count>1)
			{
				System.out.println(ch);
			}
	}
		
	}

}
