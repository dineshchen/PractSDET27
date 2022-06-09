
public class PalindromeString {
public static void main(String[] args) {
	

	String str="radar",revstr="";
	int length=str.length();
	
	for(int i=(length-1);i>=0;i--) {
		revstr=revstr+str.charAt(i);
	}
	if(str.equals(revstr)) {
		System.out.println(str+ " is a palindrome");
	}
	else {
		System.out.println(str+"is not a palindrome");
	}
	
}	
}
