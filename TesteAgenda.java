package exercicioav2;

public class TesteAgenda {
	public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();

        // Adicionando alguns contatos para teste
        minhaAgenda.addContatinho(new Contatinho("Zara Silva", "zara@email.com", "83999999", "Estudante"));
        minhaAgenda.addContatinho(new Contatinho("Nick Ferreira", "nick@gmail.com", "83988888", "Professor"));
        minhaAgenda.addContatinho(new Contatinho("Ana Souza", "ana@email.com", "83977777", "Designer"));
        minhaAgenda.addContatinho(new Contatinho("Bruno Lima", "bruno@email.com", "83966666", "Engenheiro"));

        
        minhaAgenda.salvarLista();		// Salvando a lista no arquivo
        
    }
}

