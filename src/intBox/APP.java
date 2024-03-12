package intBox;

public class APP {

	public static void main(String[] args) {
		
		Caixa box = new Caixa();
		
		Aluno a;
		
		box.add(new Aluno("Pato", "1"));
		Aluno x = new Aluno("Pato2", "12");
		box.add(x);
		box.add(new Aluno("Pato3", "123"));
		box.add(new Aluno("Pato4", "1234"));
		box.add(new Aluno("Pato5", "12345"));
		
		System.out.println(box.size());
		
		box.print();
		
		box.removeInde(0);
		
		box.removeElem(x);
		
		box.removeElem(new Aluno("Pato8", "12345678"));
		
		box.print();
		
		System.out.println(box.size());
		

	}

}
