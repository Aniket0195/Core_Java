package vectorDemo1;

import java.util.ArrayList;
import java.util.List;


public class TestPersonList {

	public static void main(String[] args) {
		ArrayList<Person> plist=new ArrayList<>();
		plist.add(new Person(10,"Ashwini","44444"));
		plist.add(new Person(11,"Rajat","5555"));
		plist.add(new Person(12,"Archana","5555"));
		plist.add(new Person(13,"Mugdha","5555"));
        System.out.println(plist);
        int pos=plist.indexOf(new Person(10,"",null));
        System.out.println("POSITION"+pos);
        plist.remove(new Person(11,null,null));
        
       
        System.out.println(plist);
     // System.out.println( plist.get(11));
       System.out.println("GFTURFYFG"+plist.get(1)); 
      // plist.set(1,);
	}

}