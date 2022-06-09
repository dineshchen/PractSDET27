package practice;

public class StarInOddPlaces {

	public static void main(String[] args) {

		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(i%2==0&&j%2==0) {
					System.out.print("*"+j);
				}else if(i%2!=0&&j%2!=0) {
			
					System.out.print(j+"*");
				}
			}System.out.println();
		}
	}
	}