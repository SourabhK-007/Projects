package customsorting;

import java.util.Comparator;

import edbm.Employee;

public class SortByage implements Comparator<Employee>{

	@Override
	public int compare(Employee x, Employee y) {
		Integer a=x.getAge(); //AUTO BOXING
		Integer b=y.getAge();
		
		return a.compareTo(b);    // return x.getAge()-y.getAge();
	}

}
