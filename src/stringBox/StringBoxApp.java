package stringBox;

public class StringBoxApp {

	public static void main(String[] args) {
		
		StringBOx caixa = new StringBOx();
		

		
		if(caixa.isEmpty()) {
			System.out.println("A caixa está vazia!");
			System.out.println("=================================================");
		} else {
			System.out.println("Um dos alunos na caixa é o aluno: " + caixa.getAName());
			System.out.println("A matricula dele é: " + caixa.getARes());
			System.out.println("=================================================");
		}
		
		caixa.setThisNameAndRes("Carlos", "100011110");
		caixa.setThisNameAndRes("Lucas", "200022220");
		caixa.setThisNameAndRes("Joao", "300033330");
		caixa.setThisNameAndRes("Pedro", "400044440");
		caixa.setThisNameAndRes("Davi", "500055550");
		caixa.setThisNameAndRes("Jorel", "600066660");
		caixa.setThisNameAndRes("Vini", "700077770");
		
		String [] Resposta = caixa.getANameAndRes();
		
		for(int i = 0; i<10; i++)
		if(caixa.isEmpty()) {
			System.out.println("A caixa está vazia!");
			System.out.println("=================================================");
		} else {
			System.out.println("Um dos alunos na caixa é o aluno: " + Resposta[0]);
			System.out.println("A matricula dele é: " + caixa.getARes());
			System.out.println("=================================================");
		}
	}

}
