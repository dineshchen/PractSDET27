package ArrayProgramPractice;

public class SumOf3MaxValueInArray {

	public static void main(String[] args) {

		//Using BUBBLE sort
				int arr[]= {2,11,4,31,7,5};
				for(int i=0;i<arr.length;i++)
				{
					for(int j=i+1;j<arr.length;j++)
					{
						if(arr[i]<arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
						
				}	
					System.out.print(arr[i]+" ");
			
	}
int sum=0;
for(int i=0;i<3;i++) {
	sum=sum+arr[i];
}
System.out.println();
System.out.println("The Sum Of Three Max Elements in a given array is:"+sum);
}
}