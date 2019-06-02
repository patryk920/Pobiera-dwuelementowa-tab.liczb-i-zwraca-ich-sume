/*Napisz metodę pobierającą dwuelementową tablicę liczb i zwracający ich sumę.

 */
public class metoda {
    static int[] tablica = new int[]{53,100};

   private static int suma(int[] tablica) {

        int wynik =tablica[0] + tablica[1];
        return wynik;
    }
    public static void main(String[] args) {
        System.out.println(suma(tablica));


    }
}