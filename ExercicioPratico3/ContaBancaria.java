public class ContaBancaria {
	//Atributos
	public int numConta;
	protected String tipoConta;
	private String nomeCorrentista;
	private float saldo;
	private boolean status;
	
	//Métodos GETTERS E SETTERS
	
	//Número da conta
	public int getNumConta(){
		return this.numConta;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	//Tipo da conta
	public String getTipoConta() {
		return this.tipoConta;
	}
	
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	//Nome - Correntista
	public String getNomeCorrentista() {
		return this.nomeCorrentista;
	}
	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}
	
	//Saldo
	public float getSaldo(){
		return this.saldo;
	}
	
	public void setSaldo(float saldo){
		this.saldo = saldo;
	}
	
	//Status (Aberta ou fechada)
	public boolean getStatus(){
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	//MÉTODOS 'COMUNS'
	public void AbrirConta(String nome, String tipo){
		
		this.setNomeCorrentista(nome);
		this.setTipoConta(tipo);
		
		
		if(this.tipoConta == "CC") {
			this.setSaldo(50);
		}else if(this.tipoConta == "CP"){
			this.setSaldo(150);
		}
		
		this.setStatus(true);
	}
	
	public void fecharConta() {
		System.out.println(this.saldo == 0 ? this.status = false : this.saldo > 0? "Erro! A conta precisa estar zerada para realizar o cancelamento" : "Erro! Existe um saldo devedor na conta!");
	}
	
	public void depositar(float montante) {
		System.out.print("Novo Saldo: ");
		System.out.println(this.status == true ? this.saldo+=montante :"Erro! A conta nao esta ativa");
	}
	
	public void sacar(float montante) {
		System.out.print("Novo Saldo: ");
		System.out.println(this.status == true && this.saldo-montante >=0  ? this.saldo-=montante : "Erro! A conta nao esta ativa ou o valor desejado e superior ao disponivel ");
	}
	
	public void pagarMensalidade() {
		if(this.status == true && this.getTipoConta() == "CC" && this.getSaldo() >= 12) {
			this.saldo-=12;
		}else if(this.status == true && this.getTipoConta() == "CP" && this.getSaldo() >= 20) {
			this.saldo-=20;
		} else {
			System.out.println("Impossivel pagar a mensalidade");
		}
	}
	
	public void info() {
		System.out.println("**********************INFORMACOES DA CONTA**********************");
		System.out.println("Numero da Conta: "+this.getNumConta());
		System.out.println("Tipo de Conta: "+this.getTipoConta());
		System.out.println("Nome do(a) Correntista: "+this.getNomeCorrentista());
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Status da Conta: "+this.getStatus());
		System.out.println("****************************************************************");
	}
	//MÉTODO CONSTRUTOR
	public ContaBancaria(){
		this.saldo = 0;
		this.status = false;
	}
}
/*
 * Atributos (Get e set pra cada um)
+Numero da Conta (Gerar aleatóriamente)
#Tipo da conta (Corrente ou poupança (CC OU CP)
-nome do dono
-saldo
-status (aberta ou fechada)

Métodos
+Abrir conta
Status muda pra aberto
Dizer se é poupança ou correte)
(Se corrente, saldo = 50;
(Se poupança, saldo = 150;

+fechar conta
Saldo tem que ser maior ou igual a zero

+depositar
-Status tem que ser aberto;

+sacar
-Status tem que ser aberto;
-Saldo tem que ficar >= 0;


+PagarMensalidade
-Tira diretamente do saldo quando chamada
this.saldo = saldo-12; (corrente)
this.saldo - saldo-20; (poupança)

*/



/*Classe conta corrente:


MÉTODO CONSTRUTOR:
Status = false;
Saldo = 0;
*/
