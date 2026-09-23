package StreamApi;

import java.util.Arrays;
import java.util.*;

public class Stdlist {
	public static void main(String[] args) throws Exception{
		List<Student> list = Arrays.asList(new Student (101,"vishal","Computer"),
				new Student(102,"vishnu","it"),
				new Student (101,"vishal","Computer"),
				new Student(102,"vishnu","it"),
				new Student (101,"vishal","Computer"),
				new Student(102,"vishnu","it"));
		
		System.out.println(list);
		
		@SuppressWarnings("rawtypes")
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println("printing throw iterattor: "+itr.next());
		}
	}
}
