package controlefinanceiro;

public abstract class Pessoas {
	private int codigo;
	private String nome;
	private String senha;
	
	public boolean autenticaSenha(String senha) {
		if(senha ==this.senha) {
			return true;
		}else
			return false;
	}
	
	// GETs e SETS
	public int getCodigo() {
		return codigo;		
	}
	public void setCodigo(int codigo) {
		if (this.codigo<=0) {
			System.out.println("Imposs�vel cadastrar este c�digo");
			return;
		
	}}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
// Fim classe Usu�rio
	

}
