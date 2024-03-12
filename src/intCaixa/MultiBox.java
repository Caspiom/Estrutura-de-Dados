package intCaixa;
import java.util.Random;

public class MultiBox {
	
	private int[] elements; // array para armazenar os números na caixa
	private int size; // número de elementos existentes na caixa
	private int capacity; // capacidade da caixa!
	
	public MultiBox() {
		size=0;
		capacity=5;
		elements=new int[capacity];
	}
	
	public MultiBox(int capacity) {
		size=0;
		this.capacity=capacity;
		elements=new int[capacity];
	}
	
	public boolean estaVazia() {
		return (size==0);
    }
	
	private void aumenteCapacidadeSeNecessario() {
		if(size==capacity) {
			int [] newElements = new int[capacity*=2];
			for(int i=0; i<size; i++) 
				newElements[i]=elements[i];
			elements=newElements;
		}
	}

	public void guardeEsteNumero(int element) {
		aumenteCapacidadeSeNecessario();
        elements[size]=element;
		size++;
	}
	
	public int meDeUmNumero() {
		Random gerador=new Random();
		return elements[gerador.nextInt(size)];
	}
}
