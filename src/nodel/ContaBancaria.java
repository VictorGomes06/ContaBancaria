package nodel;

public class ContaBancaria {
	private int numeroConta;
	private String titular;
	private String escolha;
	private double saldo;
	private double deposito;
	private double retirada;

	public ContaBancaria() {

		this.numeroConta = 0;
		this.titular = "";
		this.escolha = "S";
		this.saldo = 0;
		this.deposito = 0;
		this.retirada = 0;

	}

	public ContaBancaria(int numeroConta, String titular, double saldo, String escolha, double deposito,
			double retirada) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
		this.escolha = escolha;
		this.deposito = deposito;
		this.retirada = retirada;

	}

	public double Deposito(double valor) {
		return this.saldo += valor;
	}

	public double Retirada(double valor) {
		return this.saldo -= valor + 5.00;
	}

	public double getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getEscolha() {
		return escolha;
	}

	public void setEscolha(String escolha) {
		this.escolha = escolha;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getRetirada() {
		return retirada;
	}

	public void setRetirada(double retirada) {
		this.retirada = retirada;
	}

}
