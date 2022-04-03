package dio.projeto.banco;

public class Runner {
	private static final String Corrente = null;

	public static void main(String[] args) {

		Cliente.setNome("matheus");
		Cliente.setNumero(21354132);
		

		Conta.depositar(10, corrente);
		
		Conta.transferir(5, poupanca);

		Conta.depositar(10);
		Conta.transferir(10, "Poupanca");

		Conta.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
