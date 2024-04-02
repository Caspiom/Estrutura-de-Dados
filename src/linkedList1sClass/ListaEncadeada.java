package linkedList1sClass;

public class ListaEncadeada {
	
	private ListNode head;
	private ListNode tail;
	private ListNode previous;
	private int size;
	
	private class ListNode{
		private Object element;
		private ListNode next;
		
		private ListNode(Object e, ListNode n) {
			element = e;
			next = n;
		}
	}
	
	public ListaEncadeada(){
		size = 0;
		head=tail=previous=null;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (head==null);
	}
	
	public boolean add(Object element){
		ListNode newElement = new ListNode(element, null);
		if(head==null) {
			head=tail=newElement;
		} else {
			tail.next=newElement;
		}
		tail=newElement;
		size++;
		return true;
	}
	
	public void clear() {
		head=tail=null;
		size=0;
	}
	
	public void print() {
		if(head==null) {
			System.out.println("<------Lista Vazia XD------>");
		}else {
			System.out.println("<------Lista------>");
			ListNode itr = head;
			while(itr!=null) {
				System.out.println(itr.element);
				itr=itr.next;
			}
		}
	}
	
	public void findPrevious(int index) {
		ListNode itr = head;
		previous=null;
		
		for(int i =0; i<size;i++) {
			if (i==index) {
				return;
			}
			previous = itr;
			itr = itr.next;
		}
		return;
	}
		
	public Object get(int index){
		if(index<0 || index>size-1) {
			throw new IndexOutOfBoundsException("Index=" +index+ " e Size=" +size);
		} else {
			if(index==0) {
				return head.element;
			}
			findPrevious(index);
			return previous.next.element;
		}
	}
	

	
	public int IndexOf(Object element) {
		ListNode itr=head;
		previous=null;
		
		for(int i = 0;i<size;i++) {
			if(itr.element.equals(element)) {
				return i;
			} else {
				previous=itr;
				itr= itr.next;
			}
		}
		previous = null;
		return -1;
	}
	
	public void add(Object element, int index) {
	    if (index<0 || index>size)
		    throw new IndexOutOfBoundsException("Index="+index+" e Size="+size );
		else {
		if (index==0) { //insere o elemento na posicao head
		if (head==null) { // insere em uma lista vazia
			ListNode newElement=new ListNode(element,null);
			head=tail=newElement;
		}
		else { // insere em uma lista com um ou mais elementos
			ListNode newElement=new ListNode(element,head);
			head=newElement;
		}
		}
		else {
			findPrevious(index);
			ListNode newElement=new ListNode(element,previous.next);
			previous.next=newElement;
			if (newElement.next==null) // o novo elemento e o novo tail
			tail=newElement;
		}
		}
			size++;
	}
	
	public Object remove(int index) {
	    if (index<0 || index>=size)
	        throw new IndexOutOfBoundsException("Index="+index+" e Size="+size);
	    else {
	        Object elementRemoved;
	        if (index==0) { // remove o elemento na posição head
	            elementRemoved = head.element;
	            head = head.next;
	            if (head==null) // se a lista ficou vazia
	                tail=null;
	        }
	        else {
	            findPrevious(index);
	            elementRemoved = previous.next.element;
	            previous.next = previous.next.next;
	            if (previous.next==null) // o elemento removido era o tail
	                tail=previous;
	        }
	        size--;
	        return elementRemoved;
	    }
	}

	public boolean remove(Object element) {
	    int index = IndexOf(element);
	    if (index <= -1) {
	        return false; // elemento não encontrado
	    } else {
	        remove(index);
	        return true;
	    }
	}
	
}


