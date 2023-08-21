package src;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Capitulo {
  private String texto;
  protected ArrayList<Escolha> escolhas;
  private Personagem personagem1;
  private int variacaoEnergiaPersonagem1;
  protected Scanner escaneador;

  protected Capitulo() {
    this.texto = "";
    this.escolhas = new ArrayList<Escolha>();
  }
// Esse contrutor é usado para criar o capitulo raiz
  public Capitulo(Map<String, Personagem> personagens, Scanner escaneadorDoConsole, Scanner escaneadorDeArquivo) 
  {
    this.LerCapitulo(personagens, escaneadorDeArquivo);
    this.escaneador = escaneadorDoConsole;
    this.escolhas = new ArrayList<Escolha>();
  }
// esse metodo é usado para criar os outros capitulos
  protected void LerCapitulo(Map<String, Personagem> personagens, Scanner escaneadorDeArquivo) {

    escaneadorDeArquivo.nextLine();
    String idPersonagem1 = escaneadorDeArquivo.nextLine();
    this.personagem1 = personagens.get(idPersonagem1);

    escaneadorDeArquivo.nextLine();
    String linha = escaneadorDeArquivo.nextLine();
    this.texto = "";
    while (!linha.equals("VARIACOES")) {

      if (linha.equals(idPersonagem1)) {
        texto = texto + personagem1.getNome();
      } else {
        texto = texto + linha;
      }
      linha = escaneadorDeArquivo.nextLine();

    }
    this.variacaoEnergiaPersonagem1 = Integer.parseInt(escaneadorDeArquivo.nextLine());

  }
// esse metodo é usado para adicionar as escolhas dentro dos capitulos
  public void adicionarEscolha(Escolha escolha) {
    escolhas.add(escolha);

  }
  // esse metodo é usado para executar os capitulos
  public void executar() {
    mostrar();

    if (escolhas.size() > 0) {
        int idCapituloEscolhido = escolher();
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println();
        escolhas.get(idCapituloEscolhido).getProximo().executar();
    } else {
        System.out.println("FIM");
    }
}
// esse metodo é usado para mostrar os capitulos
protected void mostrar(){
    System.out.println(texto);
    personagem1.setEnergia(variacaoEnergiaPersonagem1);

    for (int i = 0; i < escolhas.size(); i++) {
        System.out.println(" - " + escolhas.get(i).getTextoDigitado());
    }

    System.out.print("Escolha: ");
}

  public int escolher() {

    int opcaoEscolhida = 0;
    String escolha;
    boolean escolhaValida = false;

    while (!escolhaValida) {

      escolha = escaneador.nextLine();
      for (int i = 0; i < escolhas.size(); i++) {
        if (escolha.equalsIgnoreCase(escolhas.get(i).getTextoDigitado())) {
          escolhaValida = true;
          opcaoEscolhida = i;
        }
      }

      if (!escolhaValida) {

        System.out.println("Escolha inválida");
      }
    }

    return opcaoEscolhida;
  }

}