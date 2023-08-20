package src;
import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
    private String nome;
    private String texto;
    private ArrayList<Escolha> escolhas;
    private Personagem personagem;
    private int alteracaoEnergia;
    private Scanner scan = new Scanner(System.in);
    private Object[] Escolha;
    private Personagem protagonista;
    

public Capitulo(String nome, String texto, Personagem personagem, int alteracaoEnergia){
    this.nome = nome;
    this.texto = texto;
    this.escolhas = new ArrayList<>();
    this.personagem = protagonista;
    this.alteracaoEnergia = alteracaoEnergia;
}


public void adicionar(Escolha Escolha){
    escolhas.add(Escolha);
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

public ArrayList<Escolha> getEscolhas() {
    return this.escolhas;
}

public void setEscolhas(ArrayList<Escolha> escolhas) {
    this.escolhas = escolhas;
}

public Personagem getPersonagem() {
    return this.personagem;
}

public void setPersonagem(Personagem personagem) {
    this.personagem = personagem;
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
    ((Escolha) Escolha[minhasEscolhas]).getPcapitulo().mostrar();


}

public void executar(){
    int minhasEscolhas = escolher(scan);
    ((Escolha) Escolha[minhasEscolhas]).getPcapitulo().mostrar();
}

public int escolher(Scanner scanner) {
    boolean escolhaValida = true;

    while (escolhaValida) {
        System.out.println("Digite 1 ou 2 para escolher o rumo da história): ");
        String escolha = scan.nextLine();

        for (int i = 0; i < Escolha.length; i++)

            if (escolha.equalsIgnoreCase(((Escolha) Escolha[i]).getTexto())) {
                
                return 0;
            }else if(escolha.equalsIgnoreCase(((Escolha) Escolha[i+1]).getTexto())){
                
                return 1;
            } else {
                System.out.println("Escolha inválida. Tente novamente.");
            }
    

    
    }
    return 0;
    }



}
