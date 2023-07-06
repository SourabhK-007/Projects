package edbm;

public class Employee {
private String id;
private int age;
private double sal;
private String name;
static int count=101;
public Employee( int age, double sal, String name) {
	super();
	this.id = "EMP"+count;
	this.age = age;
	this.sal = sal;
	this.name = name;
	count++;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static int getCount() {
	return count;
}
public static void setCount(int count) {
	Employee.count = count;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id:"+id+"\tName:"+name+"\tAge:"+age+"\tsal:"+sal;
	}


}
