
public class PrintDuplicatesINString {

	public static void main(String[] args) {
		String str="Hi Hello Hi Bye";
		char strToChar[] = str.toLowerCase().toCharArray();
		
		for (int i = 0; i < strToChar.length; i++) {
			int count = 0;
			for (int j = 0; j < strToChar.length; j++) {
				if(strToChar[i]== strToChar[j] && i>j)
				{
					break;
				}
				if(strToChar[i]== strToChar[j])
				{
					count++;
				}
			}
			if(count > 1)
			{
				System.out.print(strToChar[i]);
			}
			
		}
	}
}
