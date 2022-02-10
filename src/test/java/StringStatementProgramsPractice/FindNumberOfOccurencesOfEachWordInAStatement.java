package StringStatementProgramsPractice;

import java.util.LinkedHashSet;

public class FindNumberOfOccurencesOfEachWordInAStatement {

	public static void main(String[] args) {

//Method 1
		String s="hello world hello all welcome to TY";
		String sarr[] = s.split("l");
		
		System.out.println(sarr.length);
		
//Method 2
		String s1="hello world hello all welcome to TY";
		String sarra[]=s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(String word1:sarra)
		{
			set.add(word1);
		}
		for(String word2:set) {
			int count=0;
			for(String word3:sarra) {
				if(word2.equals(word3)) {
					count++;	
				}
			}
			System.out.println(word2+":"+count);
		}
		
		
	}

}
