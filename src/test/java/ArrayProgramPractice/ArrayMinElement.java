package ArrayProgramPractice;

public class ArrayMinElement {

	public static void main(String[] args) {

		//Using BUBBLE sort
				int arr[]= {2,11,4,31,7,5};
				for(int i=0;i<arr.length;i++)
				{
					for(int j=i+1;j<arr.length;j++)
					{
						if(arr[i]>arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
						
				}	
			System.out.print(arr[i]+" ");		
			
	}
System.out.println("The Min Element in the given Array:"+arr[0]);

	}

}
