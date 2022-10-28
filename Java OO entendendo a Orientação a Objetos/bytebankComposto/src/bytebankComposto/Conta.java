package bytebankComposto;

public class Conta {
	// private quer dizer q ele n pode ser lido ou modificado A NAO SER A PROPRIA
	// CLASSE

	private double saldo;
	int agencia;
	int numero;
	// isso facilita sempre q a pessoa for criar uma nova conta ja recebe cliente e
	// n precisa
	// " para todo usuario novo ter q implemnter new conta e cliente" so que se ele
	// tiver
	// o msm usuario ja cadastrado e quiser abrir uma conta nova" diferente" n serve
	// !!!
	// Cliente titular = new Cliente();

	Cliente titular;

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
		// ou podia usar
		// this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {

			this.saldo = this.saldo - valor;
			// ou podia usar
			// this.saldo -= valor;
			return true;
		} else {

			return false;

		}

	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}

	}
// esse metodo é uma forma de pegar atributos, etc..  private e retornar eles sem modificar o valor baso 
	//no caso o valor do atributo saldo
	//nome " getSaldo" onde get é uma convencao e o get vc PEGA algo
	//nome " set " onde set é uma convencao e o set vc modifica ou coloca algo
	public double getSaldo() {
		return this.saldo;
	}

	
	
	
	
	
	
}
