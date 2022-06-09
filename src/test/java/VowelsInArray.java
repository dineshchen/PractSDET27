import java.util.LinkedHashSet;

public class VowelsInArray {

	public static void main(String[] args) {
		String str[]= {"abab","india"};
		
		for(int i=0;i<str.length;i++) {
			String s=str[i];
			
			LinkedHashSet<Character>set=new LinkedHashSet<Character>();
			
			for(int j=0;j<s.length();j++) {
				set.add(s.charAt(j));
			}
			int count=0;
			for(Character ch:set) {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
					count++;
				}
			}
		System.out.println(s+" "+count);
		}
	}
}
