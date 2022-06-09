import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String: ");
		String str1=sc.nextLine();
		System.out.println("Enter Second String: ");
		String str2=sc.nextLine();
		
//checking length of string is same or not
		if(str1.length()==str2.length()) {
			
//converting string to array			
			char[] charArray1=str1.toCharArray();
			char[] charArray2=str2.toCharArray();
			
//sort array
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			
//if sorted char arrays are same
//then string is anagram
			boolean result=Arrays.equals(charArray1,charArray2);
			if(result) {
				System.out.println(str1+ "and" +str2+ "are anagram");
			}else {
				System.out.println(str1+ "and" +str2+ "are not anagram");
			}
			
		}
		else {
			System.out.println(str1+ "and" +str2+ "are not anagram");
		}
		sc.close();
	}
}
