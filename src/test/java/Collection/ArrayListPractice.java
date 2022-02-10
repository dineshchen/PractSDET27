package Collection;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();  //Default Capacity is 10 and Constructor
		al.add(50);
		al.add(20);
		al.add(15);
		al.add(0, "Hello");
		al.add(1.5f);
		System.out.println(al);
	}

}
