
public class AdditionOfTwoEqualArrays {

	public static void main(String[] args) {

		/*
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		int sum[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
		sum[i]=a[i]+b[i];
		System.out.print(sum[i]+" ,");
		
		}*/
		
		int a[]= {1,2,3,4};
		int b[]= {4,5,6,0};
		int sum[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(i<b.length) {
			sum[i]=a[i]+b[i];
			System.out.print(sum[i]);
		}
		}
	}
}


