package exercicioav2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        System.out.print("Digite o nome do contatinho que deseja buscar: ");
        String nome = sc.nextLine();

        Contatinho resultado = agenda.buscaPorNome(nome);

        if (resultado != null) {
            System.out.println("\nContatinho encontrado:");
            System.out.println(resultado.toString());
        } else {
            System.out.println("Contatinho não encontrado.");
        }

        sc.close();

	}

}
