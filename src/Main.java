import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Wprowadź dwie liczby: ");
        Scanner klawiatura = new Scanner(System.in);
        int a = klawiatura.nextInt();
        int b = klawiatura.nextInt();

        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b = b-a;
            }
        }
        System.out.println("Liczba: "+a+", "+b);
    }
}