
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
	//	conta.setNumero(24226);
		
		System.out.println("numero conta: " +conta.getNumero());
		
		Cliente rafaell = new Cliente();
		//conta.titular = paulo;
		//rafaell.nome = "rafaell mendes";
		//nao funciona mais devido ser private
		
		rafaell.setNome("rafaell mendes");
		
		conta.setTitular(rafaell);
		
		System.out.println("nome que esta em titular: " + conta.getTitular().getNome());
		
		
		
		
		
		//  (
		conta.getTitular().setProfissao("programador");
		// ou " em duas linhas os mesmo codigo do 20 em 22 e 23
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		//   )
		
		
		
		
		
		
	}
}
