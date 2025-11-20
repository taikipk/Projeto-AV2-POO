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

                // Mostrando cada linha do arquivo
                while (sca.hasNextLine()) {
                    String linha = sca.nextLine();
                    System.out.println(linha);
                	}
            
            
         
            sca.close(); // Fecha o scanner do arquivo
            }

            catch (FileNotFoundException e) {
            System.out.println("\nERRO: O arquivo '" + tabuada + "' não foi encontrado.");
            System.out.println("Certifique-se de que a tabuada do número " + tabuada + " foi gerada anteriormente.");
            } // Tratando erros

        }
        else {
        System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }

        sc.close(); // Fecha o scanner do teclado

    }}
