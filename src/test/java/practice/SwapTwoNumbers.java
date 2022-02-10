package practice;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		//with using 3rd variable output should be ( a=20;b=10;)
		int a=10;
		int b=20;
	/*
		int temp=a;
		a=b;
		b=temp;
		System.out.println(+a+","+b);
		
		*/
		////without using 3rd variable output should be ( a=20;b=10;)
		a=a+b;   //then a=30
		b=a-b;   //b=30-20  =10
		a=a-b;   //a=30-10  =20
		System.out.println(+a+","+b);	
	}

}
