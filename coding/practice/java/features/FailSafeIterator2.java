package coding.practice.java.features;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class FailSafeIterator2{

	public static void main(String[] args) {
				
		//Creating Map
		ArrayList<String> students = new ArrayList<String>();
		
		students.add("Emma");
		students.add("Paul");
		students.add("Walker");
		//students.add("Elanie");  
        //students.add("Amara"); 
		System.out.println("students>>"+students); 
		
		CopyOnWriteArrayList<String> copyStudents = new CopyOnWriteArrayList<String>(students);
		
		Iterator itr = copyStudents.iterator();
		
		System.out.println("copyStudents>> "+copyStudents); 
		
		while(itr.hasNext()) {
			String name = (String)itr.next();   
            System.out.println(name);   
            if(name.contentEquals("Paul")){
				copyStudents.add("Ruby");//// It will not throw an exception 
			}
		}
		System.out.println("copyStudents>> "+copyStudents); 
	}
}
