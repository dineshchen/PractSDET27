
public class PrimeArray {

	public static void main(String[] args) {
		
		int a[]= {2,3,4,5,6,7,8,9,11,13};
		String prime="";
		for(int i=0;i<=a.length;i++) {
			int count=0;
			for(int j=i;j>=1;j--) {
				if(i%j==0) {
					count++;
				}
				}
				if(count==2) {
					prime=prime+i+" ";
				}
			}
		System.out.println(" "+prime);
		
	}
}
