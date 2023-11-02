package vectorDemo1;

import java.util.Scanner;
import java.util.Vector;
public class Vector_demo1 {

	
 public static void main(String[] args) {
	 
//	 Vector list = new Vector();
//	 
//	 Scanner sc = new Scanner (System.in);
//	 list.add("RAM");
//	 list.add("Shyam");
//	 list.add("RAJ");
//	 
//	 System.out.println("The Vector Elements are "+list);
//	 
//	 list.insertElementAt("RAVI",1);
//	 System.out.println("The Vector Elements are "+list);
//	 System.out.println( list.elementAt(1));
//	
	 Vector<Integer> lst = new Vector<>(50,10);
	 lst.add(null);
	 lst.add(7);
	 System.out.println(lst);
	 System.out.println(lst.get(1));
	 System.out.println(lst.remove(1));
	 System.out.println(lst);
	 System.out.println(lst.capacity());
	 System.out.println(lst.size());
	 
	 
	
}
}
