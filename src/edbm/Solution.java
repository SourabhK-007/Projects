package edbm;

import java.util.Scanner;

import customexception.InvalidChoiceException;

public class Solution {
public static void main(String[] args) {
	System.out.println("WELCOME TO EMPLOYEE MANAGEMENT SYSTEM");
	System.out.println("=======================================");
	
	Scanner scan=new Scanner(System.in);
	EmployeeManagementSystem ems=new EmployeeManagementSystemImpl();
	
	while(true) {
		System.out.println("1:add emp\n2:display emp\n3:Display all emp");
		System.out.println("4:remove emp\n5:remove all emp\n6:update Emp");
		System.out.println("7:count emp\n8:sort emp\n9:Sort with highest sal\n10:Sort with lowest sal");
		System.out.println("11:Exit\n\nENTER CHOICE");
		int choice=scan.nextInt();
		
		switch(choice)
		{
		case 1: ems.addEmployee();
		break;
		case 2:ems.displayEmployee();
		break;
		case 3:ems.displayAllEmployee();
		break;
		case 4:ems.removeEmployee();
		break;
		case 5:ems.removeAllEmployee();
		break;
		case 6:ems.updateEmployee();
		break;
		case 7:ems.countEmployee();
		break;
		case 8:ems.sortEmployee();
		break;
		case 9:ems.sortwithHigestsal();
		break;
		case 10:ems.sortwithlowestsal();
		break;
		default: try {
				throw new InvalidChoiceException("Invalid choice");
			}
			catch(Exception e){
				e.getMessage();
			}
		}
		
	}
	
}
}
