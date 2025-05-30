public class Calendario{

    private int dia; 
    private int mes;
    private int ano;

    public Calendario (int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String nomeMes(int m){
        switch(m) {
            
            case 1: return "janeiro";
            case 2: return "fevereiro";
            case 3: return "março";
            case 4: return "abril";
            case 5: return "maio";
            case 6: return "junho";
            case 7: return "julho";
            case 8: return "agosto";
            case 9: return "setembro";
            case 10: return "outubro";
            case 11: return "novembro";
            case 12: return "dezembro";
            default: return "mês inválido";
       }
    }

    public void mostrarData( ){
        String nomeMes = nomeMes(this.mes);
        System.out.println(dia + " de " + nomeMes + " de " + ano);

    }

    public void anoBissexto(){

        if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
            System.out.println(ano +" O ano é bissexto ");
        } else {
            System.out.println(ano + " O ano não é bissexto ");
        }
    
    }

}
