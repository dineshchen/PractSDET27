package StringProgramsPractice;

public class ReverseAString {

	public static void main(String[] args) {
 
//Method 1
		String s="Dinesh";  //Here String length=6
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
			
		}
		
		System.out.println("---------------");
//Method 2
		String s1="Vinayagam";
		String reverse=" ";
		for(int i=s1.length()-1;i>=0;i--)
		{
			reverse=reverse+s1.charAt(i);
			System.out.println(reverse);
			
		}
		
		System.out.println("---------------");
// Without using length() method
		String s2="Arunachalam";
		char arr[]=s2.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
			
		}
		
		System.out.println("---------------");
//Using ForEachLoop to get the length without using [Length() and length]
		int count=0;
		String s3="Annamalai";
		char array[]=s3.toCharArray();
		for(char ch:array) {
			count++;
		}
		System.out.println(count);
		System.out.println("---------------");
		for(int i=count-1;i>=0;i--) {
			System.out.print(array[i]);
			
		}
		System.out.println("---------------");
	
//Using inBuild Function [CompareTo() method]s		
		String q1="Hello";
		String q2="";
		int arrlen=q1.compareToIgnoreCase(q2);
		System.out.println("The Length of given String q1:"+arrlen);
		for(int i=arrlen-1;i>=0;i--)
		{
			
			System.out.print(q1.charAt(i));
		}
	}
}
