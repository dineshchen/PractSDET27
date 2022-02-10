package StringProgramsPractice;

public class ReverseTheGivenSentence {

	public static void main(String[] args) {

		String s="Welcome to Tyss Bangaore";

		String str[]=s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}
	}
}
