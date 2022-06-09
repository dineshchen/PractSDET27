package IntQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Demo { 
public void show() 
    	{ 
        	ArrayList<String> list = new ArrayList<String>(); 
        	list.add("banana"); 
        	list.add("apple"); 
        	Iterator itr = list.iterator(); 
  
        	Collections.sort(list); 
        	while (itr.hasNext())
{ 
            	System.out.print(itr.next() + " "); 
        	} 
    	} 
}


