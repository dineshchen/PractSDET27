package practice;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//tables
		/*int n=2;
		for(int i=1;i<=10;i++) {
			
			System.out.println(i+"*"+n+"="+i*n);
			
		}*/
		String s="Dinesh C Chen K C";
		
		/*
		 * charcter count
		 * 
		 * for(int i=s.length()-1;i>=0;i++) {
			System.out.print(s.length()+" ");
			break;
			
		}*/
		
	/*	String[] str = s.split("h");
		System.out.println(str.length);
		for(String s1:str) {
			System.out.println(s1);
		}
		System.out.println(s.length());*/
		
		char[] s1 = s.toCharArray();
		int count=0;
		for(char ch:s1) {
			count++;
		}
		System.out.println(count);
		
	}
	

	
}
