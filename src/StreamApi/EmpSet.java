package StreamApi;
import java.util.*;
public class EmpSet {

	public static void main(String[] args)throws Exception{
		Set<Employee> set= new TreeSet<>(Comparator.comparing(Employee::getname));
		set.add(new Employee(101,"Emp1","it"));
		set.add(new Employee(102,"emp2","hardware"));
		set.add(new Employee(103,"emp3","it"));
		set.add(new Employee(104,"emp4","hardware"));
		set.add(new Employee(105,"emp5","it"));
		
		System.out.println(set);
		@SuppressWarnings("rawtypes")
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(" "+itr.next());
		}
		
		
	}
}
