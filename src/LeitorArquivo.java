package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LeitorArquivo {
  public static HashMap<String, Personagem> lerPersonagens(String caminho){
    HashMap<String, Personagem> personagens = new HashMap<String, Personagem>();
    File arquivo = new File(caminho);
        try{
        Scanner escaneador = new Scanner(arquivo,"UTF-8");
        System.out.println("...");
        while(escaneador.hasNextLine()){
            String linha =  escaneador.nextLine();
            if(linha.equals("personagem")){
                String id = escaneador.nextLine();
                String nome = escaneador.nextLine();
                int energia = Integer.parseInt(escaneador.nextLine());
                Personagem personagens0 = new Personagem(id, nome, energia);
                    personagens.put(id, personagens0);
            }

        }
        escaneador.close();

        } catch (FileNotFoundException e){
        System.out.println("ERRO: arquivo" + caminho + "não encontrado!");
        }
    
        return personagens;
    }
    HashMap<String, Capitulo> lerCapitulo(String caminho, HashMap<String, Personagem> personagens){
        HashMap<String, Capitulo> capitulos = new HashMap<String, Capitulo>();
        File arquivo2 = new File(caminho);
        try{
        Scanner escaneador = new Scanner(arquivo2,"UTF-8");
        System.out.println("Lendo Capitulos...");
        while (escaneador.hasNextLine()){
            String linha = escaneador.nextLine();
            if(linha.equalsIgnoreCase("capitulo")){
                ArrayList<Escolha> escolhas = new ArrayList<Escolha>();
                String refOrigem = escaneador.nextLine();
                String nome = escaneador.nextLine();
                String texto = escaneador.nextLine();
                String personagem = escaneador.nextLine();
                int alteracaoEnergia = parseInt(escaneador.nextLine());
                Capitulo capitulo = new Capitulo(nome, escolhas, texto, personagens.get(personagem), alteracaoEnergia);
                capitulos.put(refOrigem, capitulo);
            }
            else if(linha.equalsIgnoreCase("escolha")){
                String refOrigem = escaneador.nextLine();
                String escolha = escaneador.nextLine();
                String refSaida = escaneador.nextLine();
                capitulos.get(refOrigem).adicionar(new Escolha(escolha, capitulos.get(refSaida)));

            }
        }
        escaneador.close();
        }
        catch(FileNotFoundException e){
             System.out.println("O Arquivo não foi encontrado neste "+ caminho+ ".");
        }
        
        return capitulos;
    }
    private int parseInt(String nextLine) {
        return 0;
    }

    
    
           
    }





