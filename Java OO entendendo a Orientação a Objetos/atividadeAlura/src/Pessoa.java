
public class Pessoa {
	   String nome;
	    String cpf;
	    int idade;
	    
	  //  Endereco endereco; 
	  //  esse era o problema da questao
	  // pq ele n criava um new endereco oq levava para a proxima classe 
	    
	    Endereco endereco = new Endereco();

}
