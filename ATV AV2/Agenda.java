package exercicioav2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Agenda {

    private List<Contatinho> listaContatos = new ArrayList<>();

    public void addContatinho(Contatinho c) {
    	this.listaContatos.add(c);
    }

    public void ordenarLista() {
        Collections.sort(this.listaContatos, Comparator.comparing(Contatinho::getNome));
    }

    public void salvarLista() {
        try {
            this.ordenarLista(); // garantindo a ordenação antes de salvar
            FileWriter fw = new FileWriter("Lista_Contatinhos.txt");

            for (Contatinho c : this.listaContatos) {
                fw.write(c.toString() + "\n");
            }

            fw.close();
            System.out.println("Arquivo contatinhos.txt salvo com sucesso!");

        }
        catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo.");
        }
    }
    
    
    public Contatinho buscaPorNome(String nomeBusca) {
        File f = new File("Lista_Contatinhos.txt");

        
        if (!f.exists()) {		// Verifica se o arquivo existe antes de tentar ler
            System.out.println("Arquivo de agenda não encontrado: " + "Lista_Contatinhos.txt");
            return null;
        }

        try (Scanner sca = new Scanner(f)) {
            
            while (sca.hasNextLine()) {		// verificando cada linha do arquivo
                String linha = sca.nextLine();
                String[] dados = linha.split("#");             
                if (dados.length == 4) {		// Verifica se a linha tem o formato esperado
                    String nomeArquivo = dados[0];                   
                    if (nomeArquivo.equalsIgnoreCase(nomeBusca)) {            // Compara o nome da linha atual com o nome buscado
                        return new Contatinho(dados[0], dados[1], dados[2], dados[3]);
                    }
                }
            }
        }
        catch (FileNotFoundException e) {
           System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
        }
        
        return null;
    }
}
