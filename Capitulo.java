import java.util.Scanner;
public class Capitulo {
    private String nome;
    private String texto;
    private Escolha[] escolhas;
    private Personagem personagem;
    private int alteracaoEnergia;
    private Scanner scan = new Scanner(System.in);
    

public Capitulo(String nome, String texto, Personagem personagem, int alteracaoEnergia){
    this.nome = nome;
    this.texto = texto;
    this.personagem = personagem;
    this.alteracaoEnergia = alteracaoEnergia;
}

public String getNome() {
    return this.nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getTexto() {
    return this.texto;
}

public void setTexto(String texto) {
    this.texto = texto;
}

public Escolha[] getEscolhas() {
    return this.escolhas;
}

public void setEscolhas(Escolha[] escolhas) {
    this.escolhas = escolhas;
}

public Personagem getPersonagem() {
    return this.personagem;
}

public void setPersonagem(Personagem personagem) {
    this.personagem = personagem;
}

public int getAlteracaoEnergia() {
    return this.alteracaoEnergia;
}

public void setAlteracaoEnergia(int alteracaoEnergia) {
    this.alteracaoEnergia = alteracaoEnergia;
}

public Scanner getScan() {
    return this.scan;
}

public void setScan(Scanner scan) {
    this.scan = scan;
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
    escolhas[minhasEscolhas].getPcapitulo().mostrar();


}
public void executar(){
    int minhasEscolhas = escolher(scan);
    escolhas[minhasEscolhas].getPcapitulo().mostrar();
}

public int escolher(Scanner scanner) {
    boolean escolhaValida = true;

    while (escolhaValida) {
        System.out.println("Digite 1 ou 2 para escolher o rumo da história): ");
        String escolha = scan.nextLine();

        for (int i = 0; i < escolhas.length; i++)

            if (escolha.equalsIgnoreCase(escolhas[i].getTexto())) {
                
                return 0;
            }else if(escolha.equalsIgnoreCase(escolhas[i+1].getTexto())){
                
                return 1;
            } else {
                System.out.println("Escolha inválida. Tente novamente.");
            }
    

    
    }
    return 0;
    }


}
