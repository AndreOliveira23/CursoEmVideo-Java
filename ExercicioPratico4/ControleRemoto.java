public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//Construtor
	public ControleRemoto(){
		this.setVolume(50);
		this.ligado = false;
		this.tocando = false;
	}
	
	//Métodos Abstratos
	@Override  
	public void ligar() {
		this.setLigado(true);
	}
	@Override 
	public void desligar() {
		this.setLigado(false);
	}
	@Override 
	public void abrirMenu() {
		System.out.println("***********MENU**********");
		System.out.println("Esta ligado? "+this.getLigado());
		System.out.println("Esta tocando? "+this.getTocando());
		System.out.print("Volume: "+this.getVolume());
		for(int i=1; i<=this.getVolume(); i+=10) {
			System.out.print("|");
		}
		System.out.printf("\n**************************\n");
	} 
	@Override 
	public void fecharMenu() {
		System.out.println("Fechando menu...");
	}
	@Override 
	public void aumentarVolume() {
		if(this.getLigado() == true) { this.setVolume(getVolume()+5); } else { System.out.println("Impossivel aumentar volume!"); } ;
	}
	@Override 
	public void diminuirVolume() {
		if(this.getLigado() == true) { this.setVolume(getVolume()-5); } else { System.out.println("Impossivel aumentar volume!"); }
	}
	@Override 
	public void ligarMudo() {
		if(this.getLigado() == true && this.getVolume() > 0) this.setVolume(0);
	}
	@Override 
	public void desligarMudo() {
		if(this.getLigado() == true && this.getVolume() == 0) this.setVolume(50);
	}
	@Override 
	public void play() {
		if(this.getLigado() == true && this.getTocando() == false) this.setTocando(true);
	}
	@Override 
	public void pause() {
		if(this.getLigado() == true && this.getTocando() == false) this.setTocando(false);
	}
	
	//GETTERS E SETTERS
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean getLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean getTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}	
}
