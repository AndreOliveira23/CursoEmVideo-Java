package aula9_ExercicioPraticoPOO;

public class Livro implements Publicacao{
	//Atributos
	private String titulo, autor;
	private int numeroDePaginas, paginaAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	
	public Livro(String titulo, String autor, int numeroDePaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
		this.paginaAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}

	public String detalhes() {
		return "Livro [titulo=" + titulo + ",\n autor=" + autor + ",\n numeroDePaginas=" + numeroDePaginas
				+ ",\n paginaAtual=" + paginaAtual + ",\n aberto=" + aberto + ",\n leitor=" + leitor.getNome() + "]";
	}

	//Geterrs e Setters
	//Título
	public String getTitulo() {
	 	return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	//Autor
	public String getAutor() {
		return this.autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	//Páginas
	public int getNumPaginas() {
		return this.numeroDePaginas;
	}
	
	public void setNumPaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	
	//Pagina Atual
	public int getPaginaAtual() {
		return this.paginaAtual;
	}
	
	public void setPaginaAtual(int PaginaAtual) {
		this.paginaAtual = PaginaAtual;
	}
	
	//Aberto
	public boolean getAberto() {
		return this.aberto;
	}
	
	public void setAberto(boolean Aberto) {
		this.aberto = Aberto;
	}
	
	//Leitor
	public String getLeitor() {
		return this.leitor.getNome();
	}
	
	public void setLeitor(Pessoa Leitor) {
		this.leitor = Leitor;
	}

	@Override
	public void abrir() {
		this.aberto = true;
	}

	@Override
	public void fechar() {
		this.aberto = false;
	}

	@Override
	public void folhear(int pagina) {
		if(pagina > this.numeroDePaginas) {
			this.paginaAtual = 0;
		}else {
			this.paginaAtual = pagina;
		}
	}

	@Override
	public void avancarPagina() {
		this.paginaAtual++;
	}

	@Override
	public void voltarPagina() {
		this.paginaAtual--;
	}
	
}
