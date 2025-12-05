package exercicioav2;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um número inteiro para gerar a tabuada: ");	// Pedindo o número ao usuário
        if (sc.hasNextInt()) {
            num = sc.nextInt();
            String tabuada = "tabuada_" + num + ".txt";	// Nome do arquivo onde a tabuada será salva
            try {
            	
            	FileWriter fw = new FileWriter(tabuada, false);		// Escrevendo no arquivo
                PrintWriter pw = new PrintWriter(fw);

                // Escrevendo a tabuada no arquivo
                pw.println("Tabuada do " + num + ":");
                for (int i = 1; i <= 10; i++) {
                    int resultado = num * i;
                    String linha = num + " x " + i + " = " + resultado;
                    pw.println(linha); // Escreve a linha no arquivo
                }

                pw.close();
                fw.close();	// Fechando os fluxos de escrita

                System.out.println("A tabuada do " + num + " foi salva com sucesso no arquivo: " + tabuada);
            } catch (IOException e) {
                System.err.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
            }		// Tratando erros

        } else {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }

        sc.close(); // Fechando o scanner
    }
}

