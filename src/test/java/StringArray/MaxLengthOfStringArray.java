package StringArray;

public class MaxLengthOfStringArray {

	public static void main(String[] args) {

		String str[]= {"Dinesh","Pradeep","Nithesh","Arun","AlexPandian","VinayakRamJ","ArunKumarrr"};
		
		String minElement=str[0];
		for(int i=1;i<str.length;i++)
		{
			if(minElement.length()<str[i].length())
			{
				minElement=str[i];
			}
		}
		//System.out.println(minElement);//prints 1 min element
		for(int i=1;i<str.length;i++)
		{
			if(minElement.length()==str[i].length())
			{
				System.out.println(str[i]);
			}
		}
	}

}