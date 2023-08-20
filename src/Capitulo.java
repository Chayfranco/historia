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
    private Personagem protagonista;
    

public Capitulo(String nome, ArrayList<Escolha> escolhas,String texto, Personagem personagem, int alteracaoEnergia){
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
    System.out.println("Nome: " + this.nome);
    System.out.println("Texto: " +this.texto);
    System.out.println("Digite 1 ou 2 para escolher o rumo da história): ");
    if(escolhas == null) {
        System.out.println("Não há mais escolhas, pois a história chegou ao fim. Retorne o jogo para reviver outra perspectiva da história.");
    }
    if(personagem != null) {
        personagem.mudanca(alteracaoEnergia);
    }
    

}

public void executar(){
    mostrar();
    escolher();
}

public void escolher() {
    boolean escolhaValida = true;

    while (escolhaValida == true) {
        String escolha = scan.nextLine();

        for (Escolha escolhas : escolhas)

            if (escolhas.getTexto().equalsIgnoreCase(escolha)) {
                escolhaValida = false;
                Capitulo itulo = escolhas.getPcapitulo();
                itulo.executar();


    
        }
        System.out.println("deuséfiel");
    }


}
}
