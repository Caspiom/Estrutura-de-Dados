package intBox;

public class Aluno {
	
	private String nome;
	private String matricula;
	
	public Aluno(String nome) {
		this.nome = nome;
		matricula = "000000000";
	}
	
	public Aluno(String nome, String matricula) {
		this.nome=nome;
		this.matricula=matricula;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setMatricula(String matricula) {
		this.matricula=matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public boolean equals(Object o) {
		Aluno a=(Aluno)o;
		return this.nome.equals(a.nome);
		}
		
	
	public String toString() {
		return "Nome: " +nome+ "| Matricula: " +matricula;
	}

}
