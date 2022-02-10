package StringProgramsPractice;

import java.util.LinkedHashSet;

public class GetPositionOfCharacterWithoutDuplicates {

	public static void main(String[] args) {

		String s="Tester";
		String s1=s.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
			set.add(s1.charAt(i)); //add element into set - (s.charAt(i)) reading and adding character
		}
		
		for( char ch:set) { //reads the character from set
			int count=0;
			for(int i=0;i<s1.length();i++) {  // reads the char from string
				if(ch==s1.charAt(i)) {
					count++;
					System.out.println(ch+" "+(i+1));
					break;

				}				}
			
		}
	}


}
