package StreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortGrade {
public static void main(String[] args) throws Exception{
	List<StdGrade> list = Arrays.asList(new StdGrade (101,"vishal","Computer",10.00),
			new StdGrade(102,"vishnu","it",9.00),
			new StdGrade (101,"vishal","Computer",8.85),
			new StdGrade(102,"vishnu","it",9.00),
			new StdGrade (101,"vishal","Computer",8.85),
			new StdGrade(102,"vishnu","it",8.52));
	
	System.out.println(list);
	StdGrade topstd= Collections.max(list, Comparator.comparingDouble(StdGrade::getGrade));
	System.out.println(topstd);
}
}
