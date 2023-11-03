import java.util.ArrayList;

import java.util.Collections;

public class ArrayList1 {
	public static void main(String[] args) {
	//  ArrayList <Type of arraylist> nameofArraylist = new Arraylist();
		ArrayList <Integer> list = new ArrayList();
		//Add new element
		list.add(13);
		list.add(11);
		list.add(10);
		list.add(12);
	
		System.out.println(" 1.  Added Elements are   "+list);
		
		//get element
		//name of arraylist.get(Index);
		int element = list.get(2);
		System.out.println("2.  element at index is  "+element);
		
		//set element
		//nameofArraylist.set(index at you want to set element, value at index you want to set);
		
		list.set(2, 20);
		System.out.println("3.  Element setted at position  "+list.get(2));
		
		//delete element
		// ArraylistName.remove(index at which you want to delete element);
		list.remove(3);
		System.out.println("4. Arraylist after deletion of element   "+list);
		
		//Size of arraylist
		
		int size = list.size();
		System.out.println("5. Size of arraylist is "+size);
		
		
		//loop
		
		//for loop
		for(int i=0;i<list.size();i++)
		{
			System.out.println("6. Arraylist elemnts are after for loop"+list.get(i));
		}
		
		//for each loop
		
//		for(ArrayList elements : list)
//		{
//			System.out.println("7.Array list elements after the for each loop"+element);
//		}
//		
		//sorting of arraylist
		
		System.out.println("8.Arraylist before sorting"+list);
		
		Collections.sort(list);
		//for using sort we have to import collection
		System.out.println("8.Arraylist after sorting"+list);
		
		
		
		
	}

}
