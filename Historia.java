import java.util.Scanner;

public class Historia {
    public static void main(String[] args) throws Exception {
        Personagem malu = new Personagem("Malu", 23, 100);
        malu.nome = "Malu";
        malu.idade = 23;
        malu.energia = 100;
        
        Personagem ana = new Personagem("Ana", 22, 100);
        ana.nome = "Ana";
        ana.idade = 22;
        ana.energia = 100;
        
        Personagem rodrigo = new Personagem("Rodrigo", 25, 100);
        rodrigo.nome = "Rodrigo";
        rodrigo.idade = 25;
        rodrigo.energia = 100;

        System.out.format("%s tem apenas %d anos. Tenista desde os 5 anos, incentivada pela mãe que queria um futuro"
            +" brilhante para sua filha preferida, sempre foi muito dedicada à sua vocação, tornando-se uma das melhores do esporte"
            +" na cidade. Ainda assim, tirava um tempo para viver um grande romance com %s, de %d anos, seu amor de longa data. Logo, a tenista "
            +"tinha uma vida a ser invejada, muito próxima ao que chamamos de 'perfeição'.\n\n%s tem %d anos, sempre foi muito centrada nos estudos, ia todos"
            +" os domingos à igreja, vivia uma vida incomum para sua pouca idade. Ela nunca foi muito adorada pela mãe, "
            +"assim como sua irmã Malu, mas sempre se esforçou para receber o mesmo carinho. Sua adolescência era incomum, não gostava "
            +"de festas ou de namorinhos, seu foco sempre foi tirar ótimas notas e ser muito responsável com tudo e todos.\nApesar das "
            +"divergências nas personalidades de Ana e Malu, o amor entre as duas irmãs superava qualquer obstáculo. Porém, algo pode mudar "
            +"o rumo de suas histórias, destruindo, ou não, para sempre esse elo.\nMalu recebe uma grande oportunidade para participar do "
            +"maior campeonato de tênis da América Latina. Seu sonho estava prestes a se realizar e toda sua família vibrava com esse incrível"
            +" momento, inclusive sua irmã Ana.\n\nChega o grande dia e Malu segue viagem à cidade do esperado campeonato.\nDigite (1) "
            +"para que Malu prossiga a viagem ou digite (2) para que ela não continue:", malu.nome, malu.idade, rodrigo.nome, rodrigo.idade, ana.nome, ana.idade);
        
        Scanner scanner = new Scanner(System.in);
        int maluu = scanner.nextInt();
        scanner.nextLine();

        if (maluu == 1) {
            System.out.format("Um grave acidente acontece e todos os sonhos de Malu vão por água abaixo."
            +" Sua família está no hospital a espera de uma notícia do seu estado de saúde. E o pior parece acontecer, Malu entra em um coma profundo, os médicos não"
            +" apresentam nenhuma esperança à Ana e Rodrigo, que não saíram do lado de Malu nem por um segundo.\n\nDigite qual rumo da"
            +" história você deseja seguir: Ana e Rodrigo (não) ou Malu e Rodrigo(sim):");
            malu.mudanca(-50);
            String anae = scanner.next().toLowerCase();


            if (anae.equals("nao")) {
                System.out.format("Anos se passaram...\nMalu continua em coma após 5 anos do terrível acidente. Mas o que a história"
                +" não esperava era que nesse tempo todo de visitas aos hospitais e trocas de turno para ficar com Malu, Ana e Rodrigo"
                +" se apaixonaram. Os dois passaram anos relutando essa paixão que crescia cada dia mais em seus corações, porque o medo "
                +"era maior. E se Malu acordasse?\nO então sonho da família em ver Malu acordar, se tornava um pesadelo. Como a tenista"
                +" com a vida perfeita reagiria ao saber que se passaram anos e ela não seria mais uma menininha, nem tão pouco teria o "
                +"seu grande amor como namorado. Além disso, qual caminho teria o amor de irmãs entre Ana e ela...");
                malu.mudanca(-50);

            } else if (anae.equals("sim")) {
                System.out.format("Malu finalmente acorda do coma. Abre os olhos e se vê confusa com tantas pessoas ao seu redor. "
                +"Ana, Rodrigo e a sua mãe estão próximos à sua cama de hospital.\nHoras após o seu acordar, o médico aparece um pouco "
                +"abatido e ao mesmo tempo esperançoso. Malu recebe a notícia de que está tudo bem com o seu bebê. O espanto no rosto "
                +"de todos é cada vez maior, principalmente da sua mãe, que não parece estar nem um pouco contente, após anos projetando "
                +"a vida de Malu.\nE agora? Qual seria o destino da tenista de sucesso?");
                
                malu.mudanca(+25);
            }

        } else {
            System.out.format("Malu chega ao seu destino e se depara com milhares de fãs à sua espera. A tenista já estava acostumada"
            +" a ter holofotes à sua volta.\nChegando a hora do jogo, Malu começa a ter fortes crises de ansiedade e só havia uma coisa que"
            +" poderia lhe acalmar...");
            malu.mudanca(+35);
        }

        scanner.close();
    }
}