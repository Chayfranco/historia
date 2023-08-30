package src;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class CapituloImagem extends Capitulo{

    protected String imagem;


    public CapituloImagem(Map<String, Personagem> personagens, Scanner escaneadorDoConsole, Scanner escaneadorDeArquivo) 
  {
    super();
    this.LerCapitulo(personagens, escaneadorDeArquivo);
    this.escaneador = escaneadorDoConsole;
    this.escolhas = new ArrayList<Escolha>();
  }

    @Override
    protected void LerCapitulo(Map<String, Personagem> personagens, Scanner escaneadorDeArquivo) 
    {
    escaneadorDeArquivo.nextLine();
    String linha = escaneadorDeArquivo.nextLine();
    this.imagem = "";
   
    while (!linha.equals("FIM_IMAGEM")) {
      this.imagem= imagem + "\n" + linha;
      linha = escaneadorDeArquivo.nextLine();
        }
      
    }
    @Override
    protected void mostrar(){
        System.out.println("---");
        System.out.println(this.imagem);
        super.mostrar();
        
    
        
    }

  
}