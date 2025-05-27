public class Porta{
    private String cor;
    private int altura;
    private int largura;
    private boolean estaAberta;

    public Porta(String cor, int altura, int largura, boolean estaAberta){
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
        this.estaAberta = estaAberta;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String novaCor){
        this.cor = novaCor;
    }

    public int getAltura(){
        return altura;
    }

    public void setAltura(int novaAltura){
        this.altura = novaAltura;
    }

    public int getLargura(){
        return largura;
    }

    public void setLargura(int novaLargura){
        this.largura = novaLargura;
    }

    public boolean getEstaAberta(){
        return estaAberta;
    }

    public void setEstaAberta(boolean novaEstaAberta){
        this.estaAberta = novaEstaAberta;   
    }

    public String toString(){
        return String.format("Cor: %s, Altura: %d, Largura: %d, Esta Aberta: %s", cor, altura, largura, estaAberta ? "sim" : "não");
    }
}