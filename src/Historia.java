package src;

import java.util.Map;
import java.util.Scanner;

public class Historia {
    public static void main(String[] args) throws Exception {
        LeitorArquivo leitor = new LeitorArquivo();
        Map<String, Personagem> personagens = leitor.carregarPersonagens("src/rsc/personagem.txt");
        Map<String, Capitulo> capitulos = leitor.carregarCapitulos("src/rsc/capitulo.txt", personagens, new Scanner(System.in));

        Capitulo raiz = capitulos.get("a");
        raiz.executar();




        
    }

    
}


