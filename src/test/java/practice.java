

public class practice {

	public static void main(String[] args) {
//addition of 2 equal arrays		
		int a[]= {6,1,8,3};
		int b[]= {4,1,5,2};
//object creation 
		int sum[] = new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(i<b.length) {
				sum[i]=a[i]+b[i];
				System.out.print(" "+sum[i]);
			}
		}
		
		
		
	}
}
