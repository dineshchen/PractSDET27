
public class ObjCreationForInterfaceUsingLambda {

	public static void main(String[] args) {
		Run obj=new Run() {

			public void run() {
				System.out.println("Interface");
				
			}
			
		};

			obj.run();
	}
}

