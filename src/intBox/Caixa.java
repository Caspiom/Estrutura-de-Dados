package intBox;

public class Caixa {
	
	private Object [] elements;
	private int capacity;
	private int size;
	
	public Caixa() {
		size = 0;
		capacity = 5;
		elements = new Object[capacity];
	}
	
	public Caixa(int capacity) {
		this.capacity = capacity;
		elements = new Object[capacity];
		size = 0;
	}
	
	public int size() {
		return size; 
	}
	
	public boolean isEmpty() {
		return (size==0);
	}
	
	public void print() {
		if (size==0) {
			System.out.println("Nenhum elemento contido dentro do sistema");
		}
		if(size>0) {
			for(int i = 0; i<size; i++) {
				System.out.println(elements[i]);
			}
			System.out.println("=================================");
		}
	}
	
	public int indexOf(Object elem) {
		for(int i = 0; i < size; i++) {
			if(elements[i].equals(elem)) {
				return i;
			}
		}
		return -1;
	}
	
	public void aumentaCapacidade() {
		if(size == capacity) {
			Object [] newElements = new Object[capacity*=2];
			for(int i = 0; i < size; i++) {
				newElements[i]=elements[i];
			}
			elements=newElements;
		}
	}
	
	public void add(Object elem) {
		aumentaCapacidade();
		elements[size]=elem;
		size++;
	}
	
	public void addIndex(Object elem, int index) {
		if(index<0 || index>=size) {
			throw new IndexOutOfBoundsException("Index =" +index + " Size =" +size);
		} else
			for(int i = size; i>index; i--) {
				elements[i] = elements[i-1];
			}
		elements[index] = elem;
		size++;
	}
	
	public void clear () {
		for(int i = 0; i < size; i++) {
			elements[i]=null;
		}
		size = 0;
	}
	
	public Object get(int index) {
		if(index<0 || index>=size ) {
			throw new IndexOutOfBoundsException("Index =" + index + " Size =" +size);
			} else {
				return elements[index];
		}
	}
	
	public void remove(int index) {
		if(index<0 || index>size) {
			throw new IndexOutOfBoundsException("Index =" +index + "Size =" +size);
		}else {
			for(int i = index; i < size - 1; i++) {
			elements[i] = elements[i+1];
			}
			size--;
		}
	}
	
	public boolean remove(Object elem) {
		for(int i = 0; i < size; i++) {
		if(elements[i].equals(elem)) {
		remove(i);
		return true;
		}
	}
	return false;
	}
	
	
	
		
	

}
