package intCaixa;

public class TADAApp {

	public static void main(String[] args) {
		
		IntBox minhaCaixa = new IntBox();

		System.out.println("E numere guardade ne caixe eh " + minhaCaixa.getElement());
		minhaCaixa.setElement(4);
		System.out.println("E numere guardade ne caixe eh " + minhaCaixa.getElement());
		minhaCaixa.setElement(3);
		System.out.println("E numere guardade ne caixe eh " + minhaCaixa.getElement());
		minhaCaixa.setElement(2);
		System.out.println("E numere guardade ne caixe eh " + minhaCaixa.getElement());
		minhaCaixa.setElement(1);
		System.out.println("E numere guardade ne caixe eh " + minhaCaixa.getElement());

	}

}
