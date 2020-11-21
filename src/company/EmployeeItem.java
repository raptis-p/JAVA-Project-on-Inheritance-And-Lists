package company;

import employees.Employees;
import tuc.ece.cs102.list.Item;

public class EmployeeItem extends Item {
	private Employees emp;
	
	
	
	//Constructor
	public EmployeeItem(Employees Em) {
		this.emp = Em;
	}
	
	
	//Methods from Item
	public Object key() {
		return emp.getEmpName();

	}
	
	public boolean equals(Item o) {
		return key().equals(o.key());

	}
	
	
	
	public boolean less(Item o) {
		if (((String) key()).compareTo((String) o.key()) < 0)
			return true;
		return false;

	}
	
	
	public void print() {
		emp.print();

	}
	
	
	public Object getData(){
		return this.emp;
	}
	
	
	public String toString() {
		return emp.toString();

	}
	
	
	
}
