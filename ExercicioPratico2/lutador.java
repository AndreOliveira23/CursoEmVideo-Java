public class Lutador {
	private String nome, nacionalidade, categoria;
	private int idade, vitorias, empates, derrotas;
	private double altura, peso;
//Método Construtor
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, 
					int vitorias, int empates, int derrotas){
		
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setVitorias(vitorias);
		this.setEmpates(empates);
		this.setDerrotas(derrotas);
		this.setAltura(altura);
		this.setPeso(peso);
	}
//Métodos 

	public void apresentar() {
		System.out.println("********************************");
		System.out.println("*Lutador: "+this.getNome());
		System.out.println("*Origem: "+this.getNacionalidade());
		System.out.println("*"+this.getIdade()+" anos");
		System.out.println("*"+this.getAltura()+"m de altura");
		System.out.println("*Peso:"+this.getPeso()+"Kg");
		System.out.println("*"+this.getVitorias()+" vitorias");
		System.out.println("*"+this.getEmpates()+" empates");
		System.out.println("*"+this.getDerrotas()+" derrotas");
		System.out.println("********************************");
	}
	
	public void status() {
		System.out.println(this.getNome()+" e um "+this.getCategoria()+" com "+this.getVitorias()+ " vitorias, "+
		this.getEmpates()+" empates e "+this.getDerrotas()+" derrotas.");
	}
	
	public void ganharLuta() {
		this.setVitorias(getVitorias() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(getEmpates() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(getDerrotas() + 1);
	}
	
	//Getters e Setters
	//Nome
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Nacionalidade
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	//Idade
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//Altura
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//Peso
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
	//Categoria
	public String getCategoria() {
		return this.categoria;
	}
	
	private void setCategoria() {
		if((this.peso<52.2) || (this.peso>120.2)) this.categoria = "Invalido";
		if(this.peso>=52.2 && this.peso<=70.3) this.categoria = "Peso Leve";
		if(this.peso>70.3 && this.peso<=83.9)this.categoria = "Peso medio";
		if(this.peso>83.9 && this.peso<=120.2) this.categoria = "Peso pesado";
	}
	
	//Vitorias
	public int getVitorias() {
		return this.vitorias;
	}
	
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	
	//Empates
	public int getEmpates() {
		return this.empates;
	}
	
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	//Derrotas
	public int getDerrotas() {
		return this.derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
}
	
