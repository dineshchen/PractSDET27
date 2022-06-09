import java.util.LinkedHashSet;

public class DiagonalArrayAddition {

	public static void main(String[] args) {
		
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int count=0;
	//int sum=0;
	for(int i=0;i<a.length;i++) {
		int b[]=a[i];
		for(int j=0;j<b.length;j++) {
			if(j==count) {
				//sum=sum+b[j];
				count++;
				break;
			}
		}System.out.println(b[i]);
	}//System.out.println(sum);
	}
}
