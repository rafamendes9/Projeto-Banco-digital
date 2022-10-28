
public class Conta {
	// private quer dizer q ele n pode ser lido ou modificado A NAO SER A PROPRIA
	// CLASSE

	private double saldo;
	private int agencia;
	private int numero;
	
	
	
	
	
	
	
	// isso facilita sempre q a pessoa for criar uma nova conta ja recebe cliente e
	// n precisa
	// " para todo usuario novo ter q implemnter new conta e cliente" so que se ele
	// tiver
	// o msm usuario ja cadastrado e quiser abrir uma conta nova" diferente" n serve
	// !!!
	// Cliente titular = new Cliente();

	private Cliente titular;
	
	
	
	
	
	
	// static quer dizer da classe conta e nao algo dentro da classe conta
	// ele é quase uma variavel global fora da classe q ele está inserida
    private static int total;
    
    
    
    
    
//metodo especial ou rotina de inicialização vinculada a classe ( por isso tem o mesmo nome da classe)
	// ( so é executado uma unica vez quando vc constroi o usando o "= new")
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("o total de contas fica em : "+ total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("estou criando uma conta " + this.numero);

	}

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
	// no caso o valor do atributo saldo
	// nome " getSaldo" onde get é uma convencao e o get vc PEGA algo

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	// nome " set " onde set é uma convencao e o set vc modifica ou coloca algo
	public void setNumero(int Numero) {
		if (agencia <= 0) {
			System.out.println("nao pode valor menor ou igual a zero");
			return;
		}
		this.numero = Numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("nao pode valor menor ou igual a zero");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	//esse metodo é da classe por ser static ou seja " semiglobal" 
	// n precisa de criar uma instacia em outras classe pra chamar ele
	//podendo ser chamado junto do nome da classe
	//EX: Conta.getTotalDaClasse()
	// nao pode mandar partes dos codigos q n seja estatico ou seja n pegas valores q n sejam static da mesma classe
	public static int getTotalDaClasse() {
		return Conta.total;
	}
}
