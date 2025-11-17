package exercicioav2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ler a tabuada dele: ");
        if(sc.hasNextInt()) {
        	int num = sc.nextInt();
            String tabuada = "tabuada_" + num + ".txt";
            File f = new File(tabuada);
            
            try {
            	Scanner sca = new Scanner(f);
            	System.out.println(tabuada);

                // 3. Lê e imprime cada linha do arquivo
                while (sca.hasNextLine()) {
                    String linha = sca.nextLine();
                    System.out.println(linha);
                	}
            
            
         // 4. Fecha o scanner do arquivo
            sca.close();
            }

            catch (FileNotFoundException e) {
            // 5. Captura o erro se o arquivo não existir
            System.out.println("\nERRO: O arquivo '" + tabuada + "' não foi encontrado.");
            System.out.println("Certifique-se de que a tabuada do número " + tabuada + " foi gerada anteriormente.");
            }

        }
        else {
        System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }

        sc.close(); // Fecha o scanner do teclado
    }}