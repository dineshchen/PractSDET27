package wednesdayDrive;

public class Print2DArray {
	
//Method 1
//	public static void  print2DMatrix(int arr[][],int rows,int columns) {
//		for(int i=0;i<rows*columns;i++) {
//			int row=i/columns;
//			int col=i%columns;
//			
//			System.out.print(arr[row][col]+" ");
//		}
//	}

public static void main(String[] args) {
	

	int[][]mat= {{1,2},{4,5,6},{7,8,9}};
	
//	int n=mat.length;
//	int m=mat[0].length;
//	print2DMatrix(mat,n,m);
	
//Method 2
	for(int i=0,j=0;i<mat.length; ) {
		if(mat[i]!=null && j<mat[i].length) {
			System.out.print(mat[i][j]+",");
			j++;
		}else {
			j=0;
			i++;
		}
	}
}

}