package lista;

public class Lista {

	private Object[] elements;
	private int capacity;
	private int size;

	public Lista() {
		capacity = 5;
		elements = new Object[capacity];
		size = 0;
	}

	public Lista(int capacity) {
		this.capacity = capacity;
		elements = new Object[capacity];
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void print() {
		if (size == 0) {
			System.out.println("Lista Vazia!");
		} else {
			System.out.println("<-------Início------->");
			for (int i = 0; i < size; i++) {
				System.out.println(elements[i]);
			}
			System.out.println("<-------Fim------->");
		}
	}

	public int indexOf(Object elem) {
		for (int i = 0; i < size; i++) {
			if (elements[i].equals(elem)) {
				return i;
			}
		}
		return -1;
	}
	public boolean add(Object elem) {
		aumenteCapacidadeSeNecessario();
		elements[size] = elem;
		size++;
		return true;
	}
	private void aumenteCapacidadeSeNecessario() {
		if (size == capacity) {
			Object[] newElements = new Object[capacity *= 2];
			for (int i = 0; i < size; i++) {
				newElements[i] = elements[i];
			}
			elements = newElements;
		}
	}
	public void clear() {
		for(int i = 0; i < size; i ++) {
			elements[i] = null;
		}
		size = 0;
	}
	public Object get(int index) {
		if(index<0 || index>size-1) {
			throw new IndexOutOfBoundsException("Index = " + index + " Size = " + size);
		} else {
			return elements[index];
		}
	}
	
	public void add(int index, Object elem) {
		if (index<0 || index>size) {
			throw new IndexOutOfBoundsException("Index = " + index + " Size = " + size);
		} else {
			aumenteCapacidadeSeNecessario();
			for(int i = size; i > index; i--) {
				elements[i] = elements[i-1];
			}
			elements[index] = elem;
			size++;
		}
	}
	public Object removePosicao(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index = " + index + " Size = " + size);
		}
		
		Object removedElement = elements[index];
		
		for(int i = index; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
		size--;
		
		return removedElement;
	}
	public boolean removeConteudo(Object elem) {
		int index = indexOf(elem);
		
		if(index != -1) {
			removePosicao(index);
			return true;
		}
		return false;
	}
	
	public boolean removeConteudo(String nome, String numero) {
		for(int i = 0; i<=size;i++)
			if(elements[i] instanceof Aluno) {
	            Aluno aluno = (Aluno) elements[i];
	            if(aluno.getNome().equals(nome) && aluno.getMatricula().equals(numero)) {
				removePosicao(i);
		return true;
		}
	}
		return false;
}
}
