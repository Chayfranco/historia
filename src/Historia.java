package src;

import java.util.HashMap;
import java.util.Scanner;

public class Historia {
    public static void main(String[] args) throws Exception {
        LeitorArquivo leitor = new LeitorArquivo();
        HashMap<String, Personagem> personagens = LeitorArquivo.lerPersonagens("src/rsc/personagem.txt");
        HashMap<String, Capitulo> capitulos = leitor.lerCapitulo("src/rsc/capitulo.txt", personagens);
       
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();


        System.out.println("Bem-vindo(a) à história de Malu, Ana e Rodrigo!\n");
        System.out.println("Nesta aventura emocionante, você irá acompanhar a vida de Malu, uma talentosa tenista que vê seus sonhos "
        +"serem interrompidos por um grave acidente. Após entrar em um coma profundo, sua família, composta por Ana e Rodrigo, aguarda "
        +"ansiosamente por notícias sobre seu estado de saúde.\n");
        System.out.println("Ao longo da história, você terá o poder de fazer escolhas que irão influenciar o destino dos personagens."
        +" Será que Ana e Rodrigo seguirão suas vidas separadamente, ou o amor irá florescer entre eles? E quando Malu finalmente acordar "
        +"do coma, como ela irá reagir às mudanças que aconteceram durante seu período de inconsciência?\n");
        System.out.println("Prepare-se para mergulhar em um enredo cheio de reviravoltas, emoções intensas e decisões que moldarão o "
        +"futuro dos personagens. Suas escolhas determinarão os caminhos que a história irá tomar, revelando os desafios, os amores e as "
        +"surpresas que aguardam Malu, Ana e Rodrigo.\n");
        System.out.println("Boa sorte e aproveite essa incrível jornada!");


        
        Capitulo raiz = capitulos.get("a");
        raiz.executar();

        System.out.println("Bem-vindo(a) à história de Malu, Ana e Rodrigo!\n");
        System.out.println("Nesta aventura emocionante, você irá acompanhar a vida de Malu, uma talentosa tenista que vê seus sonhos "
        +"serem interrompidos por um grave acidente. Após entrar em um coma profundo, sua família, composta por Ana e Rodrigo, aguarda "
        +"ansiosamente por notícias sobre seu estado de saúde.\n");
        System.out.println("Ao longo da história, você terá o poder de fazer escolhas que irão influenciar o destino dos personagens."
        +" Será que Ana e Rodrigo seguirão suas vidas separadamente, ou o amor irá florescer entre eles? E quando Malu finalmente acordar "
        +"do coma, como ela irá reagir às mudanças que aconteceram durante seu período de inconsciência?\n");
        System.out.println("Prepare-se para mergulhar em um enredo cheio de reviravoltas, emoções intensas e decisões que moldarão o "
        +"futuro dos personagens. Suas escolhas determinarão os caminhos que a história irá tomar, revelando os desafios, os amores e as "
        +"surpresas que aguardam Malu, Ana e Rodrigo.\n");
        System.out.println("Boa sorte e aproveite essa incrível jornada!");


        
    }

    
}




