package company;

import computers.Computers;

import tuc.ece.cs102.list.Item;

public class ComputerItem extends Item {
	
	private Computers comp ;
	
	
	
	//Constructor
	public ComputerItem(Computers com) {
		this.comp = com;
	}
	
	
	
	
	
	
	//Methods From Item
	public Object key() {
		return comp.getCompSerialNo();

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
		comp.print();

	}
	
	public Object getData(){
		return this.comp;
	}
	
	public String toString() {
		return comp.toString();

	}
}
