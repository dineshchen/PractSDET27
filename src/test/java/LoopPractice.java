import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {

/* loop which does not prints i value
		for(int i=0;i<10;i++)
		{
			int count=0;                  // 0 will be re init for 0-9times
			System.out.println(count); //output 00000 00000
		}*/
		
/*loop which prints count value and it will consider as i 		
		int count=0;
		for(int i=0;i<10;i++)
		{
			System.out.println(count);   //output 0123456789
			count++;
		}
		*/

/* Re init i to count
        for(int i=0;i<10;i++){
        	{
        		int count=0;
        		count=i;
        		System.out.println(i); //output 0-9
        		count++;
        	}
        	*/
		
/*
		for(int i=0;i<10;i++)
		{
			int count=i;
			count=0;
			System.out.println(count);
			count++;
        }
        */
		
/* div by using getting number from user
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		
		if(n%5==0 && n%3==0)
		{
			System.out.println("Hi Bye");
		}else if(n%5==0) {
			System.out.println("Hi");
		}
		else if(n%3==0) {
			System.out.println("Bye");
		}
		else {
			System.out.println("Good Bye");
		}
		*/
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		if(n%5==0 && n%3==0) {
			System.out.println("Hi Bye");
			if(n%5==0) {
				System.out.println("Hi");
				if(n%3==0) {
					System.out.println("Bye");
				}
			}
			
		}
	}

}
