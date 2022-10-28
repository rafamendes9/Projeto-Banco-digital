
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		
		//conta esta correto para programacao mas incorreto para a logica 
		//conta.setAgencia(-50);
		//conta.setAgencia(-330);
		
		
		System.out.println("na agencia "+conta.getAgencia());
		
		
		conta.setAgencia(123456789);
		
		Conta conta2 = new Conta(1337, 433457);
		Conta conta3 = new Conta(1337, 753564);
		
		
		System.out.println(Conta.getTotalDaClasse());
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
