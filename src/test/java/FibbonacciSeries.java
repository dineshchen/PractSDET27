
public class FibbonacciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int num[]=new int[20];
		for(int i=0;i<20;i++) {
			int c=a+b;
			num[i]=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");	
		}
		
		
int n1=0;
int n2=1;
for(int i=2;i<=20;i++) {
	int n3=n1+n2;
	System.out.println("\n"+n3);
	n1=n2;
	n2=n3;
}
	}
}
