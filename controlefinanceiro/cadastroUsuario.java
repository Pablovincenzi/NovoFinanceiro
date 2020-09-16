package controlefinanceiro;

public class cadastroUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuarios teste = new Usuarios();
		teste.setCodigo(-1);
		teste.setNome("Pablo Vincenzi");
		teste.setSenha("123456");
		System.out.println(teste.getCodigo() + teste.getNome()+teste.getSenha());
		System.out.println(teste.autenticaSenha());

	}

}
