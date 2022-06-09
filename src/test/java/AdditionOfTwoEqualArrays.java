
public class AdditionOfTwoEqualArrays {

	public static void main(String[] args) {

		/*
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		int sum[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
		sum[i]=a[i]+b[i];
		System.out.print(sum[i]+" ,");
		
		}
		
		/*int a[]= {1,2,3,4};
		int b[]= {4,5,6};
		int sum[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(i<b.length) {
			sum[i]=a[i]+b[i];
			System.out.print(sum[i]+" ");
		}
		}*/
		
		int a[] = {1,2,3,4};
		int b[] = {4,5,6};
		int count = a.length;
		if(a.length<b.length) {
			count=b.length;
		}
		for(int i = 0;i<count;i++) {
			try {
				System.out.println(a[i]+b[i]);
			}
			catch(Exception e) {
				if(a.length>b.length) {
					System.out.println(a[i]);
				} else {
					System.out.println(b[i]);
				}
				
				
			
		/*int a[]= {4,2,8,3};
		int b[]= {7,2,4};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					sum=b[j]+a[i];
				}
			}System.out.println(sum);
		}*/
			}
		}
	}
}


