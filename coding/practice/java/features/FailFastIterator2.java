package coding.practice.java.features;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIterator2{

	public static void main(String[] args) {
				
		//Creating Map
		ArrayList<String> students = new ArrayList<String>();
		
		students.add("Emma");
		students.add("Paul");
		students.add("Walker");
		students.add("Elanie");  
        students.add("Amara"); 
		
		Iterator itr = students.iterator();
		
		System.out.println(students); 
		
		while(itr.hasNext()) {
			System.out.println(">>"+itr.next() );
			if((String)itr.next()=="Paul") {
				students.remove("Amara");//// It will not throw an exception 
			}
			
		}
		
		System.out.println("++++++++++++++");  
		System.out.println(students); 
		
		while(itr.hasNext()) {
			System.out.println(">>"+itr.next() );
			if((String)itr.next()=="Walker") {
				students.remove("Walker");// It will throw an exception on next call of next() method   
			}			 
		}
	}

}
