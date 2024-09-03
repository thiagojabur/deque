public class Deque {
	protected int size;
	protected Node head;
    protected Node tail;
    
	public Deque() {
		size = 0;
		head = null;
		tail = null;		
	}

	
	public void addFront(Node first) {
		if (size ==0) {
			head = tail = first;
			size = size+1;
			return;
		}
		//se a lista não for vazia
		first.setNext(head);
		head = first;
		size = size+1;

		return;
	}
	
	
	
	public void addRear(Node last) {
		
		if (size ==0) {
			head = tail = last;
			size = size+1;
			return;
		}
		//se a lista não for vazia
		tail.setNext(last);
		tail = last;
		size = size+1;
	}
	
	public String removeRear() {
		//remove o último do deque
		Node aux;
		if (size ==0) {
			return "";
		}
		if (size==1) {
			aux = head;
			head = tail = null;
			size = 0;
		}
		else {
			//tem mais de um elemento
			aux = tail;
			Node aux2 = head;
			//descobrindo o anterior do aux
			for (int i = 0; i<size-2; i++)
				aux2 = aux2.getNext(); 
			tail = aux2;
			tail.setNext(null);
			size = size-1;
		}
		return aux.getElement();
	}
	
	public String removeFront() {
		Node aux;
		if (size ==0) {
			return "";
		}
		if (size ==1) {
			aux = head;
			head = tail = null;
			size = 0;
		} else {
			aux = head;
			head = head.getNext();
			aux.setNext(null);
			size = size -1;
		}
		return aux.getElement();
	}
	
	public String front() {
		return head.getElement().toString();
	}
	

	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	public String toString() {
			Node auxNode = head;
			
			String retorno = "[ ";
			for (int i=0; i<size; i++) {
				retorno += auxNode.getElement() + " ";
				auxNode = auxNode.getNext();
			}
			retorno += "]";
			return retorno;
	}   
}