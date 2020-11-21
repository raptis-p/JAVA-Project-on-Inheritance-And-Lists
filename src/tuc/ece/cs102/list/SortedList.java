package tuc.ece.cs102.list;

public class SortedList extends List {

	public Node insertSorted(Item a) {
		length++;
		Node tmp = new Node(a);
		
		Node n1 = head, n2 = head;

		while ((n1 != null) && (n1.getValue().less(a))) {
			n2 = n1;
			n1 = n1.getNext();
		}
		if (n1 == head) {
			tmp.setNext(n1);
			head = tmp;
		} else {
			n2.setNext(tmp);
			tmp.setNext(n1);
		}
		return head;
	}

}
