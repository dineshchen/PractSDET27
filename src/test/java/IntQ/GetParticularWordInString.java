package IntQ;

public class GetParticularWordInString {

	public static void main(String[] args) {
		String s="I Love Programming in java java";
	   String s1 [] = s.split(" ");
		for(int i = 0;i<s1.length;i++) {
			System.out.println(s1[0]+" "+s1[s1.length-1]);
			break;
		}
	}
}
