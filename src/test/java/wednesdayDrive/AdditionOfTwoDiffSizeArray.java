package wednesdayDrive;

public class AdditionOfTwoDiffSizeArray {

	public static void main(String[] args) {
		int[] arr1 = {1, 7, 9, 4};
	    int[] arr2 = {2, 6, 2, 1, 3, 5 };
		//  Output: {3,1,3,1,1,5,3,5}
	    int b=arr1.length;
      if(b<arr2.length) {
    	  b=arr2.length;
      }

      for(int i=0;i<b;i++) {
    	  try {
    		 
    		  System.out.println(arr1[i]+arr2[i]);
    		  }
    	  catch(Exception e) {
    		  if(b>arr2.length) {
    			  System.out.println(arr1[i]);
    		  }else {
    			  System.out.println(arr2[i]);
    		  }
    	  }
//    	  String n=String.valueOf(i);
//    	  char[] num=n.toCharArray();
//    	  for(int k=0;k<num.length;k++) {
//    		  System.out.println(num[k]);
    	//  }
      }
	}

}
