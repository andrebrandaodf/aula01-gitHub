package cadastro;

public class Cliente {

	public int codigoCliente;
	public String nome;
	public int idade;
	public int celular;
	public String endereco;
	public String complemento;
	public String bairro;
	public String cidade;
	public int cep; 
		
	
	public Cliente(int codigoCliente2, String nome2, int idade2, int celular2, String endereco2, String complemento2, String bairro2, String cidade2, int cep2, int codigoCliente) {
		super();
		this.codigoCliente = codigoCliente;
		this.nome = nome;
		this.idade = idade;
		this.celular = celular;
		this.endereco = endereco;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}


	public int getCodigoCliente() {
		return codigoCliente;
	}


	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getCelular() {
		return celular;
	}


	public void setCelular(int celular) {
		this.celular = celular;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public int getCep() {
		return cep;
	}


	public void setCep(int cep) {
		this.cep = cep;
	}
	
	public String toString() {
		
		return "Código Cliente: " + 
				codigoCliente + " \n" 
				+
				"Nome: " + 
				nome + " \n" +
				"Idade: " + 
				idade + " \n" +
				"Celular: " +
				celular + " \n" + 
				"Endereço: " +
				endereco + " \n" +
				"Complemento: " +
				complemento + " \n" +
				"Bairro: " + 
				bairro + " \n" +
				"Cidade: " + 
				cidade + " \n" +
				"CEP: " + 
				cep; 
				
	}
}	