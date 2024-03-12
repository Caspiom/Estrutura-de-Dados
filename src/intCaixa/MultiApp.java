package intCaixa;

public class MultiApp {

	public static void main(String[] args) {
		MultiBox MultiCaixa = new MultiBox();
		
		if(MultiCaixa.estaVazia()) {
			System.out.println("A caixa está vazia!");
		} else {
			System.out.println("Um dos números guardado na multicaixa é " + MultiCaixa.meDeUmNumero());
		}
		
		for(int i= 0; i<10000;i++) {
			MultiCaixa.guardeEsteNumero(i);
		}
		
		if(MultiCaixa.estaVazia()) {
			System.out.println("A caixa está vazia!");
		} else {
			System.out.println("Um dos números guardado na multicaixa é " + MultiCaixa.meDeUmNumero());
		}
		
	}

}
