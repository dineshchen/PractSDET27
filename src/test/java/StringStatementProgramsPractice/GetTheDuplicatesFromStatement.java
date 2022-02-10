package StringStatementProgramsPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class GetTheDuplicatesFromStatement {

	public static void main(String[] args) {

		String s="hello welcome hello world welcome to TY";
		String[] sarr = s.split(" ");
		HashSet<String> set=new HashSet<String>();
		
		for(String word:sarr) {
			set.add(word);
		}
		for(String word1: set) {
			int count=0;
		for(int i=0;i<sarr.length;i++)
		{
			if(word1.equals(sarr[i])) {
				count++;
			}
		}
			
		
		if(count==1) {
			System.out.println(word1);
			
		}
	}

}
}
