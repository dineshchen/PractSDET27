
public class FibbonacciString {

	public static void main(String[] args) {

		String s[]= {"a","ad","try","india","aabgsfb"};
		for(int i=0;i<s.length;i++) {
			int n=s[i].length();
			System.out.println(n);
			int a=0,b=1;
			
			for(int j=0;j<=n;j++) {
				int c=a+b;
				if(c==n) {
					System.out.println("yes"+":"+s[i]);
					break;
				}
				else {
					a=b;
					b=c;
				}
				if(j==n) {
					System.out.println("No"+":"+s[i]);
				}
			}
		}
	}

}
