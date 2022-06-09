import java.util.LinkedHashSet;

public class Vowelspractice {

	public static void main(String[] args) {
		String str="india";
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		for(char ch:set)
		{
			int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
			count++;	
			}
		  }
		
			System.out.println(" "+count);
		break;
		}
	}
}
