
public class PrimeNumbers {
	
public static void main(String[] args) {

	
	String primenumbers=" ";
	for(int i=1;i<=20;i++) {
		int count=0;
		for(int num=i;num>=1;num--) 
		{
			if(i%num==0) {
				count=count+1;
				
			}
		}
			if(count==2) {
				primenumbers=primenumbers+i+" ";
				
			}
	}
		System.out.println(""+primenumbers);
	}
}



