import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;

public class RemoveDuplicatesInArray {
	
	public static double squareRoot(int num) {
		double t;
		double sqroot=num/2;
		do {
			t=sqroot;
			sqroot=(t+(num/t))/2;
		}
		while((t-sqroot)!=0);
		return sqroot;
		
	}

	public static void main(String[] args) {
		
		//remove duplicates in array and string
		
		//int a[]= {2,5,3,2,8,5,8};
		String str="Hi Hello How Are You";
		String str1=str.toLowerCase();
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for(int i=0;i<str1.length();i++) {
			set.add(str1.charAt(i));
		}
		for(char ch:set) {
			System.out.print(ch);
		}
		//LinkedHashSet<Integer>set=new LinkedHashSet<Integer>();
		//for(int i=0;i<a.length;i++) {
		//	set.add(a[i]);
	//	}
		//System.out.println(set);
	
		//int a=9;
		//double b=Math.sqrt(a);
		//System.out.println(b);
//int a=25;
//System.out.println(squareRoot(a));
		
		
			}
}

