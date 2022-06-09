
public class IntegerCount {
public static void main(String[] args) {
	
//using integer	
 int n=12345678;
int count=0;
	while(n!=0) {
		n=n/10;
		count++;
	}System.out.println(count);
	System.out.println("-------------");
	
// using array
	int n1[]= {1,2,3,4,5};
	int count1 = 0;
	for(int j=0;j<n1.length;j++) {
		//count1=count1+n1[j];
		count1++;
	}
		System.out.println(count1);
		System.out.println("------------");
//using string	
	String s="123456";
	char[] s1 = s.toCharArray();
	int count2=0;
	for(int i=0;i<s1.length;i++) {
		count2++;
	}System.out.println(count2);
	
	}
}

