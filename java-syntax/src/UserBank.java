import java.util.Locale;
import java.util.Scanner;


public class UserBank {

	public static void main(String[] args){

			BankInterface bank = new BankInterface();
			Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

			

			bank.sacarConta();
			//double valorSaque = scanner.nextDouble();
		

	}
}