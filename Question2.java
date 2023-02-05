package assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

public class Question2 {
    public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		List<Employee> targetList=new ArrayList<Employee>();
		
		empList.add(new Employee(101,"Amrit",15000));
		empList.add(new Employee(102,"Aaditya",150000));
		empList.add(new Employee(103,"Anup",20000));
		empList.add(new Employee(104,"Aniket",35000));
		empList.add(new Employee(105,"Mahesh",25000));
		
		targetList = empList.stream().map(e->new Employee(e.id, e.name, e.salary+0.1*e.salary)).collect(Collectors.toList());
		System.out.println(targetList);
	}
}
