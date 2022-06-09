
public class ArrayPrime {

	public static void main(String[] args) {
	int[] input = {2, 3, 4 , 5,11,13, 6,17 ,55,33,76,7};
		
		for (int i = 0; i < input.length; i++) {
			int count =0;
			for (int j=input.length-1;j>=0;j--) {
				
				if(input[i] % input[j] == 0)
				{
					count++;
				}
				
			}
			if(count== 1)
			{
				System.out.print(" "+ input[i]);
			}
		}
	}
		
		
	}

