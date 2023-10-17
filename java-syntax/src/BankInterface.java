import java.util.Locale;
import java.util.Scanner;

public class BankInterface {

Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

double saldoConta = 20.0;

public void escolherOperacao(){

	System.out.println("O que deseja fazer?\n 1 - Saque\n 2 - Depósito\n 3 - Consultar saldo");
	int operacao = scanner.nextInt();

	switch(operacao){

		case 1:
			sacarConta();
		break;
		case 2:
			depositarConta();
		break;
		case 3:
			consultarSaldo();
		break;

		default: 
			System.out.println("Operação inválida! Escolha de 1 a 3!");

	};

	System.out.println("Deseja realizar outra operação?\n 1 - Sim\n 2 - Não");
	int resposta = scanner.nextInt();
	if(resposta == 1)
		escolherOperacao();
	else 
		System.out.println("Obrigado pela utilização dos nossos serviços!");
	
};
	
public void sacarConta(){
	
	System.out.println("Digite o valor que deseja sacar (apenas números decimais, ex: 5.0):");
	double valorSaque = scanner.nextDouble();
			
	if(valorSaque > saldoConta)
		System.out.println("Saldo insuficiente!");
	else if(valorSaque == 0.0) 
		System.out.println("Informe um valor de saque maior do que zero!");
	else 
		saldoConta = saldoConta - valorSaque;
		System.out.println("Operação concluída!");
		System.out.println("O saldo atual de sua conta é: R$ " + saldoConta);

};

public void depositarConta(){

		System.out.println("Digite o valor que deseja depositar (apenas números decimais, ex: 5.0):");
		double valorDeposito = scanner.nextDouble();

		if(valorDeposito <= 0.0)
			System.out.println("Informe um valor maior do que zero!");
		else
		saldoConta = saldoConta + valorDeposito;
		System.out.println("Operação concluída!");
		System.out.println("O saldo atual de sua conta é: " + saldoConta);

	};
	
public void consultarSaldo(){
	System.out.println("O saldo da sua conta bancária é de: R$" + saldoConta);
};

};


