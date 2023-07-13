import java.util.Scanner;

public class Historia {
    public static void main(String[] args) throws Exception {

        Personagem malu = new Personagem("Malu", 23, 100);
        Personagem personagem = new Personagem();
        Capitulo capitulo1 = new Capitulo("Capítulo 1", "Um grave acidente acontece e todos os sonhos de Malu vão por água abaixo. Sua família está no hospital à espera de uma notícia do seu estado de saúde. E o pior parece acontecer, Malu entra em um coma profundo, os médicos não apresentam nenhuma esperança à Ana e Rodrigo, que não saíram do lado de Malu nem por um segundo.\n\nDigite qual rumo da história você deseja seguir:", new String[]{"1","2"}, malu, -10);

        Capitulo capitulo2 = new Capitulo("Capítulo 2", "Anos se passaram...\nMalu continua em coma após 5 anos do terrível acidente. Mas o que a história não esperava era que nesse tempo todo de visitas aos hospitais e trocas de turno para ficar com Malu, Ana e Rodrigo se apaixonaram. Os dois passaram anos relutando essa paixão que crescia a cada dia mais em seus corações, porque o medo era maior. E se Malu acordasse?\nO então sonho da família em ver Malu acordar, se tornava um pesadelo. Como a tenista com a vida perfeita reagiria ao saber que se passaram anos e ela não seria mais uma menininha, nem tão pouco teria o seu grande amor como namorado. Além disso, qual caminho teria o amor de irmãs entre Ana e ela...", new String[]{"1", "2"}, malu, -10);
        Capitulo capitulo3 = new Capitulo("Capítulo 2", "Malu finalmente acorda do coma. Abre os olhos e se vê confusa com tantas pessoas ao seu redor. Ana, Rodrigo e a sua mãe estão próximos à sua cama de hospital.\nHoras após o seu acordar, o médico aparece um pouco abatido e ao mesmo tempo esperançoso. Malu recebe a notícia de que está tudo bem com o seu bebê. O espanto no rosto de todos é cada vez maior, principalmente da sua mãe, que não parece estar nem um pouco contente, após anos projetando a vida de Malu.\nE agora? Qual seria o destino da tenista de sucesso?", new String[]{"1","2"}, malu, +10);
        Capitulo capitulo4 = new Capitulo("Capítulo 1", "Após receber a incrível oportunidade de participar do maior campeonato de tênis da América Latina, Malu estava prestes a embarcar em uma viagem que poderia realizar seu sonho. No entanto, uma forte intuição a fez questionar se era o momento certo. Com coragem, ela decidiu não seguir adiante, optando por priorizar sua saúde e bem-estar. Essa escolha inesperada abriu novos caminhos para Malu, permitindo que ela descobrisse novas paixões e vivesse uma vida cheia de propósito e felicidade, ao lado de Ana e Rodrigo.", null, malu, +20);

        Capitulo capitulo4Escolha1 = new Capitulo("Capítulo 3", "No meio da multidão de fãs, Malu encontra um antigo amigo de infância que sempre soube acalmar seus nervos: seu cachorro de estimação, Bolt. O reencontro traz uma onda de tranquilidade e confiança à tenista. Com Bolt ao seu lado, ela consegue superar as crises de ansiedade e brilha no jogo, conquistando a vitória e o coração dos fãs.\n\nA história continua...\n\nMalu se torna uma sensação no mundo do tênis e continua conquistando títulos. Sua história inspiradora de superação e determinação inspira muitas pessoas ao redor do mundo. Ela aproveita sua fama e influência para promover ações sociais e ajudar instituições de caridade. Ao mesmo tempo, sua relação com Ana e Rodrigo se fortalece, e eles formam uma família unida e feliz. Juntos, eles enfrentam os desafios da fama e encontram um equilíbrio entre suas vidas pessoais e profissionais.\n\nFIM.", null, personagem, +10);
        Capitulo capitulo4Escolha2 = new Capitulo("Capítulo 3", "No meio da multidão de fãs, Malu sente um misto de ansiedade e medo se aproximarem. Ela não se sente pronta para enfrentar a pressão do jogo e as expectativas dos fãs. No entanto, Ana surge ao seu lado e oferece seu apoio incondicional. Com a presença reconfortante da irmã, Malu ganha coragem e decide seguir em frente, mesmo com as adversidades. Juntas, elas enfrentam o desafio e descobrem a força que a união pode proporcionar.\n\nA história continua...", new String[]{"1","2"}, malu, +10);

        System.out.println("Bem-vindo(a) à história de Malu, Ana e Rodrigo!\n");
        System.out.println("Nesta aventura emocionante, você irá acompanhar a vida de Malu, uma talentosa tenista que vê seus sonhos serem interrompidos por um grave acidente. Após entrar em um coma profundo, sua família, composta por Ana e Rodrigo, aguarda ansiosamente por notícias sobre seu estado de saúde.\n");
        System.out.println("Ao longo da história, você terá o poder de fazer escolhas que irão influenciar o destino dos personagens. Será que Ana e Rodrigo seguirão suas vidas separadamente, ou o amor irá florescer entre eles? E quando Malu finalmente acordar do coma, como ela irá reagir às mudanças que aconteceram durante seu período de inconsciência?\n");
        System.out.println("Prepare-se para mergulhar em um enredo cheio de reviravoltas, emoções intensas e decisões que moldarão o futuro dos personagens. Suas escolhas determinarão os caminhos que a história irá tomar, revelando os desafios, os amores e as surpresas que aguardam Malu, Ana e Rodrigo.\n");
        System.out.println("Boa sorte e aproveite essa incrível jornada!");


       String introducao = "Malu tem apenas 23 anos. Tenista desde os 5 anos, incentivada pela mãe que queria um futuro"
        + " brilhante para sua filha preferida, sempre foi muito dedicada à sua vocação, tornando-se uma das melhores do esporte"
        + " na cidade. Ainda assim, tirava um tempo para viver um grande romance com Rodrigo, de 25 anos, seu amor de longa data. Logo, a tenista "
        + "tinha uma vida a ser invejada, muito próxima ao que chamamos de 'perfeição'.\n\nAna tem 22 anos, sempre foi muito centrada nos estudos, ia todos"
        + " os domingos à igreja, vivia uma vida incomum para sua pouca idade. Ela nunca foi muito adorada pela mãe, "
        + "assim como sua irmã Malu, mas sempre se esforçou para receber o mesmo carinho. Sua adolescência era incomum, não gostava "
        + "de festas ou de namorinhos, seu foco sempre foi tirar ótimas notas e ser muito responsável com tudo e todos.\nApesar das "
        + "divergências nas personalidades de Ana e Malu, o amor entre as duas irmãs superava qualquer obstáculo. Porém, algo pode mudar "
        + "o rumo de suas histórias, destruindo, ou não, para sempre esse elo.\nMalu recebe uma grande oportunidade para participar do "
        + "maior campeonato de tênis da América Latina. Seu sonho estava prestes a se realizar e toda sua família vibrava com esse incrível"
        + " momento, inclusive sua irmã Ana.\nDigite (1) para que Malu prossiga a viagem ou digite (2) para que ela não continue:";

        Capitulo ind = new Capitulo("Contexto: ", introducao, new String[]{"1","2"}, null, 0);
        ind.mostrar();
        Scanner scanner = new Scanner(System.in);
        int escolha = ind.escolher(scanner);


        if (escolha == 0) {
            capitulo1.mostrar();
            int anae = capitulo1.escolher(scanner);
            if (anae == 0) {
                capitulo2.mostrar();
                int caminhoCapitulo2 = capitulo2.escolher(scanner);

                if (caminhoCapitulo2 == 1) {
                    capitulo4Escolha1.mostrar();
                } else if (caminhoCapitulo2 == 2) {
                    capitulo4Escolha2.mostrar();
                }
            }else if (anae == 1) {
                capitulo3.mostrar();
                int caminhoCapitulo4 = capitulo3.escolher(scanner);

                if (caminhoCapitulo4 == 0) {
                    capitulo4Escolha1.mostrar();
                } else if (caminhoCapitulo4 == 1) {
                    capitulo4Escolha2.mostrar();
                }
            }

        }else if (escolha == 1) {
            capitulo4.mostrar();
        
        }

        scanner.close();
        
    }

    
}




