
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testando Deque");
		
		Node primeiro = new Node("Thiago");
		Node segundo = new Node("Vinícius");
		Node terceiro = new Node("Murilo");
		Node quarto = new Node("Paulo");
		Node quinto = new Node("Ricardo");
		
		Deque deque = new Deque();
		
		deque.addRear(primeiro);
		deque.addRear(segundo);
		deque.addRear(terceiro);
		deque.addRear(quarto);
		deque.addRear(quinto);
		
		System.out.println(deque);
		
		System.out.println("Saiu do deque: " + deque.removeRear());
		
		//System.out.println(" Tail " + deque.tail.getElement());
		System.out.println("Saiu do deque: " + deque.removeRear());
		
		System.out.println("Saiu da frente do deque: " + deque.removeFront());

		System.out.println(deque);
		
		deque.addFront(quinto);
		System.out.println(deque);
		 
	}

}
