public class PrincipalPorta{
    public static void main(String arg[]){
        Porta p = new Porta("rosa", 9, 2, false);
        System.out.println(p);
        p.setEstaAberta(true);
        System.out.println(p);
    }
}