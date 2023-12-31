import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

	private List<Tarefa> tarefaList;

	public ListaTarefa(){
		this.tarefaList = new ArrayList<>();
	};

	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	};

	public void removerTarefa(String descricao) {
		List<Tarefa> TarefaParaRemover = new ArrayList<>();
		for(Tarefa t : tarefaList)
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				TarefaParaRemover.add(t);			
			}

	tarefaList.removeAll(TarefaParaRemover);

	};

	public int obterNumeroTotalTarefas(){
		return tarefaList.size();
	};

	public void obterDescricoesTarefas(){
		System.out.println(tarefaList);
	};

	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();

		System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.adicionarTarefa("Tarefa 1"); 
		System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

		listaTarefa.removerTarefa("Tarefa 1");
		System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

		listaTarefa.obterDescricoesTarefas();

	};
};