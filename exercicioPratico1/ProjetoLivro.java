package aula9_ExercicioPraticoPOO;

public class ProjetoLivro {
	public static void main(String args[]) {
		Pessoa[] p = new Pessoa[3];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Andre", 20, "M");
		p[1] = new Pessoa("Kai", 19, "F");
		p[2] = new Pessoa("Helena", 18, "F");
		
		l[0] = new Livro("Java: Como Programar", "Deitel", 1250, p[0]);
		l[0] = new Livro("Economia e ADM", "Brackley", 850, p[1]);
		l[0] = new Livro("Quimica e Quimica", "Ross", 4250, p[2]);
		
		l[0].abrir();
		l[0].folhear(200);
		
		System.out.println(l[0].detalhes());
		
	}
}
