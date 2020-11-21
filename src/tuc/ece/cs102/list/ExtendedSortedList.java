package tuc.ece.cs102.list;




public class ExtendedSortedList extends SortedList{

	
	public ExtendedSortedList()
	{
		super();
	}

	public Item searchbykey(String key){
		Node tmpNode = head;
		while (tmpNode != null){
			if (tmpNode.getValue().key().equals(new String(key))){
				return tmpNode.getValue();
			}
			tmpNode = tmpNode.getNext();
		}
		return null;
	}
	
	
	
	
	public void printItemsInHierarchy(String ClassName)  
	{
		Node tmpNode = head;
		if (tmpNode==null)  
			{
			System.out.println("Empty list...");
			return;
			}
		try {
			while (tmpNode!=null)
				
			{
				if (Class.forName("computers."+ClassName).isInstance(tmpNode.getValue().getData()))
				{
					tmpNode.getValue().print();
					tmpNode = tmpNode.getNext();
				}
				else{
					tmpNode=tmpNode.getNext();
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");
			return;
		}
		return;
		
	}

	
	
	
	
	
	
	
	
}
