package aula9_ExercicioPraticoPOO;

public class Pessoa {
	//Atributos
	private String nome;
	private int idade;
	private String sexo;
	
	public void fazerAniversario() {
		this.idade++;
	}
	
	
	
	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}



	//Getters e Setters
	//Nome
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	//Idade
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//sexo
	public String getSexo() {
		return this.sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
