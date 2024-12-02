package classes;

public class Cliente {
/*
* Atributos(caracteristicas) da classe cliente
* os atribuitos são do cliente e, portanto, são privados
*/
		private String nome;
		private String email;
		private String cpf;
		private Integer idade;
		
/*
 * Métodos de acesso ao atribuitos da classe Cliente.
 * com eles vamos enviar dados e podemos resgatar dos dados
 */
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
		public void setIdade (Integer idade) {
			this.idade = idade;
		}
		
		
		
		
		
		public String cadastrar() {
			String msg = "o cliente "+nome+" foi cadastrado";
			return msg;
		}
}
