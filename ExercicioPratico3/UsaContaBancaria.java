public class UsaContaBancaria {
	public static void main (String args[]){
		ContaBancaria c1 = new ContaBancaria();
		
		c1.AbrirConta("Andre","CC");
		c1.setNumConta(23);
		c1.info();
		
		c1.depositar(100);
		c1.info();
		
		c1.sacar(70);
		c1.info();
		/*
		c1.sacar(300);
		c1.info();
		
		c1.depositar(400);
		c1.info();
		
		c1.sacar(600);
		c1.info();
		
		c1.pagarMensalidade();
		c1.info();
		*/
	}
}


/*
-Abrir Conta
-Fechar Conta
-Depositar
-Sacar
-Pagar Mensalidade

*/
