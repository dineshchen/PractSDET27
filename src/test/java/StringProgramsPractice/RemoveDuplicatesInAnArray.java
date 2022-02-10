package StringProgramsPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesInAnArray {

	public static void main(String[] args) {

		String s="The Program to Remove Duplicates in String";
		//prints Randomly HashSet set = new HashSet();
		LinkedHashSet set = new LinkedHashSet();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
			System.out.println(set);
		}
		for(Object ch:set)
		{
			System.out.print(ch);
		}
	}

}
