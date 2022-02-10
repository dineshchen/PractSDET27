package StringProgramsPractice;

public class ConcatString {

	public static void main(String[] args) {

		String str="abc"+"xyz";   //output should be "axbycz"
		
		for(int i=0;i<str.length()/2;i++) {
		//System.out.print(str.charAt(i)+""+str.charAt(str.length()/2+i));
			System.out.print(str.charAt(i)+""+str.charAt(str.length()/2+i));
	}
	}

}
