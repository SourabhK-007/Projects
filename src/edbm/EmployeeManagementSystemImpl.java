package edbm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import customexception.EmployeeNotFoundException;
import customexception.InvalidChoiceException;
import customsorting.SortById;
import customsorting.SortByName;
import customsorting.SortBySal;
import customsorting.SortByage;

public class EmployeeManagementSystemImpl implements EmployeeManagementSystem {
	Scanner sc=new Scanner(System.in);
	Map<String,Employee> db=new LinkedHashMap<String,Employee> ();
	@Override
	public void addEmployee() {
		//Accepting age
		System.out.println("enter age");
		int age=sc.nextInt();

		//accepting name
		System.out.println("enter name");
		String name=sc.next();

		//accepting marks
		System.out.println("enter sal");
		double sal=sc.nextDouble();

		Employee emp=new Employee( age, sal, name);
		db.put(emp.getId(), emp);
		System.out.println("Employee successfully inserted");
		System.out.println("id:"+emp.getId()+"\tName:"+emp.getName());
		System.out.println("---------------------------------------");

	}

	@Override
	public void displayEmployee() {
		// TODO Auto-generated method stub
		System.out.println("enter Id");
		String id=sc.next().toUpperCase();
		if(db.containsKey(id)) {

			Employee e=db.get(id);        // getting Employeeent object

			System.out.println("EMPLOYEE DETAILS");
			System.out.println("----------------");
			System.out.println("id:"+e.getId());
			System.out.println("name:"+e.getName());
			System.out.println("age:"+e.getAge());
			System.out.println("marks:"+e.getSal());
			System.out.println("-----------------");
		}
		else {
			try {
				throw new EmployeeNotFoundException("Employe with id:"+id+" is not found");

			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void removeEmployee() {
		System.out.println("enter id:");
		String id=sc.next();
		if(db.containsKey(id)) {
			db.remove(id);
			System.out.println("EMployee with id:"+id+" is removed");
		}
		else {
			try {
				throw new EmployeeNotFoundException("Employe with id:"+id+" is not found");

			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void removeAllEmployee() {
		if(db.size()>0) {
			System.out.println("no. of Employeeent records:"+db.size());
			db.clear();
			System.out.println("all Employeeents record deletedv successfully");
		}
		else {
			try {
				throw new EmployeeNotFoundException("Insufficient Employee records to delete");

			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void countEmployee() {
		System.out.println("No. of Employees are:"+db.size());

	}

	@Override
	public void displayAllEmployee() {
		// TODO Auto-generated method stub
		if(db.size()>0) {

			System.out.println("Employeeen records are as follows");
			System.out.println("---------------------------");
			Set<String> keys=db.keySet();
			for(String key:keys) {
				System.out.println(db.get(key));
			}
		}
		else {
			try {
				throw new EmployeeNotFoundException("No record to display");

			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}




	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		System.out.println("enter id");
		String id=sc.next().toUpperCase();
		if(db.containsKey(id)) {

			System.out.println("Employee record found");

			Employee emp=db.get(id); // getting Employee object based on id
			System.out.println("1:update age\n2:update name\n3:update marks\n enter choice");
			int choice=sc.nextInt();
			switch (choice)
			{

			case 1:
				System.out.println("enter age");
				int age=sc.nextInt();
				emp.setAge(age);
				System.out.println("age updated successfuly")  ; 
				break;
			case 2:
				System.out.println("enter age");
				String name=sc.next();
				emp.setName(name);
				System.out.println("name updated successfully");
				break;
			case 3:
				System.out.println("enter age");
				double sal=sc.nextDouble();
				emp.setSal(sal);
				System.out.println("Marks updated successfully");
				break;
			default:
			{
				try {
					String message="invalid choice,kindly enter valid one";
					throw new InvalidChoiceException (message);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}

			System.out.println("-------------------------------");

			}
		}
		else {
			try {
				throw new EmployeeNotFoundException("Employee with id:"+id+" is not found");

			}
			catch(Exception e)
			{
				e.getMessage();
			}
		}

	}

	@Override
	public void sortEmployee() {
		// TODO Auto-generated method stub

		if(!db.isEmpty())
		{
			// convert map to set
			Set<String> keys=db.keySet();

			//refVar of list and Obj of Arr.List(upcast)
			List<Employee> list=new ArrayList<Employee>();

			//traversing keys
			for(String key: keys)
			{
				list.add(db.get(key));   //getting Employee obj storing it in list
			}

			System.out.println("1:Sort by id\n2:Sort by age\n3:Sort by name\n4:Sort by sal");
			System.out.println("enter choice");
			int choice=sc.nextInt();
			switch(choice) 
			{
			case 1:Collections.sort(list,new SortById());
			display(list);
			break;
			
			case 2:Collections.sort(list,new SortByage());
			display(list);
			break;

			case 3:Collections.sort(list,new SortByName());
			display(list);
			break;
			
			case 4:Collections.sort(list,new SortBySal());
			display(list);
			break;

			default: try {
				String message="invalid choice,kindly enter valid one";
				throw new InvalidChoiceException (message);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			}
		}
		else {
			try {
				String message="No records to sort";
				throw new EmployeeNotFoundException(message);

			}
			catch(Exception e) {
				System.out.println(e.getMessage());

			}
		}
		System.out.println("---------------------------------------------");
	}


	// **************************************************
	private static void display(List<Employee> list)
	{
		for(Employee e: list) {
			System.out.println(e);
		}

	}

	// **************************************************



	@Override
	public void sortwithHigestsal() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sortwithlowestsal() {
		// TODO Auto-generated method stub

	}

}
