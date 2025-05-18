public class Funcionário{

    private int codigo;
    private String nome;
    private String CPF;
    private String endereco;
    private int telefone;
    private int idade;
    private float salario;

    public Funcionário(int codigo, String nome, String CPF, String endereco, int telefone, int idade, float salario){
        this.codigo = codigo;
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getIdade() {
        return idade;
    }

    public float getSalario() {
        return salario;
    }

    public void setCodigo(int novoCodigo){
        this.codigo = novoCodigo;
    }
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
    }

    public void setTelefone(int novoTelefone) {
        this.telefone = novoTelefone;
    }

    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public void setSalario(float novoSalario) {
        this.salario = novoSalario;
    }

    public float calculaSalarioLiquido(){
        return salario - (salario * 0.11f);
    }

    public String MostraDados(){
        return "Dados do funcionário: Código: " + codigo + 
        " nome:" + nome + 
        " CPF:" +  CPF + 
        " Endereço:" + endereco + 
        " Telefone:" + telefone + 
        " Idade:" + idade + 
        " Salário:"  + salario + " Salário Líquido: " + calculaSalarioLiquido();
    }

    public void imprimir(){
        System.out.println(MostraDados());
    }
    
}