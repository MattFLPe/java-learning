import java.util.Set
import java.util.HashSet

public class ConjuntoPalavrasUnicas {
	private Set<Palavra> palavraSet;

	public ConjuntoPalavrasUnicas {
		this.palavraSet = new HashSet<>();
	};

	public void adicionarPalavra(String palavra){
		palavraSet.add(new Palavra(palavra));
	};

	public void removerPalavra(String palavra){
		Palavra palavraParaRemover = null;
		for(Palavra p : palavraSet){
		if(p.getPalavra() == palavra){
			palavraParaRemover = p;
			break;
		};

		
	};
		palavraSet.remove(palavraParaRemover);
	};



	public void exibirPalavrasUnicas(){
		System.out.println(palavraSet);
	};


};