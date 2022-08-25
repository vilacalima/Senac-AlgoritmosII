package Aula02;

public class Empresa {
	
	String nome;
	String endereco;
	String cnpj;
	String ramoAtividade;
	String telefone;
	String email;
	String site;
	
	public Empresa() {
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setramoAtividade(String ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}
	
	public String getRamoAtividade() {
		return ramoAtividade;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setSite(String site) {
		this.site = site;
	}
	
	public String getSite() {
		return site;
	}
	
	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", endereço=" + endereco + ", cnpj=" + cnpj + ", telefone=" + telefone + ", email="
				+ email + ", site=" + site +"]";
	}
}
