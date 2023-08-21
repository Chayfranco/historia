package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class LeitorArquivo {
    // esse metodo é usado para carregar os personagens colocado no arquivo personagem.txt
  public HashMap<String, Personagem> carregarPersonagens(String caminho) {
    HashMap<String, Personagem> personagens = new HashMap<String, Personagem>();

    File arquivo = new File(caminho);
    try {
      Scanner escaneador = new Scanner(arquivo, "UTF-8");

      System.out.println("Carregando personagens...");
      while (escaneador.hasNextLine()) {
        String id = escaneador.nextLine();
        String nome = escaneador.nextLine();
        int energia = Integer.parseInt(escaneador.nextLine());

        escaneador.nextLine();

        personagens.put(id, new Personagem(nome, energia));

      }
      escaneador.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    return personagens;

  }
// esse metodo é usado para carregar os capitulos colocado no arquivo capitulo.txt e tambem para carregar as escolhas 
// que estão dentro dos capitulos 
  public HashMap<String, Capitulo> carregarCapitulos(String caminho, Map<String, Personagem> personagens,
      Scanner escaneadorDoConsole) {

    HashMap<String, Capitulo> capitulos = new HashMap<String, Capitulo>();

    File arquivo = new File(caminho);
    try {
      Scanner escaneadorDeArquivo = new Scanner(arquivo,"UTF-8");

      System.out.println("Carregando capitulos...");
      String linha = escaneadorDeArquivo.nextLine();
      while (escaneadorDeArquivo.hasNextLine()) {

        if (linha.equals("CAPITULO") ||
            linha.equals("CAPITULO_COM_IMAGEM")) {

          escaneadorDeArquivo.nextLine();
          String id = escaneadorDeArquivo.nextLine();

          if (linha.equals("CAPITULO")) 
          {
            capitulos.put(id, new Capitulo(personagens, escaneadorDoConsole, escaneadorDeArquivo));
          } 
          else if (linha.equals("ESCOLHA")) 
          
          {
            LerEscolha(capitulos, escaneadorDeArquivo);
          }

          escaneadorDeArquivo.nextLine();

        } else if (linha.equals("ESCOLHA")) {
          LerEscolha(capitulos, escaneadorDeArquivo);

        }
        linha = escaneadorDeArquivo.nextLine();
      }
      escaneadorDeArquivo.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    return capitulos;

  }
// esse metodo é usado para ler as escolhas que estão dentro dos capitulos listados no arquivo capitulo.txt
// e tambem para adicionar as escolhas dentro dos capitulos
  private void LerEscolha(HashMap<String, Capitulo> capitulos, Scanner escaneadorDeArquivo) {

    escaneadorDeArquivo.nextLine();
    String idCapituloDe = escaneadorDeArquivo.nextLine();
    escaneadorDeArquivo.nextLine();
    String idCapituloPara = escaneadorDeArquivo.nextLine();
    escaneadorDeArquivo.nextLine();
    String textoDigitado = escaneadorDeArquivo.nextLine();
    escaneadorDeArquivo.nextLine();
    String textoMostrado = escaneadorDeArquivo.nextLine();

    capitulos.get(idCapituloDe)
        .adicionarEscolha(new Escolha(textoDigitado, textoMostrado, capitulos.get(idCapituloPara)));

  }

}


