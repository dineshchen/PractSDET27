package StringArray;

public class ReverseTheStringInAnArray {

	public static void main(String[] args) {
		
		String str="Welcome to TY";   //output  "emocleW ot YT"
		
		String strArr[]=str.split(" ");  //converting string to array
		for(int i=0;i<strArr.length;i++) {
			String s=strArr[i];  //assign the first element of the array to ref variable s="welcome"
		
		for(int j=s.length()-1;j>=0;j--) //iterate over the string
		{
			System.out.print(s.charAt(j));
		}
System.out.print(" ");
		}
	}

}
