public class Notatka {
    //prtotected dla potomncyh, privite tylko do klasy
   private static int licznikNotatek;
   private int indentyfikatorNotatki;
   protected String tytulNotatki;
   protected String TrescNotatki;

    public Notatka(String tytulNotatki, String trescNotatki) {
        licznikNotatek++;
        indentyfikatorNotatki = licznikNotatek;
        this.tytulNotatki = tytulNotatki;
        TrescNotatki = trescNotatki;
    }
    public void  wyswietlTresc(){
        System.out.println("tytul " +tytulNotatki +" tresc "+ TrescNotatki);
    }
    public void diagnostyczna(){
        System.out.println(tytulNotatki+", "+ TrescNotatki + ", " + licznikNotatek+", "+ indentyfikatorNotatki);
    }
}
