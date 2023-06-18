import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, somos o EDEN! Uma nova experiência que transformará as suas sensasões e emoções através do nosso "
        +"energético. Para te conhcer melhor, como você gostaria de ser chamadx?");
        String nome;
        Scanner cliente = new Scanner(System.in);
        nome = cliente.nextLine();
        System.out.println("Seja bem vindo, " + nome + ", é um prazer lhe atender. A nossa empresa é grata pelo seu interesse" + 
        "e esperamos que todas as suas dúvidas sejam cessadas. Mas antes, nos informe a sua idade para que possamos dar continuidade"
        +" ao nosso atendimento: ");
        int idade;
        Scanner ano = new Scanner(System.in);
        idade = ano.nextInt();
        if(idade >= 18){
            System.out.println(nome+", vimos que você possui a idade suficiente para prosseguirmos com o nosso atendimento. Logo,"
            +" estamos à sua disposição para qualquer dúvida sobre a nossa empresa EDEN");
            System.out.println("Dúvidas frequentes: \n(1)Como funcina a empresa? \n(2)Quais os tipos de energéticos?  \n(3)Outras "
            +"dúvidas \n\nDigite o número referente a sua informação:");
            int duvida;
            Scanner dvd = new Scanner(System.in);
            duvida = dvd.nextInt();
            if (duvida==1){
                System.out.println("A nossa empresa trabalha há 3 anos promovendo o melhor aos nossos clientes. Além do sabor"
                +" imcomparável dos nossos energéticos, a sua fórmula promete te manter acordado 24h por dia, tornando a sua "
                +"produtividade diária em nível máximo. A EDEN não só promete, como cumpre, estando em número 1 de vendas de bebidas"
                +" todos anos meses, desde 2020.");
            }
            if (duvida==2){
                System.out.println("Disponibilizamos sete tipos de deliciosos sabores: \nEDEN pimenta\nEDEN mania\nEDEN Fogarel\nEDEN"
                +" marcante\nEDEN mel\nEDEN veneno\nEDEN sol");
            }
            if (duvida==3){
                System.out.println("Para outras dúvidas, lhe daremos nossos número para atendimento especial. Assim que você ligar,"
                +" o seu atendimento será encaminhado para um dos nossos atendentes, facilitando o nosso contato.");
            }

        
        } else {
            System.out.println(nome+", vimos que você não possui a idade suficiente para prosseguirmos com o nosso atendimento. Logo,"
            +" finalizamos o nosso diálogo, obrigado.");
        }
    }   
}
    
