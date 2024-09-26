public class Main {
    public static void main(String[] args) {

       Notatka notatka1 = new Notatka("przygotowanie", "przygotowanie do egzaminu");
       Notatka notatka2 = new Notatka("przygotowanie2", "2 przygotowanie do egzaminu");
       notatka1.diagnostyczna();
       notatka2.diagnostyczna();
       notatka1.wyswietlTresc();
       notatka2.wyswietlTresc();
    }
}