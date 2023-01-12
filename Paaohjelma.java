
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Database database= new Database();
        
        Kayttoliittyma kayttoliittyma=new Kayttoliittyma(lukija,database);
        kayttoliittyma.kaynnista();
    }
}
