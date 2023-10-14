import java.util.Locale;
import java.util.Scanner;

public class BankInterface {

Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

double saldoConta = 50.0;


public void sacarConta(){

	System.out.println("Digite o valor que deseja sacar:");
	double valorSaque = scanner.nextDouble();

	if(saldoConta <= 0.0)
		System.out.println("Saldo insuficiente");
	else 
		saldoConta = saldoConta - valorSaque;
		System.out.println("O novo saldo de sua conta é: " + saldoConta);

		

}



public void depositarConta(double valorDeposito){

		System.out.println("Digite o valor que deseja depositar:");
		valorDeposito = scanner.nextDouble();


		saldoConta = saldoConta + valorDeposito;
		System.out.println("O novo saldo de sua conta é: " + saldoConta);

	};


	
public void transferirConta(double valorTransfere){

	System.out.println("Digite o valor que deseja transferir:");
	valorTransfere = scanner.nextDouble();

	if(saldoConta <= 0.0)
		System.out.println("Saldo insuficiente");
	else 
		saldoConta = saldoConta - valorTransfere;
		System.out.println("O novo saldo de sua conta é: " + saldoConta);
}
	
public void consultarSaldo(){
	System.out.println("O saldo da sua conta bancária é de: R$" + saldoConta);
}

public void imprimirSaldo(){
	System.out.println("Saldo sendo imprimido... aguarde");
}


};

