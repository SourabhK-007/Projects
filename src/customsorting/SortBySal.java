package customsorting;

import java.util.Comparator;

import edbm.Employee;

public class SortBySal implements Comparator<Employee>{

	@Override
	public int compare(Employee x, Employee y) {
		Double a=x.getSal();
		Double b=y.getSal();
		return a.compareTo(b);	}
	

}
