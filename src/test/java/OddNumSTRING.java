
public class OddNumSTRING {

	public static void main(String[] args) {
		String str="a1b2c3d4";
		
		for(int i=0;i<=str.length()-1;i++) {
			
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				int num=str.charAt(i)-48;
				if(num%2==1) 
				{
					
					System.out.println(str.charAt(i)+"is odd num");
				}
			}
			}
	}
}

