import java.util.Scanner;

public class Historia {
    public static void main(String[] args) throws Exception {
        System.out.println("Ana e Malu são mais que irmãs, são melhores amigas. Ambas estão no auge da adolescência e desfrutam "
        +"das nuances da juventude como ninguém.\nMalu é tenista desde os seus 5 anos, incentivada pela mãe que queria um futuro "
        +"brilhante para a sua filha preferida. Ela sempre foi muito dedicada à sua vocação, tornando-se uma das melhores do esporte"
        +" na cidade. Ainda assim, tirava um tempo para viver um grande romance com Rodrigo, seu amor de longa data. Logo, a tenista "
        +"tinha uma vida de invejar, bem próximo ao que chamamos de 'perfeição'.\n\nAna sempre foi muito centrada aos estudos, ia todos"
        +" os domingos à igreja, vivia uma vida de uma jovem incomum para a sua pouco idade. Ela nunca foi muito adorada pela mãe, "
        +"assim como a sua irmã Malu, mas sempre se esforçou para receber o mesmo carinho. A sua adolescência era incomum, não gostava "
        +"de festas ou de namorinhos, o seu foco sempre foi tirar ótimas notas e ser muito responsável com tudo e todos.\nApesar das "
        +"divergências nas personalidades de Ana e Malu, o amor entre as duas irmãs superava qualquer obstáculo. Porém, algo pode mudar "
        +"o rumo das suas histórias, destríndo, ou não, para sempre este elo.\nMalu recebe uma grande oportunidade para participar do "
        +"maior campeonato de tênis da América Latina. Seu sonho estava preste a se realizar e toda sua família vibrava com esse incrível"
        +" momento, inclusive a sua irmã Ana.\n\nChega o grande dia e Malu segue viagem a cidade do esperado campeonato.\nDigite (1) "
        +"para que Malu prossiga a viagem ou Digite (2) para que ela não continue:");
        int malu;
        Scanner novela = new Scanner(System.in);
        malu = novela.nextInt();
        if (malu==1){
            System.out.println("Um grave acidente acontece e todos os sonhos de Malu vão por água a baixo. Sua família está no hospital"
            +" a espera de uma notícia do seu estado de saúde. E o pior parece acontecer, Malu entre em um coma profundo, os médicos não"
            +" apresentam nenhuma esperança à Ana e Rodrigo, que não sairam do lado de Malu nem por um segundo.\n\nDigite qual rumo da"
            +" história você deseja seguir: Ana e Rodrigo ou Malu e Rodrigo.");
            String ana = "ana e rodrigo";
            String rodrigo = "ANA E RODRIGO";
            String malue = "malu e rodrigo";
            String erodrigo = "MALU E RODRIGO";
            try (Scanner suspense = new Scanner(System.in)) {
                ana = suspense.nextLine();
            }
            if (ana=="ana e rodrigo"){
                System.out.println((ana).equalsIgnoreCase(rodrigo));
                System.out.println("Anos se passaram...\nMalu continua em coma após 5 anos do terrivél acidente. Mas o que a história"
                +" não esperava era que nesse tempo todo de visitas aos hospitais e trocas de turno para ficar com Malu, Ana e Rodrigo"
                +" se apaixonaram. Os dois passaram anos relutando essa paixão que crescia cada dia mais em seus corações, porque o medo "
                +"era maior. E se Malu acordasse?\nO então sonho da família em ver Malu acordar, se tornava um pesadelo. Como a tenista"
                +" com a vida perfeita reagiria ao saber que se passaram anos e ela não seria mais uma menininha, nem tão pouco teria o "
                +"seu grande amor como namorado. Além disso, qual caminho teria o amor de irmãs entre Ana e ela...(próximo capitulo)");

            }else if(ana=="malu e rodrigo"){
                System.out.println((malue).equalsIgnoreCase(erodrigo));
                System.out.println("Malu finalmente acorda do coma. Abre os olhos e se vê confusa com tantas pessoas ao seu redor. "
                +"Ana, Rodrigo e a sua mãe estão próximos a sua cama de hospital.\nHoras após o seu acordar, o médico aparece um pouco "
                +"abatido e aos mesmo tempo esperançoso. Malu recebe a notícia de que está tudo bem com o seu bebê. O espanto no rosto "
                +"de todos é cada vez maior, principalmente da sua mãe, que não parece estar nem um pouco contente, após anos projetando "
                +"a vida de Malu.\nE agora? qual seria o destino da tenista de sucesso?");

            }

        }else{
            System.out.println("Malu chega ao seu destino e se depara com milhares de fãs a sua espera. A tenista já estava acostumada"
            +" a ter holofortes a sua volta.\nChegando a hora do jogo, Malu começa a ter forte crises de ansiedade e só havia uma coisa que"
            +" poderia lhe acalmar...");
        }

    }
    
}
