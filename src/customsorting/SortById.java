package customsorting;

import java.util.Comparator;

import edbm.Employee;


public class SortById implements Comparator<Employee>{

	@Override
	public int compare(Employee x, Employee y) {
		String a=x.getId();		// AUTOBOXING
		String b=y.getId();
		return a.compareTo(b);  // return x.getId().compareTo(y.getId());
		
		
	}
	

}
