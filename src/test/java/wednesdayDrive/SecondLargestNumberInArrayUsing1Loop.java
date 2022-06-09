package wednesdayDrive;

import java.util.Arrays;

public class SecondLargestNumberInArrayUsing1Loop {
	public static void main(String[] args) {
		int a[]= {90,60,70,34,55};

//Method 1		
//		Arrays.sort(a);
//		System.out.println(a[a.length-2]);
		
//Method 2
		int largest=a[0];
		int secLarge=a[1];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				secLarge=largest;
				largest=a[i];
			}else if(a[i]>secLarge && a[i]!=largest) {
				secLarge=a[i];
			}
		}System.out.println("The Second Largest number in Array is:"+secLarge);
	}

}
