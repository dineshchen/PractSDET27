import java.util.HashSet;

public class VowelPracticeWithoutDuplicate {

	public static void main(String[] args) {
		String str="india";
		HashSet<Character>set=new HashSet<Character>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		int count=0;
		for(char ch:set) {
			
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					count++;
				}
			}
			System.out.println(count);
			//break;
		}
	}

