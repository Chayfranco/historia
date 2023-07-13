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
    if (escolhas != null){
        for (String escolha : escolhas) {
        System.out.println(escolha);
    }
    }
    if(personagem != null) {
        personagem.mudanca(alteracaoEnergia);
    }

}
public int escolher(Scanner scanner) {
    boolean escolhaValida = true;

    while (escolhaValida) {
        System.out.println("Digite sua escolha (1 ou 2): ");
        String escolha = scan.nextLine();

        for (int i = 0; i < escolhas.length; i++)

            if (escolha.equalsIgnoreCase(escolhas[i])) {
                
                return 0;
            }else if(escolha.equalsIgnoreCase(escolhas[i+1])){
                
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
