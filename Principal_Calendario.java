public class Principal_Calendario{
    public static void main(String[] args) {
        Calendario data1 = new Calendario(14, 5, 2024);
        Calendario data2 = new Calendario(1, 1, 2023);

        System.out.println("Data 1:");
        data1.mostrarData();
        data1.anoBissexto();

        System.out.println();

        System.out.println("Data 2:");
        data2.mostrarData();
        data2.anoBissexto();
    }
}