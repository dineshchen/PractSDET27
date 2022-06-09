package IntQ;

public class Patterns {

	public static void main(String[] args) {
		
// Left Angle *
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=(5-i);j++) {
			System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}System.out.println();
			}
System.out.println("-----------------------");

// Right Angle *
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}System.out.println();
		}
System.out.println("-----------------------");

// Reverse Right Angle *
        for(int i=0;i<5;i++) {
        	for(int j=0;j<5-i;j++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        		}
        System.out.println("----------------------");
//  Reverse Left Angle *
        for(int i=1;i<=5;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print("  ");
        	}
        	for(int k=i;k<=5;k++) {
        		System.out.print("* ");
        	}
        	
        	System.out.println();
        }
        System.out.println("-------------------------");
//  Pramid/Equilateral Triangle
        for(int i=1;i<=5;i++) {
        	for(int j=i;j<=5;j++) {
        		System.out.print(" ");
        	}
        	for(int k=1;k<=i;k++) {
        		
        		System.out.print("* ");
        	}System.out.println();
        }
        System.out.println("------------------");
//  Inverted Pramid/Equilateral Triangle
        for(int i=1;i<=5;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print(" ");
        	}
        	for(int k=0;k<=5-i;k++) {
        		System.out.print("*  ");
        	}
        	System.out.println();
        }
        System.out.println("--------------------");
        
//      A BB CCC DDDD EEEEE
        for(int i=1;i<=5;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print((char)(i+64));
        	}System.out.println(" ");
        }
		System.out.println("-----------------------");
		
//      A AB ABC ABCD ABCDE ---- Right Angle
        for(int i=1;i<=5;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print((char)(j+64));
        	}System.out.println();
        }
		System.out.println("-------------------------");
//  ABCDE BCDE CDE DE E  ------  Inverted Right Angle
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print((char)(j+64));
			}System.out.println();
		}
		System.out.println("---------------------------");
//    A BB CCC DDDD EEEEE -----  Left Angle
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print((char)(i+64)+" ");
			}System.out.println();
		}
System.out.println("--------------------------");
//   Left Angle
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=5-i;k++) {
				System.out.print((char)(k+64)+"");
			}
			System.out.println();
		}
// practice
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("");
			}
			for(int k=i;k<=5;k++) {
				System.out.print((char)(k+64));
			}
			System.out.println();
		}
		
	}
}
