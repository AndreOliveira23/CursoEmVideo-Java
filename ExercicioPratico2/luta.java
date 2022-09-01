@SuppressWarnings("unused")
public class Luta {
	private Lutador desafiante;
	private Lutador desafiado;
	private int rounds;
	private boolean aprovada;
	
	public void MarcarLuta(Lutador l1, Lutador l2) {
		if((l1.getCategoria() == l2.getCategoria()) && (!l1.equals(l2))){
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		}else{
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
			System.out.println("Impossivel marcar luta!");	
		}
	}
	
	public void lutar() {
		if(this.aprovada) {
			System.out.println("###DESAFIADO###");
			this.desafiado.apresentar();
			System.out.println("###DESAFIANTE###");
			this.desafiante.apresentar();
			
			int vencedor = (int) Math.round ((0 + Math.random() * (2-0) ));
			switch(vencedor) {
			case 0:
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				System.out.println("Empatou!");
				break;
			
			case 1:
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				System.out.println("Vencedor: Lutador 1: "+this.desafiado.getNome() );
				break;
			
			case 2:
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				System.out.println("Vencedor: Lutador 2: "+this.desafiante.getNome()  );
				break;
			}
		}else {
			System.out.print("Luta nao pode acontecer");	
		}
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}	
}
