package customsorting;

import java.util.Comparator;

import edbm.Employee;

public class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee x, Employee y) {
	String a=x.getName(); //AUTO BOXING
	String b=y.getName();
	return a.compareTo(b); // return x.getNAme().compareTo(y.getName());
		
	}
	

}
