package bytebankComposto;

public class TestaBanco {

	
	public static void main(String[] args) {
		Cliente rafaell = new Cliente();
		rafaell.nome = "Rafaell mendes";
		rafaell.cpf = "222.222.222-22";
		rafaell.profissao = "progamador";
		
		Conta contaDoRafaell = new Conta();
		contaDoRafaell.deposita(100);
		
		//associa o cliente rafaell a conta contaDoRafaell
		contaDoRafaell.titular = rafaell;
		System.out.println(contaDoRafaell.titular.nome);
		System.out.println(contaDoRafaell.titular);
		System.out.println(rafaell);
	}
	
}
