public class Personagem{
    String nome;
    int idade;
    int energia;

public Personagem(String nome, int idade, int energia){
    this.nome = nome;
    this.idade = idade;
    this.energia = energia;
}
boolean mudanca(int mudanca){
    boolean destino = true;
    this.energia += mudanca;

    if (energia<=0){
        this.energia = 0;
        System.out.println(this.nome + " mudou a sua energia para " + this.energia);
        destino = false;
        return destino;
    } else if(energia>100){
        this.energia = 100;
        System.out.println(this.nome + " mudou a sua energia para " + this.energia);
        destino = false;
        return destino;

    } else{
        System.out.println(this.nome + ", a sua energia é de " + this.energia);
        return destino;
    }


}
}