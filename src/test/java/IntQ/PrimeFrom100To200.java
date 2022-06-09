package IntQ;

public class PrimeFrom100To200 {

	public static void main(String[] args) {
		int k=1;
		for(int i=101;i<=199;i+=2) {
			k=1;
			for(int j=4;j<i;j++) {
				if(i%j==0) {
					k=0;
					break;
				}
			}if(k==1) {
				System.out.println(i);
				k=1;
			}
		}
//		
//		System.out.println("-------------------");
//		
//		int a[]= {4,8,1,65,23};
//		int size=a.length;
//		for(int i=0;i<size;i++) {
//			for(int j=i+1;j<size;j++) {
//				if(a[i]>a[j]) {
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//			
//		}System.out.print(a[size-3]);
		
		
	}
}
