package lista;

public class ListaApp {
	
	public static void main(String[] args) {
		
	Lista minhaLista = new Lista();
	
	/*minhaLista.add(3);
	minhaLista.add(5);
	minhaLista.add("Maria");
	minhaLista.add(1, 10);*/
	
//	minhaLista.add(new Aluno("Everton", "123"));
//	minhaLista.removePosicao(0);
	Aluno a = new Aluno("Zulu", "321");
	minhaLista.add(a);
	Aluno b = new Aluno("Zulu2", "4321");
	minhaLista.add(b);
	Aluno c = new Aluno("Zulu3", "54321");
	minhaLista.add(c);
	minhaLista.add(new Aluno("Zulu4", "100"));
	
	
	System.out.println(minhaLista.size());
	minhaLista.print();
	
	minhaLista.removePosicao(0);

	minhaLista.removeConteudo("Zulu4", "100");
	minhaLista.add(1, c);
	
	System.out.println(minhaLista.size()); 
	
	minhaLista.print();
	
}

}
