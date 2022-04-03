package dio.projeto.banco;

public abstract class Conta {
	private static final int agc = 2;
	private static int sequencia = 1;

	protected int agencia;
	protected int numero;
	protected int senha;
	protected double saldo;
	public Cliente cliente;
	private static double saldoCorrente;
	private static double saldoPoupanca;

	public Conta(Cliente cliente) {
		this.agencia = agc;
		this.numero = sequencia++;
		this.cliente = cliente;
	}
	
	public void imprimirExtrato(String conta ) {
		System.out.println("=== Extrato Conta "+ conta+ " é iugual a " + );
		
		while((conta.equalsIgnoreCase("poupança") | conta.equalsIgnoreCase("corrente"))){
			
			
			if(conta.equalsIgnoreCase("poupança")) System.out.println("=== Extrato Conta "+ conta+ " é iugual a " );
			else if(conta.equalsIgnoreCase("Corrente"))
	}
		
		
	

	
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	
	public static double[] depositar(double valor, String conta) {
		while((conta.equalsIgnoreCase("poupança") | conta.equalsIgnoreCase("corrente"))){
			
		
		if(conta.equalsIgnoreCase("poupança")) saldoPoupanca += valor;
		else if(conta.equalsIgnoreCase("Corrente")) saldoCorrente += valor;
		 }
		double[] saldo = {saldoPoupanca, saldoCorrente};
		return saldo;
	}

	
	public void transferir(double valor, String conta) {
		this.sacar(valor);
		Conta.depositar(valor, conta);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldoPounca() {
		return saldoPoupanca;
	}
	public double getSaldoCorrente() {
		return saldoCorrente;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
