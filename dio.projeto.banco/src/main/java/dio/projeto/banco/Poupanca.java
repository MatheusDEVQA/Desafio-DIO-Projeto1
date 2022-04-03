package dio.projeto.banco;

public class Poupanca extends Conta {
	public Poupanca(String cliente) {
		super(cliente)
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
