package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoUsuario = new Conta();
		contaDoUsuario.saldo = 100;
		contaDoUsuario.deposita(50);
		System.out.println(contaDoUsuario.saldo);
		boolean conseguiuRetirar = contaDoUsuario.saca(20);
		
		System.out.println(contaDoUsuario.saldo);
		System.out.println(conseguiuRetirar);
		
		
		
		
		
		Conta contaDaVisita = new Conta();
		contaDaVisita.deposita(1000);
		
		
		// passar o if dando uma forma de entregar a mensagem
		if(contaDaVisita.transfere(300, contaDoUsuario)) {
			System.out.println("tranferencia feita com sucesso");
		}else {
			System.out.println("faltou dinheiro");
		}
		System.out.println(contaDaVisita.saldo);
		System.out.println(contaDoUsuario.saldo);
		
		
		contaDoUsuario.titular = "Rafaell Mendes";
		System.out.println(contaDoUsuario.titular);
		
		
		
	}
	
	
}
