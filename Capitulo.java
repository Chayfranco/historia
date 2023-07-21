import java.util.Scanner;
public class Capitulo {
    String nome;
    String texto;
    Escolha[] escolhas;
    Personagem personagem;
    int alteracaoEnergia;
    Scanner scan = new Scanner(System.in);
    

public Capitulo(String nome, String texto, Personagem personagem, int alteracaoEnergia){
    this.nome = nome;
    this.texto = texto;
    this.personagem = personagem;
    this.alteracaoEnergia = alteracaoEnergia;
}
public void mostrar(){
    System.out.println("Nome: " + nome);
    System.out.println("Texto: " + texto);
    if(escolhas == null) {
        System.out.println("Não há mais escolhas, pois a história chegou ao fim. Retorne o jogo para reviver outra perspectiva da história.");;
    }
   
    if(personagem != null) {
        personagem.mudanca(alteracaoEnergia);
    }
    
    int minhasEscolhas = escolher(scan);
    escolhas[minhasEscolhas].pcapitulo.mostrar();


}
public void executar(){
    int minhasEscolhas = escolher(scan);
    escolhas[minhasEscolhas].pcapitulo.mostrar();
}

public int escolher(Scanner scanner) {
    boolean escolhaValida = true;

    while (escolhaValida) {
        System.out.println("Digite 1 ou 2 para escolher o rumo da história): ");
        String escolha = scan.nextLine();

        for (int i = 0; i < escolhas.length; i++)

            if (escolha.equalsIgnoreCase(escolhas[i].texto)) {
                
                return 0;
            }else if(escolha.equalsIgnoreCase(escolhas[i+1].texto)){
                
                return 1;
            } else {
                System.out.println("Escolha inválida. Tente novamente.");
            }
    

    
    }
    return 0;
    }


}
