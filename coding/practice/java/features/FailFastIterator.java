package coding.practice.java.features;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class FailFastIterator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating Map
		Map<Integer, String> students = new HashMap<Integer, String>();
		
		students.put(101, "Emma");
		students.put(102, "Paul");
		students.put(103, "Walker");
		
		Iterator itr = students.keySet().iterator();
		
		
		while(itr.hasNext()) {
			System.out.println(">>"+students.get(itr.next()));
			
			
			 // adding an element to Map   
            students.put(104, "Rubby"); // on the next call of next() method, exception will be thrown. 
		}
		
		
	}

}
