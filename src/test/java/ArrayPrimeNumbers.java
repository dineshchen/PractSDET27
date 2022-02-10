
public class ArrayPrimeNumbers {
	
public static void main(String[] args) {

	
	String primenumbers="";
	for(int i=1;i<=50;i++) {
		int count=0;
		for(int num=1;num>=1;num--) 
		{
			if(num%i==0) {
				count=count+1;
				
			}
		}
			if(count==2) {
				primenumbers=primenumbers+i+"";
				
			}
		
		System.out.println(""+primenumbers);
	}
}
}

