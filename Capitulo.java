import java.util.Scanner;

public class Capitulo {
    String nome;
    String texto;
    String escolha1;
    String escolha2;
    Personagem personagem;
    int alteracaoEnergia; 

public Capitulo(String nome, String texto, String escolha1, String escolha2, Personagem personagem, int alteracaoEnergia){
    this.nome = nome;
    this.texto = texto;
    this.escolha1 = escolha1;
    this.escolha2 = escolha2;
    this.personagem = personagem;
    this.alteracaoEnergia = alteracaoEnergia;
}
public void mostrar(){
    System.out.println("Nome: " + nome);
    System.out.println("Texto: " + texto);
    System.out.println("Escolha 1: " + escolha1);
    System.out.println("Escolha 2: " + escolha2);
    personagem.mudanca(alteracaoEnergia);
}
public int escolher() {
    int escolha = 0;
    boolean escolhaValida = false;

    while (!escolhaValida) {
    System.out.println("Digite sua escolha (1 ou 2): ");
    escolha = lerEscolhaDoUsuario();

    if (escolha == 1 || escolha == 2) {
    escolhaValida = true;
    } else {
    System.out.println("Escolha inválida. Tente novamente.");
    }
    }

    return escolha;
    }
private int lerEscolhaDoUsuario() {
    Scanner scanner = new Scanner(System.in);

    scanner.close();
    return scanner.nextInt();
        

    }
}
