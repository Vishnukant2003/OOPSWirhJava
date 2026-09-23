package StreamApi;
import java.util.*;

public class StdSort {
//3: Sort Students by Name
//	Write a Java program to sort a list of Student objects by their name.
	
	
	
	public static void main(String[] args)throws Exception {
		Set<Student> set= new TreeSet<>(Comparator.comparing(Student::getname).thenComparing(Student::getId));
		set.add(new Student(101,"Adirty","it"));
		set.add(new Student(102,"bisvash","cs"));
		set.add(new Student(103,"ajit","it"));
		set.add(new Student(104,"sona","cs"));
		set.add(new Student(105,"vishnu2","cs"));
		
		System.out.println(set);
		
	}
}
