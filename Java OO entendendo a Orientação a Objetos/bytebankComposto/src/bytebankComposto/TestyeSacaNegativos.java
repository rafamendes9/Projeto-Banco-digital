package bytebankComposto;

public class TestyeSacaNegativos {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(100);
		
		// sempre usar os metodos como se fosse uma interface
		//System.out.println(conta.saca(101));
		System.out.println(conta.saca(101));
		
		// e NUNCA usar os atributaos do metodo
		//System.out.println(conta.saldo);
	    //System.out.println(conta.saldo);
		
		// sempre use " . " para invocar o metodo e nao " = " para atribuir ao metodo
		// n queremos q a linha 20 ocorra !!!
		//conta.saldo = conta.saldo - 101;
		//System.out.println(conta.saldo);
				
		conta.saca(101);
		
		System.out.println(conta.getSaldo());
	}

}
