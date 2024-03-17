import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Podaj liczbę: ");
        Scanner sc=new Scanner(System.in);
        int liczba=sc.nextInt();

        if (liczba<0){
            System.out.println("Liczba "+liczba+" jest ujemna");
        } else if (liczba>0) {
            System.out.println("Liczba "+liczba+" jest dodatnia");
        } else {
            System.out.println("Liczba "+liczba+" jest równa 0");
        }
    }
}