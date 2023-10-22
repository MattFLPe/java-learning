import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	private Set<Aluno> alunosSet;

	public GerenciadorAlunos(){
		this.alunosSet = new HashSet<>();
	};

	public void adicionarAluno(String nome, Long matricula, double media){
		alunosSet.add(new Aluno(nome, matricula, media));
	};

	public void removerAluno(long matricula){
		Aluno alunoParaRemover = null;
		for(Aluno a : alunosSet){
			if(a.getMatricula() == matricula){
				alunoParaRemover = a;
				break;
			};
		};
		alunosSet.remove(alunoParaRemover);
	};

	public void exibirAlunosPorNome(){
		Set<Aluno> alunoPorNome = new TreeSet<>(alunosSet);
		if(!alunosSet.isEmpty()){
		System.out.println(alunoPorNome);
		} else {
			System.out.println("O conjunto está vazio!");
		};
	};

	public void exibirAlunosPorNota(){
		Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorNota());
		if(!alunosSet.isEmpty()){
			alunoPorNota.addAll(alunosSet);
			System.out.println(alunoPorNota);
		} else {
			System.out.println("O conjunto está vazio!");
		};
	};

	public void exibirAlunos(){
		System.out.println(alunosSet);
	};

	public static void main(String[] args) {
    // Criando uma instância do GerenciadorAlunos
    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

    // Adicionando alunos ao gerenciador
    gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
    gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
    gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
    gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

    // Exibindo todos os alunos no gerenciador
    //System.out.println("Alunos no gerenciador:");
    //System.out.println(gerenciadorAlunos.alunosSet);

    // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
    //gerenciadorAlunos.removerAluno(000L);
    //gerenciadorAlunos.removerAluno(123457L);
    //System.out.println(gerenciadorAlunos.alunosSet);

    // Exibindo alunos ordenados por nome
    //gerenciadorAlunos.exibirAlunosPorNome();

    // Exibindo alunos ordenados por nota
    gerenciadorAlunos.exibirAlunosPorNota();
  };
};