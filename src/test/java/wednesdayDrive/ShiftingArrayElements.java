package wednesdayDrive;

public class ShiftingArrayElements {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		aleft(a,1);
		System.out.println();
		
		aright(a,1);
		System.out.println();
		
		aleft(a,2);
		System.out.println();
		
		aright(a,2);
		System.out.println();
		
	}

	private static void aright(int[] a, int n) {
		for(int i=0;i<n;i++) {
			int last=a[a.length-1];
			for(int j=a.length;j>=0;j--) {
				a[j]=a[j-1];
			}
			a[0]=last;
		}
		System.out.println("\n"+"Right Shift"+n);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

	private static void aleft(int[] a, int n) {
		for(int i=0;i<n;i++) {
			int first=a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=first;
		}
		System.out.println("\n"+"left shift"+n);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
