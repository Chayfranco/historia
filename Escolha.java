public class Escolha {
    private String texto;
    private Capitulo pcapitulo;

public Escolha(String texto, Capitulo pcapitulo){
    this.texto = texto;
    this.pcapitulo = pcapitulo;
}
    public String getTexto(){
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Capitulo getPcapitulo() {
        return this.pcapitulo;
    }

    public void setPcapitulo(Capitulo pcapitulo) {
        this.pcapitulo = pcapitulo;
    }


}
