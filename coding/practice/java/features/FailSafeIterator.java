package coding.practice.java.features;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIterator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating Map
		Map<Integer, String> students = new HashMap<Integer, String>();
		
		students.put(101, "Emma");
		students.put(102, "Paul");
		students.put(103, "Walker");
				
		ConcurrentHashMap<Integer, String> copyStudents = new ConcurrentHashMap<Integer, String>(students);
		
		Iterator itr = copyStudents.keySet().iterator();
		
		while(itr.hasNext()) {
			System.out.println(">>"+copyStudents.get(itr.next()));
			
			
			 // adding an element to Map   
			copyStudents.put(104, "Rubby"); // on the next call of next() method, exception will be thrown. 
		}
		
		
	}

}
