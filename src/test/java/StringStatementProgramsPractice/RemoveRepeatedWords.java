package StringStatementProgramsPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveRepeatedWords {

	public static void main(String[] args) {

		String s="hello welcome hello world welcome to TY";
		String[] sarr = s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(String word: sarr) 
		{
			set.add(word);
		}
		for(String word1:set){
			System.out.print(word1+" ");
		}
	}

}
