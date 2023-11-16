package oop;

public class Loops {
    static String[] tablica;
    public static void main(String[] args) {
        tablica = new String[3];
        String str1 = "Ala ";
        String str2 = "ma ";
        String str3 = "kota";
        tablica[0] = str1;
        tablica[1] = str2;
        tablica[2] = str3;

        for (String s : tablica) {
            System.out.println(s);
        }

        for (int counter = 1; counter <= 10; counter++) {
            System.out.println("wow! " + counter);
        }
        int counter = 1;
        while (counter <= 10) {
            System.out.println("help! " + counter);
            counter++;
        }
    }
}
