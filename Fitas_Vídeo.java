public class Fitas_Vídeo{

    private String titulo;
    private float preco;

    public Fitas_Vídeo(String titulo, float preco){
        this.titulo = titulo;
        this.preco = preco;
    }

    public String getTitulo(){
        return titulo;
    }

    public float getPreco(){
        return preco;
    }

    public float getValorAluguel(int numeroDeDiasAlugada){
        return preco * numeroDeDiasAlugada;
    }

    public void imprimir(int numeroDeDiasAlugada){
        System.out.println("Título: " + titulo);
        System.out.println("Preço: " + getValorAluguel(5));
    }

    
}