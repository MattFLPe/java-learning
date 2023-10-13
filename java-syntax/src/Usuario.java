public class Usuario {

	public static void main(String[] args) {

			SmartTv smartTv = new SmartTv();



	smartTv.ligar();
	System.out.println("TV ligada: " + smartTv.ligada);


	
	
	System.out.println("Canal atual: " + smartTv.canal);
	
	smartTv.aumentarVolume();

	//smartTv.diminuirVolume();

	smartTv.mudarCanal(23);
	System.out.println("Novo canal: " + smartTv.canal);

	//smartTv.diminuirCanal();
	//System.out.println("Novo canal: " + smartTv.canal);

};
};
   