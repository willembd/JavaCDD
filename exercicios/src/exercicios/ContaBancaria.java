package exercicios;

public class ContaBancaria {
	private String numeroConta;
	private double saldo;
	
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Deposito Realizado com Sucesso!!: ");
		}else {
			System.out.println("Erro Deposito deve ser Positivo");
		}
	}
	
	public void sacar(double sacar) {
		if(saldo > 0 && sacar <= saldo) {
			System.out.println("Saque Realizado com Sucesso!!");
		}else {
			System.out.println("Erro no Saque");
		}
	}
	
}
