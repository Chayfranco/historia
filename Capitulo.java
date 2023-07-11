import java.util.Scanner;
public class Capitulo {
    String nome;
    String texto;
    String[] escolhas;
    Personagem personagem;
    int alteracaoEnergia;
    Scanner scan = new Scanner(System.in);
    

public Capitulo(String nome, String texto, String[] escolhas, Personagem personagem, int alteracaoEnergia){
    this.nome = nome;
    this.texto = texto;
    this.escolhas = escolhas;
    this.personagem = personagem;
    this.alteracaoEnergia = alteracaoEnergia;
}
public void mostrar(){
    System.out.println("Nome: " + nome);
    System.out.println("Texto: " + texto);
    System.out.println("As escolhas são:");
    for (String escolha : escolhas) {
        System.out.println(escolha);
    }
    if(personagem != null) {
        personagem.mudanca(alteracaoEnergia);
    }

}
public int escolher(Scanner scanner) {
    boolean escolhaValida = false;

    while (!escolhaValida) {
        System.out.println("Digite sua escolha (1 ou 2): ");
        String escolha = scan.nextLine();
        for (int i = 0, i < escolhas.length; i++)

        if (escolha.equalsIgnoreCase(escolhas[0])) {
            escolhaValida = true;
            return 0;
        }else if(escolha.equalsIgnoreCase(escolhas[1])){
            escolhaValida = true;
            return 1;
        } else {
            System.out.println("Escolha inválida. Tente novamente.");
        }
    

    
    }
    return 0;
    }
public int escolher(Capitulo ind) {
    return 0;
}


}
