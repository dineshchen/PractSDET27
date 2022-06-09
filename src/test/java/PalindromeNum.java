
public class PalindromeNum {

	
	     public static void main(String [] args)
	       {
	    int num = 1221;
	    int temp = num;
	    int rev = 0;
	 while(temp!=0)
	      {
	     int rem = temp%10;
	      rev = (rev*10)+rem;
	      temp = temp/10;
	     }
	if(num == rev)
	     {
	 System.out.println(num +" "+ "is a palindrome");
	      }
	else  {
	  System.out.println(num + " "+"is not a palindrome");

	    }
	   }
	}



