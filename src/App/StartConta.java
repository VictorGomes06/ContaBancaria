package App;

import java.util.Locale;
import java.util.Scanner;

import nodel.ContaBancaria;

public class StartConta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		// https://github.com/VictorGomes06/ContaBancaria.git

		try (Scanner leitor = new Scanner(System.in)) {
			ContaBancaria Conta01 = new ContaBancaria();

			System.out.println("Entre com o número da conta :");
			int conta = leitor.nextInt();
			Conta01.setNumeroConta(conta);
			System.out.println("Entre com o nome do dono da conta :");
			String titular = leitor.next();
			Conta01.setTitular(titular);

			System.out.println("deseja realizar um depósito inícial ? (S/N)");
			String escolha = leitor.next();
			Conta01.setEscolha(escolha);

			switch (Conta01.getEscolha()) {

			case "S": {
				System.out.println("Digite o valor para deposito inicial  : ");
				double valorInicial = leitor.nextDouble();
				Conta01.setSaldo(valorInicial);
				System.out.println(" Dados da conta : " + "conta : " + Conta01.getNumeroConta() + " Dono : "
						+ Conta01.getTitular() + " Saldo : " + Conta01.getSaldo());
				System.out.println("Insira um valor para depósito :");
				double deposito = leitor.nextDouble();
				Conta01.setDeposito(deposito);
				deposito = Conta01.Deposito(deposito);
				System.out.println("Atualização dos dados da conta :" + "conta : " + Conta01.getNumeroConta()
						+ " Dono : " + Conta01.getTitular() + " Saldo : " + Conta01.getSaldo());
				System.out.println("Insira um valor para retirada :");
				double retirada = leitor.nextDouble();
				Conta01.setRetirada(retirada);
				retirada = Conta01.Retirada(retirada);
				System.out.println("Atualização dos dados da conta :" + "conta : " + Conta01.getNumeroConta()
						+ " Dono : " + Conta01.getTitular() + " Saldo : " + Conta01.getSaldo());
				break;
			}
			case "N": {
				System.out.println("Insira um valor para depósito :");
				double deposito = leitor.nextDouble();
				Conta01.setDeposito(deposito);
				deposito = Conta01.Deposito(deposito);
				System.out.println("Atualização dos dados da conta :" + "conta : " + Conta01.getNumeroConta()
						+ " Dono : " + Conta01.getTitular() + " Saldo : " + Conta01.getSaldo());
				System.out.println("Insira um valor para retirada :");
				double retirada = leitor.nextDouble();
				Conta01.setRetirada(retirada);
				retirada = Conta01.Retirada(retirada);
				System.out.println("Atualização dos dados da conta :" + "conta : " + Conta01.getNumeroConta()
						+ " Dono : " + Conta01.getTitular() + " Saldo : " + Conta01.getSaldo());
				break;
			}
			default:
				System.out.println("insira S ou N para inicializar o programa ");

			}
		}

	}

}
