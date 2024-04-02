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
	Aluno a = new Aluno("Lucas", "321");
	minhaLista.add(a);
	Aluno b = new Aluno("Pedro", "4321");
	minhaLista.add(b);
	Aluno c = new Aluno("Yuri", "54321");
	minhaLista.add(c);
	minhaLista.add(new Aluno("Caio", "100"));
	Aluno d = new Aluno("Augusto", "654321");
	minhaLista.add(d);
	Aluno e = new Aluno("Renata", "7654321");
	minhaLista.add(e);
	
	
	System.out.println(minhaLista.size());
	minhaLista.print();
	
	minhaLista.removePosicao(0);
	
	minhaLista.removeConteudo(c);

	minhaLista.removeConteudo("Caio", "100");
	
	minhaLista.add(1, c);
	
	System.out.println(minhaLista.size()); 
	
	minhaLista.print();
	
}

}
