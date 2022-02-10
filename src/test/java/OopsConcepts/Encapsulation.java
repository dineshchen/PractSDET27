package OopsConcepts;

//Encapsulation is the process of Binding data(variables) with methods
 class Student{
	 
	private int rollnum;  //Variables should be private
	private String name;
	
	
	// To access the rollnum and name we have to create the methods
	   // we use getters and setters
	public int getRollnum() {
		System.out.println("User is accessing the value");
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
		System.out.println("Value of rollnum is changed");  //we can maintain a log file  
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Value of name  is changed");
	}	
	
}

public class Encapsulation {

	public static void main(String[] args) {

		Student stu=new Student();   //Objects know something with the help of VARIABLES and 
		     stu.setRollnum(2);                                // Objects does something with the help of METHODS;
		     stu.setName("Dinesh");
		     
		System.out.println(stu.getRollnum());
		System.out.println(stu.getName());
		
		
		
	}

}
