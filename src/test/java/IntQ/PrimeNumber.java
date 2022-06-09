package IntQ;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=i;j>=1;j--) {
				if(i%j==0) {
					count++;
				}
			}if(count==2) {
				System.out.println(i);
			}
		}
	}
}
