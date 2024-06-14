package linkedList1sClass;

public class App {

	public static void main(String[] args) {
		
		ListaEncadeada minhaLista = new ListaEncadeada();
		

		System.out.println(minhaLista.size());
		
		Aluno aluno = new Aluno("Pato4");
		
		minhaLista.add("Pato1");
		minhaLista.add("Pato2");
		minhaLista.add("Pato3");
		minhaLista.add(aluno);

		

		minhaLista.print();
		
		System.out.println(minhaLista.size());
		
		minhaLista.remove(0);
		minhaLista.remove(aluno);
		minhaLista.remove("Pato3");
		
		minhaLista.print();
		
		System.out.println(minhaLista.size());
		
		
	}

}
