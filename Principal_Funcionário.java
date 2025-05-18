public class Principal_Funcionário{
    public static void main(String[] args){
        Funcionário f = new Funcionário(4002 , "Paola", "40048922679", "Guarabira", 40028922, 16, 2000);
        f.imprimir();
        f.setSalario(2019);
        f.imprimir();
    }
}